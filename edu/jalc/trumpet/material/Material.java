package edu.jalc.trumpet.material;

import edu.jalc.trumpet.materialProperties.color.Color;
import edu.jalc.trumpet.materialProperties.etching.Etching;

public class Material {

   private final Color trumpetColor;
   private Etching trumpetEtching;
      
   public Material(Color trumpetColor, Etching trumpetEtching) {
      this.trumpetColor = trumpetColor;
      this.trumpetEtching = trumpetEtching;
   }
      
   void setEtching(Etching trumpetEtching){ 
      this.trumpetEtching = trumpetEtching;
   }
      
   Color  getColor(){ 
      return trumpetColor; 
   }
   
   Etching getEtching(){
      return trumpetEtching;
   }
}