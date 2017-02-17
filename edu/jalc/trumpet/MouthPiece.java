package edu.jalc.trumpet;

class MouthPiece {

   private Style mouthPieceStyle;
   private BoreSize mouthPieceBoreSize;

   MouthPiece(Style style, BoreSize boreSize) {
      mouthPieceStyle = style;
      mouthPieceBoreSize = boreSize;
   } 
      
   void setStyle(Style style) throws Exception {
      if(style == null) 
         throw new Exception("Style cannot be null");
      
      mouthPieceStyle = style;
   }
   
   void setBoreSize(BoreSize boreSize) throws Exception {
      if(boreSize == null) 
         throw new Exception("BoreSize cannot be null");
      
      mouthPieceBoreSize = boreSize;
   }
   
   public Style getStyle(){
      return mouthPieceStyle;
   }
   
   public BoreSize getBoreSize(){
      return mouthPieceBoreSize;
   } 
}