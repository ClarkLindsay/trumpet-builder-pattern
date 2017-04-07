package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

interface TrumpetBuilderInterface{

   public TrumpetBuilderInterface withHighQualityEtching();
   
   public TrumpetBuilderInterface withLowQualityEtching();

   public TrumpetBuilderInterface useSilver();
   
   public TrumpetBuilderInterface useGold();
   
   public TrumpetBuilderInterface comesWithMute();

   public Trumpet build();
}