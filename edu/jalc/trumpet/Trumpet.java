package edu.jalc.trumpet;

class Trumpet {

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
   
   private Trumpet() throws Exception {
      setMaterial(null);
      setMouthPiece(null);
   }
      
   Trumpet(Material material, MouthPiece mouthPiece) {
      trumpetMaterial = material;
      trumpetMouthPiece = mouthPiece;
   }

   void setMaterial(Material material) throws Exception {
      if(material == null) 
         throw new Exception("Material cannot be null");
      
      trumpetMaterial = material;
   }

   MouthPiece setMouthPiece(MouthPiece mouthPiece) throws Exception{
      if(mouthPiece == null) 
         throw new Exception("MouthPiece cannot be null");
   
      trumpetMouthPiece = mouthPiece;
      
      return trumpetMouthPiece;
   }
   
   Material getMaterial(){	
      return trumpetMaterial; 
   }
      
   MouthPiece getMouthPiece(){ 
      return trumpetMouthPiece; 
   }
}