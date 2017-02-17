package edu.jalc.trumpet.color;

public class ColorTest{
   
   public void testGetColorValue() throws Exception {
      System.out.println("Testing Color::getColorValue");
      Color color = new Color(4);
      assert(color.getColorValue() == 4);
   }
   
   public static void main(String[] args) throws Exception{
      ColorTest colorTest = new ColorTest();
      colorTest.testGetColorValue();
      System.out.println("ColorTest complete");
   }
}