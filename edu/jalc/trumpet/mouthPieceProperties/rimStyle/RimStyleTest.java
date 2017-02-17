package edu.jalc.trumpet.mouthPieceProperties.rimStyle;

public class RimStyleTest{
   
   public void testGetModelNumber() throws Exception {
      System.out.println("Testing Style::getRimWidth");
      RimStyle style = new RimStyle(33495);
      assert(style.getRimWidth() == 33495);
   }
   
   public static void main(String[] args) throws Exception{
      RimStyleTest styleTest = new RimStyleTest();
      styleTest.testGetModelNumber();
      System.out.println("StyleTest complete");
   }
}