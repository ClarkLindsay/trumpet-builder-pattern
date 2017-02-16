package edu.jalc.trumpet;

class MouthPiece {

   private Style mouthPieceStyle;
   private Height mouthPieceHeight;

   MouthPiece() {
      mouthPieceStyle = null;
      mouthPieceHeight = null;
   } 
      
   void setStyle(Style style) throws Exception {
      if(style == null) 
         throw new Exception("Style cannot be null");
      
      mouthPieceStyle = style;
   }
   
   void setHeight(Height height) throws Exception {
      if(height == null) 
         throw new Exception("Height cannot be null");
      
      mouthPieceHeight = height;
   }
   
   public Style getStyle(){
      return mouthPieceStyle;
   }
   
   public Height getHeight(){
      return mouthPieceHeight;
   } 
}