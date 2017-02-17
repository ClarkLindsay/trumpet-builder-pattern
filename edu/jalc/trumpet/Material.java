package edu.jalc.trumpet;

class Material {

   private Color trumpetColor;
   private Etching trumpetEtching;
      
   Material(Color color, Etching etching) {
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