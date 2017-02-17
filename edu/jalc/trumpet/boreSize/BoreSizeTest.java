package edu.jalc.trumpet.boreSize;

public class BoreSizeTest{
   
   public void testGetDepth() throws Exception {
      System.out.println("Testing BoreSize::getDepth");
      BoreSize boreSize = new BoreSize(7);
      assert(boreSize.getDepth() == 7);
   }
   
   public static void main(String[] args) throws Exception{
      BoreSizeTest boreSizeTest = new BoreSizeTest();
      boreSizeTest.testGetDepth();
      System.out.println("BoreSizeTest complete");
   }
}