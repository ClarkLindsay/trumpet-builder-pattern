package edu.jalc.trumpet.mouthPiece;

import edu.jalc.trumpet.brand.Style;
import edu.jalc.trumpet.boreSize.BoreSize;

public class MouthPieceTest {

   public void testSetStyle() throws Exception {
      System.out.println("Testing MouthPiece::setStyle");
      MouthPiece mouthPiece = new MouthPiece(null, null);
      Style style = new Style(0);
      mouthPiece.setStyle(style);
      assert(style == mouthPiece.getStyle());
   }
   
   public void testSetBoreSize() throws Exception {
      System.out.println("Testing MouthPiece::setBoreSize");
      MouthPiece mouthPiece = new MouthPiece(null, null);
      BoreSize boreSize = new BoreSize(0);
      mouthPiece.setBoreSize(boreSize);
      assert(boreSize == mouthPiece.getBoreSize());
   }


   public void testGetStyle() throws Exception {
      System.out.println("Testing MouthPiece::getStyle");
      Style style = new Style(0);
      MouthPiece trumpetMouthPiece = new MouthPiece(style, null);		
      assert(trumpetMouthPiece.getStyle() == style);
   }
   
   public void testGetBoreSize() throws Exception {
      System.out.println("Testing MouthPiece::getBoreSize");
      BoreSize boreSize = new BoreSize(0);
      MouthPiece trumpetMouthPiece = new MouthPiece(null, boreSize);
      assert(trumpetMouthPiece.getBoreSize() == boreSize);
   }

   public static void main(String[] args) throws Exception{
      MouthPieceTest mouthPieceTest = new MouthPieceTest();
      mouthPieceTest.testSetStyle();
      mouthPieceTest.testSetBoreSize();
      mouthPieceTest.testGetStyle();
      mouthPieceTest.testGetBoreSize();
      System.out.println("MouthPieceTest complete");
   }
}