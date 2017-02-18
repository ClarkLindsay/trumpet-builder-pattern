package edu.jalc.trumpet.mouthPieceProperties.boreSize;

public class BoreSize {

   private final int boreSizeDepth;
   
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