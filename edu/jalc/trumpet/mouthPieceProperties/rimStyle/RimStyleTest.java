package edu.jalc.trumpet.mouthPieceProperties.rimStyle;

public class RimStyleTest{
   
   public void testGetRimWidth() throws Exception {
      System.out.println("Testing Style::getRimWidth");
      RimStyle style = new RimStyle(3);
      assert(style.getRimWidth() == 3);
   }
   
   public static void main(String[] args) throws Exception{
      RimStyleTest styleTest = new RimStyleTest();
      styleTest.testGetRimWidth();
      System.out.println("StyleTest complete");
   }
}