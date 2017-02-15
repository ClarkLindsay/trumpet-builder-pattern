package edu.jalc.trumpet;

public class TrumpetApp {

   public static void main(String[] args) throws Exception {
   
      Trumpet trumpet = new Trumpet(new Material(null, null), new MouthPiece(null, null));
      System.out.println(trumpet.getMouthPiece());
   }
}