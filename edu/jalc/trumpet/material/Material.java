package edu.jalc.trumpet.material;

import edu.jalc.trumpet.color.Color;
import edu.jalc.trumpet.etching.Etching;

public class Material {

   private Color trumpetColor;
   private Etching trumpetEtching;
      
   public Material(Color color, Etching etching) {
      trumpetColor = color;
      trumpetEtching = etching;
   }
   
   void setColor(Color color) throws Exception {
      if(color == null) 
         throw new Exception("Color cannot be null");
      
      trumpetColor = color;
   }
   
   void setEtching(Etching etching){ 
      trumpetEtching = etching;
   }
      
   Color  getColor(){ 
      return trumpetColor; 
   }
   
   Etching getEtching(){
      return trumpetEtching;
   }
}