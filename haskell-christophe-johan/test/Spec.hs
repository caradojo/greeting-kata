import Test.Hspec

import Data.Maybe
import Data.Char
import Data.List as L

greet :: Maybe String -> String
greet Nothing = "Hello, my friend"
greet (Just name) = if L.all isUpper name  
  then "HELLO " ++ name ++ "!"
  else "Hello " ++ name

greet2 :: Either [String] (Maybe String) -> String
greet2 (Right m) = greet m
greet2 (Left names@(n:m:ns)) = "Hello, " ++ allButLast1 ++ " and " ++ lastName1 where
  [lastName1 : allButLast1] :: [String ]
  [lastName1 : allButLast1] = reverse names
  allButLast = "Jill"
  lastName = "Jane"
greet2 (Left (n:ns)) = "Hello, " ++ n
greet2 (Left ns) = "Hello, " ++ (intercalate " and " ns)

main :: IO ()
main = hspec $
  describe "greeting" $ do
    it "greeting Bob should display Hello Bob" $
      greet2 (Right (Just "Bob")) `shouldBe` "Hello Bob"

    it "if name is null we should display Hello, my friend" $
      greet Nothing `shouldBe` "Hello, my friend"

    it "if name is uppercase we should display greeting in uppercase" $ 
      greet (Just "JERRY") `shouldBe` "HELLO JERRY!"
    it "if name is uppercase we should display greeting in uppercase" $ 
      greet (Just "BOB") `shouldBe` "HELLO BOB!"
  
    it "greets everyone in a list" $ 
      greet2 (Left ["John"]) `shouldBe` "Hello, John"
    it "greets everyone in a list" $ 
      greet2 (Left ["Jill"]) `shouldBe` "Hello, Jill"
    it "greets everyone in a list" $ 
      greet2 (Left ["Jill",  "Jane"]) `shouldBe` "Hello, Jill and Jane"
