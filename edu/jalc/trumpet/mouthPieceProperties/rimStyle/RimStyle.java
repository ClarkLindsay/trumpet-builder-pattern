package edu.jalc.trumpet.mouthPieceProperties.rimStyle;

public class RimStyle {

   private int rimWidth;

   private RimStyle() {
      rimWidth = 0;
   }
   
   public RimStyle(int rimWidth){
      this.rimWidth = rimWidth;
   }
   
   public int getRimWidth(){
      return rimWidth;
   }
}