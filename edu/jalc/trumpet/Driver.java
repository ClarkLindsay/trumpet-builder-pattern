package edu.jalc.trumpet;

import java.util.*;
import edu.jalc.trumpet.trumpet.Trumpet;
import edu.jalc.trumpet.materialProperties.etching.Etching;
import edu.jalc.trumpet.mouthPiece.MouthPiece;

public class Driver{
   
   public static void main(String[] args){
      System.out.println("I'm a trumpet");
      Trumpet trumpet = new Trumpet(null, null);
      trumpet.play();
      trumpet.polish();
      
      System.out.println("");
      System.out.println("I'm etching on a trumpet");
      Etching etching = new Etching(0);
      etching.etch();
      
      System.out.println("");
      System.out.println("I'm a trumpet mouthpiece");
      MouthPiece mouthPiece = new MouthPiece(null, null);
      mouthPiece.polish();
      mouthPiece.buzz();
      mouthPiece.remove();
      
      System.out.println("");
      System.out.println("Time to Polymorph!");
      ArrayList<Polishable> polishableItems = new ArrayList<>();
      polishableItems.add(new Trumpet(null, null));
      polishableItems.add(new MouthPiece(null, null));
   
      Iterator iterator = polishableItems.iterator();
      while(iterator.hasNext()){
         ((Polishable)iterator.next()).polish();
      }  
   }
}