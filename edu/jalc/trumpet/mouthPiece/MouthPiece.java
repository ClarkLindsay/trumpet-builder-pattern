package edu.jalc.trumpet.mouthPiece;

import edu.jalc.trumpet.mouthPieceProperties.rimStyle.RimStyle;
import edu.jalc.trumpet.mouthPieceProperties.boreSize.BoreSize;

public class MouthPiece {

   private RimStyle style;
   private BoreSize mouthPieceBoreSize;

   public MouthPiece(RimStyle style, BoreSize mouthPieceBoreSize) throws Exception{
      setStyle(style);
      setBoreSize(mouthPieceBoreSize);
   } 
      
   void setStyle(RimStyle style) throws Exception {
      if(style == null) 
         throw new Exception("Style cannot be null");
      
      this.style = style;
   }
   
   void setBoreSize(BoreSize boreSize) throws Exception {
      if(boreSize == null) 
         throw new Exception("BoreSize cannot be null");
      
      mouthPieceBoreSize = boreSize;
   }
   
   public RimStyle getRimStyle(){
      return style;
   }
   
   public BoreSize getBoreSize(){
      return mouthPieceBoreSize;
   } 
}