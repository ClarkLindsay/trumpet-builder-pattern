package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

public class TrumpetBuildDirector {

   private BachStradivariusBuilder bach;
   private KingSuperTwentyBuilder king;
   private EtudeStudentBuilder etude;

   public TrumpetBuildDirector(){}

   public TrumpetBuildDirector(final BachStradivariusBuilder bach) {
      this.bach = bach;
   }
   
   public TrumpetBuildDirector(final KingSuperTwentyBuilder king) {
      this.king = king;
   }
   
   public TrumpetBuildDirector(final EtudeStudentBuilder etude) {
      this.etude = etude;
   }

   public String construct(TrumpetBuilderInterface type){
      System.out.println("Your trumpet has: ");
      
      /*if(type.withHighQualityEtching())
         System.out.println("high quality etching,");
      else
         System.out.println("low quality etching, ");
         
      if(type.useSilver())
         System.out.println("is silver,");
      else
         System.out.println("is gold, ");
         
      if(type.comesWithMute())
         System.out.println("and comes with a mute.");
      else
         System.out.println("");*/
         
      return "";   
   }

   public static void main(final String[] arguments) {
      
      TrumpetBuildDirector trumpetBuildDirector = new TrumpetBuildDirector();
   
      BachStradivariusBuilder bach = new BachStradivariusBuilder();
      KingSuperTwentyBuilder king = new KingSuperTwentyBuilder();
      EtudeStudentBuilder etude = new EtudeStudentBuilder();
      
      System.out.println(trumpetBuildDirector.construct(bach));
      System.out.println(trumpetBuildDirector.construct(king));
      System.out.println(trumpetBuildDirector.construct(etude));
   }
}