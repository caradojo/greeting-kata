import Test.Hspec

main :: IO ()
main = hspec $
  describe "greeting" $ do
    it "does ..." $
        1 `shouldBe` 2
