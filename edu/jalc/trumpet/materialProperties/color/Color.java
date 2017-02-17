package edu.jalc.trumpet.materialProperties.color;

public class Color {

   private final int colorValue;

   private Color() {
      colorValue = 0;
   }
   
   public Color(int colorValue){
      this.colorValue = colorValue;
   }
   
   public int getColorValue(){
      return colorValue;
   }
}