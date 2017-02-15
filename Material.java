package JohnALogan.Spring2017.CPS206.Labs.POJO.Trumpet;

class Material {

   private Color trumpetColor;
   private EtchingOnTrumpet trumpetEtching;
   
   private Material() throws Exception {
      setColor(null);
      setEtching(null);
   }
   
   Material(Color color, EtchingOnTrumpet etching) {
      trumpetColor = color;
      trumpetEtching = etching;
   }
   
   Color setColor(Color color) throws Exception {
      if(color == null) 
         throw new Exception("Color cannot be null");
      
      trumpetColor = color;
      
      return trumpetColor;
   }
   
   EtchingOnTrumpet setEtching(EtchingOnTrumpet etching) throws Exception {
      if(etching == null) 
         throw new Exception("Etching cannot be null");
      
      trumpetEtching = etching;
      
      return trumpetEtching;
   }
      
   Color  getColor(){ 
      return trumpetColor; 
   }
   
   EtchingOnTrumpet getEtching(){
      return trumpetEtching;
   }
}