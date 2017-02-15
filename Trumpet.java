package JohnALogan.Spring2017.CPS206.Labs.POJO.Trumpet;

class Trumpet {

   private Material trumpetMaterial;
   private MouthPiece trumpetMouthPiece;
   
   private Trumpet() throws Exception {
      setMaterial(null);
      setMouthPiece(null);
   }
      
   Trumpet(Material material, MouthPiece mouthPiece) {
      trumpetMaterial = material;
      trumpetMouthPiece = mouthPiece;
   }

   Material setMaterial(Material material) throws Exception {
      if(material == null) 
         throw new Exception("Material cannot be null");
      
      trumpetMaterial = material;
      
      return trumpetMaterial;
   }

   MouthPiece setMouthPiece(MouthPiece mouthPiece) throws Exception{
      if(mouthPiece == null) 
         throw new Exception("MouthPiece cannot be null");
   
      trumpetMouthPiece = mouthPiece;
      
      return trumpetMouthPiece;
   }
   
   Material getMaterial(){	
      return trumpetMaterial; 
   }
      
   MouthPiece getMouthPiece(){ 
      return trumpetMouthPiece; 
   }
}