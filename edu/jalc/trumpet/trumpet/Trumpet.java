package edu.jalc.trumpet.trumpet;

import edu.jalc.trumpet.material.Material;
import edu.jalc.trumpet.mouthPiece.MouthPiece;

class Trumpet {

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
         
   Trumpet(Material trumpetMaterial, MouthPiece trumpetMouthPiece) {
      setMaterial(trumpetMaterial);
      setMouthPiece(trumpetMouthPiece);
   }

   void setMaterial(Material trumpetMaterial) {      
      this.trumpetMaterial = trumpetMaterial;
   }

   void setMouthPiece(MouthPiece mouthPiece) {   
      trumpetMouthPiece = mouthPiece;
   }
   
   Material getMaterial(){	
      return this.trumpetMaterial; 
   }
      
   MouthPiece getMouthPiece(){ 
      return this.trumpetMouthPiece; 
   }
}