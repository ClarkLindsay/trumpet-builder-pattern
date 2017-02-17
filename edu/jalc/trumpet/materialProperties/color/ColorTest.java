package edu.jalc.trumpet.materialProperties.color;

public class ColorTest{
   
   public void testGetColorValue() throws Exception {
      System.out.println("Testing Color::getColorValue");
      Color color = new Color();
      assert(color.getColorValue() == 1);
   }
   
   public static void main(String[] args) throws Exception{
      ColorTest colorTest = new ColorTest();
      colorTest.testGetColorValue();
      System.out.println("ColorTest complete");
   }
}