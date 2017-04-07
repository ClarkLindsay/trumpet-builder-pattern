package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

public class BachStradivariusBuilder implements TrumpetBuilderInterface{

   private Trumpet trumpet;
   
   private boolean withHighQualityEtching = true;
   private boolean withLowQualityEtching = false;
   private boolean useSilver = true;
   private boolean useGold = false;
   private boolean comesWithMute = true;
   
   public BachStradivariusBuilder() {
      trumpet = new Trumpet(null, null);
   }

   public TrumpetBuilderInterface withHighQualityEtching(){
      withHighQualityEtching = true;
      return this;
   }
   
   public TrumpetBuilderInterface withLowQualityEtching(){
      withLowQualityEtching = false;
      return this;
   }
   
   public TrumpetBuilderInterface useSilver(){
      useSilver = true;
      return this;
   }
   
   public TrumpetBuilderInterface useGold(){
      useGold = false;
      return this;
   }
   
   public TrumpetBuilderInterface comesWithMute(){
      comesWithMute = true;
      return this;
   }
   
   public Trumpet build() {
      return trumpet;
   }
}