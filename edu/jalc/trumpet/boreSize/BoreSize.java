package edu.jalc.trumpet.boreSize;

public class BoreSize {

   private int depth;
   
   private BoreSize(){
      depth = 7;
   }
      
   public BoreSize(int boreSizeDepth){
      depth = boreSizeDepth;;
   }
 
   public int getDepth(){
      return depth;
   }
}