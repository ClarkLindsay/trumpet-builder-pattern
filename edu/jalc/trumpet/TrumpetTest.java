package edu.jalc.trumpet;

public class TrumpetTest {

   public void testSetMaterial() throws Exception {
      System.out.println("Testing Trumpet::setMaterial");
      Trumpet trumpet = new Trumpet(new Material(null, null), new MouthPiece(null, null));
      Material material = new Material(null, null);
      trumpet.setMaterial(material);
      assert(material == trumpet.getMaterial());
   }
   
    public void testSetMouthPiece() throws Exception {
      System.out.println("Testing Trumpet::setMouthPiece");
      Trumpet trumpet = new Trumpet(new Material(null, null), new MouthPiece(null, null));
      MouthPiece mouthPiece = new MouthPiece(null, null);
      trumpet.setMouthPiece(mouthPiece);
      assert(mouthPiece == trumpet.getMouthPiece());
   }

   public void testGetMaterial() throws Exception {
      System.out.println("Testing Trumpet::getMaterial");
      Material material = new Material(null, null);
      Trumpet trumpet = new Trumpet(material, new MouthPiece(null, null));
      assert(material == trumpet.getMaterial());
   }

   public void testGetMouthPiece() throws Exception {
      System.out.println("Testing Trumpet::getMouthPiece");
      MouthPiece mouthPiece = new MouthPiece(null, null);
      Trumpet trumpet = new Trumpet(new Material(null, null), mouthPiece);
      assert(mouthPiece == trumpet.getMouthPiece());
   }


   public static void main(String[] args) throws Exception {
      TrumpetTest trumpetTest = new TrumpetTest();
      trumpetTest.testSetMaterial();
      trumpetTest.testSetMouthPiece();
      trumpetTest.testGetMaterial();
      trumpetTest.testGetMouthPiece();
   
      System.out.println("TrumpetTest compleat");
   }
}