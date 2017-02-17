package edu.jalc.trumpet.material;

import edu.jalc.trumpet.materialProperties.color.Color;
import edu.jalc.trumpet.materialProperties.etching.Etching;

public class Material {

   private Color trumpetColor;
   private Etching trumpetEtching;
      
   public Material(Color trumpetColor, Etching trumpetEtching) {
      this.trumpetColor = trumpetColor;
      this.trumpetEtching = trumpetEtching;
   }
   
   void setColor(Color color) throws Exception {
      if(color == null) 
         throw new Exception("Color cannot be null");
      
      trumpetColor = color;
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