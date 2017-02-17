package edu.jalc.trumpet;

class Trumpet {

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
         
   Trumpet(Material material, MouthPiece mouthPiece) {
      trumpetMaterial = material;
      trumpetMouthPiece = mouthPiece;
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
      return this.trumpetMaterial; 
   }
      
   MouthPiece getMouthPiece(){ 
      return this.trumpetMouthPiece; 
   }
}