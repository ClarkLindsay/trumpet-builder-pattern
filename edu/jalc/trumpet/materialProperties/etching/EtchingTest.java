package edu.jalc.trumpet.materialProperties.etching;

public class EtchingTest{

   public void testSetDesign() throws Exception {
      System.out.println("Testing Etching::getNumberOfEtchings");
      Etching etching = new Etching(0);
      etching.setDesign(2);
      assert(etching.getDesign() == 2);
   
   }
   
   public void testGetDesign() throws Exception {
      System.out.println("Testing Etching::getNumberOfEtchings");
      Etching etching = new Etching(2);
      assert(etching.getDesign() == 2);
   }
      
   public static void main(String[] args) throws Exception{
      EtchingTest etchingTest = new EtchingTest();
      etchingTest.testSetDesign();
      etchingTest.testGetDesign();
      System.out.println("EtchingTest complete");
   }
}