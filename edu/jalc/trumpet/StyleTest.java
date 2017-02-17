package edu.jalc.trumpet;

class StyleTest{
   
   public void testGetModelNumber() throws Exception {
      System.out.println("Testing Style::getModelNumber");
      Style style = new Style(null);
      assert(style.getModelNumber() == 33495);
   }
   
   public static void main(String[] args) throws Exception{
      StyleTest styleTest = new StyleTest();
      styleTest.testGetModelNumber();
      System.out.println("StyleTest complete");
   }
}