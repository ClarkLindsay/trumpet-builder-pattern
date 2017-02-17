package edu.jalc.trumpet.trumpet;

import edu.jalc.trumpet.material.Material;
import edu.jalc.trumpet.mouthPiece.MouthPiece;

class Trumpet {

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
         
   Trumpet(Material trumpetMaterial, MouthPiece trumpetMouthPiece) {
      this.trumpetMaterial = trumpetMaterial;
      this.trumpetMouthPiece = trumpetMouthPiece;
   }

   void setMaterial(Material trumpetMaterial) throws Exception {
      if(trumpetMaterial == null) 
         throw new Exception("Material cannot be null");
      
      this.trumpetMaterial = trumpetMaterial;
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