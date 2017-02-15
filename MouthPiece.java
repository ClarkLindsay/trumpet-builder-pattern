package JohnALogan.Spring2017.CPS206.Labs.POJO.Trumpet;

class MouthPiece {

   private Style mouthPieceStyle;
   private Height mouthPieceHeight;

   private MouthPiece() throws Exception{
      setStyle(null);
      setHeight(null);
   }

   MouthPiece(Style style, Height height) {
      mouthPieceStyle = style;
      mouthPieceHeight = height;
   } 
      
   Style setStyle(Style style) throws Exception {
      if(style == null) 
         throw new Exception("Style cannot be null");
      
      mouthPieceStyle = style;
      
      return mouthPieceStyle;
   }
   
   Height setHeight(Height height) throws Exception {
      if(height == null) 
         throw new Exception("Height cannot be null");
      
      mouthPieceHeight = height;
      
      return mouthPieceHeight;
   }
   
   public Style getStyle(){
      return mouthPieceStyle;
   }
   
   public Height getHeight(){
      return mouthPieceHeight;
   } 
}