package edu.jalc.trumpet.materialProperties.etching;

public class Etching {

   private int numberOfEtchings;

   private Etching() {
      numberOfEtchings = 0;
   }
   
   public Etching(int numberOfEtchings){
      this.numberOfEtchings = numberOfEtchings;
   }
   
   public int getNumberOfEtchings(){
      return numberOfEtchings;
   }
}