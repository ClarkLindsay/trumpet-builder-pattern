package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

public class TrumpetBuilderImpl implements TrumpetBuilderInterface{

   private Trumpet trumpet;

   public TrumpetBuilderImpl() {
      trumpet = new Trumpet(null, null);
   }

   public String withHighQualityEtching(){
      return "with high quality etching";
   }
   
   public String withLowQualityEtching(){
      return "with low quality etching";
   }
   
   public String useSilver(){
      return "uses silver";
   }
   
   public String useGold(){
      return "uses gold";
   }
   
   public String comesWithMute(){
      return "comes with a mute";
   }
   
   public Trumpet build() {
      return trumpet;
   }
}