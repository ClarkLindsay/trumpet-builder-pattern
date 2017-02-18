package edu.jalc.trumpet.materialProperties.color;

public class Color {

   private final int red;
   private final int green;
   private final int blue;

   private Color(){
      this.red = this.green = this.blue = 0;
   }

   public Color(int red, int green, int blue){
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public int getRed() {
      return red;
   }

   public int getGreen() {
      return green;
   }

   public int getBlue() {
      return blue;
   }
}