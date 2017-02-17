package edu.jalc.trumpet.brand;

public class StyleTest{
   
   public void testGetModelNumber() throws Exception {
      System.out.println("Testing Style::getModelNumber");
      Style style = new Style(33495);
      assert(style.getModelNumber() == 33495);
   }
   
   public static void main(String[] args) throws Exception{
      StyleTest styleTest = new StyleTest();
      styleTest.testGetModelNumber();
      System.out.println("StyleTest complete");
   }
}