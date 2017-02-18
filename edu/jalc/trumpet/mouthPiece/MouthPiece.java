package edu.jalc.trumpet.mouthPiece;

import edu.jalc.trumpet.mouthPieceProperties.rimStyle.RimStyle;
import edu.jalc.trumpet.mouthPieceProperties.boreSize.BoreSize;

public class MouthPiece {

   private RimStyle style;
   private BoreSize mouthPieceBoreSize;

   public MouthPiece(RimStyle style, BoreSize mouthPieceBoreSize) {
      setStyle(style);
      setBoreSize(mouthPieceBoreSize);
   } 
      
   void setStyle(RimStyle style) {   
      this.style = style;
   }
   
   void setBoreSize(BoreSize boreSize) {
      mouthPieceBoreSize = boreSize;
   }
   
   public RimStyle getRimStyle(){
      return style;
   }
   
   public BoreSize getBoreSize(){
      return mouthPieceBoreSize;
   } 
}