package edu.jalc.trumpet.materialProperties.etching;

public class EtchingTest{
   
   public void testGetNumberOfEtchings() throws Exception {
      System.out.println("Testing Etching::getNumberOfEtchings");
      Etching etching = new Etching(27, 4);
      assert(etching.getNumberOfEtchings() == 27);
   }
   
   /*public void testGetNumberOfEtchingsWithException() throws Exception {
      System.out.println("Testing Etching::getNumberOfEtchingsWithException");
      Etching etching = new Etching(27, 50);
      assert(etching.getNumberOfEtchings() == 27);
   }*/
   
   public static void main(String[] args) throws Exception{
      EtchingTest etchingTest = new EtchingTest();
      etchingTest.testGetNumberOfEtchings();
      //etchingTest.testGetNumberOfEtchingsWithException();
      System.out.println("EtchingTest complete");
   }
}