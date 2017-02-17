package edu.jalc.trumpet.color;

public class Color {

   private int colorValue;

   private Color() {
      colorValue = 4;
   }
   
   public Color(int color){
      colorValue = color;
   }
   
   public int getColorValue(){
      return colorValue;
   }
}