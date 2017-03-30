package edu.jalc.trumpet.trumpet;

import edu.jalc.trumpet.material.Material;
import edu.jalc.trumpet.mouthPiece.MouthPiece;
import edu.jalc.trumpet.Polishable;

public class Trumpet implements Playable, Polishable{

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
         
   public Trumpet(Material trumpetMaterial, MouthPiece trumpetMouthPiece) {
      setMaterial(trumpetMaterial);
      setMouthPiece(trumpetMouthPiece);
   }
   
   public void play(){System.out.println("I'm playing");}
   
   public void polish(){System.out.println("I'm polishing");}

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