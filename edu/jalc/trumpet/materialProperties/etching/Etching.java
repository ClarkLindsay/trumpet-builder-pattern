package edu.jalc.trumpet.materialProperties.etching;

public class Etching {

   private int numberOfEtchings;
   private int currentEtchings;

   private Etching() {
      numberOfEtchings = 0;
      currentEtchings = 0;
   }
   
   public Etching(int numberOfEtchings, int currentEtchings) throws Exception{
      if (numberOfEtchings > currentEtchings)
         this.numberOfEtchings = numberOfEtchings;
      else
         throw new Exception("New etchings must be greater than current etchings");
   }
   
   public int getNumberOfEtchings(){
      return numberOfEtchings;
   }
}