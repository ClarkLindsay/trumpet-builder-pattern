package edu.jalc.trumpet;

//import JohnALogan.Spring2017.CPS206.POJO.*;
//import JohnALogan.Spring2017.CPS206.POJO.Trumpet;
//import JohnALogan.Spring2017.CPS206.POJO.MouthPiece;
//import JohnALogan.Spring2017.CPS206.POJO.Material;
//import JohnALogan.Spring2017.CPS206.POJO.Color;
//import JohnALogan.Spring2017.CPS206.POJO.Style;

public class TrumpetApp {

   public static void main(String[] args) throws Exception {
   
      Trumpet trumpet = new Trumpet(new Material(null, null), new MouthPiece(null, null));
      System.out.println(trumpet.getMouthPiece());
   }
}