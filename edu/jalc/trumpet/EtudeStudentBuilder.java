package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

public class EtudeStudentBuilder implements TrumpetBuilderInterface{

   private Trumpet trumpet;

   public EtudeStudentBuilder() {
      trumpet = new Trumpet(null, null);
   }

   public boolean withHighQualityEtching(){
      return false;
   }
   
   public boolean withLowQualityEtching(){
      return true;
   }
   
   public boolean useSilver(){
      return false;
   }
   
   public boolean useGold(){
      return true;
   }
   
   public boolean comesWithMute(){
      return false;
   }
   
   public Trumpet build() {
      return trumpet;
   }
}