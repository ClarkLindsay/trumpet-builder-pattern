package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

public class KingSuperTwentyBuilder implements TrumpetBuilderInterface{

   private Trumpet trumpet;

   public KingSuperTwentyBuilder() {
      trumpet = new Trumpet(null, null);
   }

   public boolean withHighQualityEtching(){
      return true;
   }
   
   public boolean withLowQualityEtching(){
      return false;
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