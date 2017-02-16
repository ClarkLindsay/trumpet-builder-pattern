package edu.jalc.trumpet;

class Trumpet {

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
         
   Trumpet() {
      trumpetMaterial = null;
      trumpetMouthPiece = null;
   }

   void setMaterial(Material material) throws Exception {
      if(material == null) 
         throw new Exception("Material cannot be null");
      
      trumpetMaterial = material;
   }

   void setMouthPiece(MouthPiece mouthPiece) throws Exception{
      if(mouthPiece == null) 
         throw new Exception("MouthPiece cannot be null");
   
      trumpetMouthPiece = mouthPiece;
   }
   
   Material getMaterial(){	
      return trumpetMaterial; 
   }
      
   MouthPiece getMouthPiece(){ 
      return trumpetMouthPiece; 
   }
}