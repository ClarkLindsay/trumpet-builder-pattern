package edu.jalc.trumpet.mouthPiece;

import edu.jalc.trumpet.mouthPieceProperties.rimStyle.RimStyle;
import edu.jalc.trumpet.mouthPieceProperties.boreSize.BoreSize;
import edu.jalc.trumpet.Polishable;

public class MouthPiece implements Polishable, Buzzable, Removable{

   private RimStyle style;
   private BoreSize mouthPieceBoreSize;

   public MouthPiece(RimStyle style, BoreSize mouthPieceBoreSize) {
      setStyle(style);
      setBoreSize(mouthPieceBoreSize);
   }
   
   public void polish(){System.out.println("I'm polishing");}
   
   public void buzz(){System.out.println("I'm buzzing");} 
   
   public void remove(){System.out.println("I'm removing");} 
      
   void setStyle(RimStyle style) {   
      this.style = style;
   }
   
   void setBoreSize(BoreSize boreSize) {
      mouthPieceBoreSize = boreSize;
   }
   
   public RimStyle getRimStyle(){
      return style;
   }
   
   public BoreSize getBoreSize(){
      return mouthPieceBoreSize;
   } 
}