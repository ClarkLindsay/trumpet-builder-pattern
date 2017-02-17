package edu.jalc.trumpet.etching;

public class Etching {

   private int numberOfEtchings = 27;

   private Etching() {
      numberOfEtchings = 27;
   }
   
   public Etching(int etching){
      etching = numberOfEtchings;
   }
   
   public int getNumberOfEtchings(){
      return numberOfEtchings;
   }
}