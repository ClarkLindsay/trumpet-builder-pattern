package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

interface TrumpetBuilderInterface{

   public String withHighQualityEtching();
   
   public String withLowQualityEtching();

   public String useSilver();
   
   public String useGold();
   
   public String comesWithMute();

   public Trumpet build();
}