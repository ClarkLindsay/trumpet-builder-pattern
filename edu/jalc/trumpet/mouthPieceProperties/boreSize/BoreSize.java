package edu.jalc.trumpet.mouthPieceProperties.boreSize;

public class BoreSize {

   private int boreSizeDepth;
   
   private BoreSize(){
      boreSizeDepth = 0;
   }
      
   public BoreSize(int boreSizeDepth){
      this.boreSizeDepth = boreSizeDepth;;
   }
 
   public int getDepth(){
      return boreSizeDepth;
   }
}