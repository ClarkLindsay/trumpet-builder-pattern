package JohnALogan.Spring2017.CPS206.Labs.POJO.Trumpet;

//import edu.jalc.inclass.label.TrumpetLabel;
//import edu.jalc.inclass.lid.TrumpetMaterial;
//import edu.jalc.inclass.liquid.Soda;

public class TrumpetTest {

   public void testGetBellSize() throws Exception {
      System.out.println("Testing Trumpet::getBellSize");
      Trumpet trumpet = new Trumpet(1, new Material(null), new MouthPiece(1, null));
      assert(trumpet.getBellSize() == 1);
   }

   public void testSetMaterial() throws Exception {
      System.out.println("Testing Trumpet::setMaterial");
      Trumpet trumpet = new Trumpet(1, new Material(null), new MouthPiece(1, null));
      Material material = new Material(null);
      trumpet.setMaterial(material);
      assert(material == trumpet.getMaterial());
   }

   public void testSetMaterialWithException() throws Exception {
      System.out.println("Testing Trumpet::setMaterial for exception");
      boolean exceptionThrown = false;
      try {
         new Trumpet(1, new Material(null), new MouthPiece(1, null));
      } 
      catch (Exception e){
         exceptionThrown = true;
      }
   
      assert(exceptionThrown);
   }
   
    public void testSetMouthPiece() throws Exception {
      System.out.println("Testing Trumpet::setMouthPiece");
      Trumpet trumpet = new Trumpet(1, new Material(null), new MouthPiece(1, null));
      MouthPiece mouthPiece = new MouthPiece(1, null);
      trumpet.setMouthPiece(mouthPiece);
      assert(mouthPiece == trumpet.getMouthPiece());
   }

   public void testSetMouthPieceWithException() throws Exception {
      System.out.println("Testing Trumpet::setMouthPiece for exception");
      boolean exceptionThrown = false;
      try {
         new Trumpet(1, new Material(null), new MouthPiece(1, null));
      } 
      catch (Exception e){
         exceptionThrown = true;
      }
   
      assert(exceptionThrown);
   }


   public void testGetMaterial() throws Exception {
      System.out.println("Testing Trumpet::getMaterial");
      Material material = new Material(null);
      Trumpet trumpet = new Trumpet(1, new Material(null), new MouthPiece(1, null));
      assert(material == trumpet.getMaterial());
   }

   public void testGetMouthPiece() throws Exception {
      System.out.println("Testing Trumpet::getMouthPiece");
      MouthPiece mouthPiece = new MouthPiece(1, null);
      Trumpet trumpet = new Trumpet(1, new Material(null), new MouthPiece(1, null));
      assert(mouthPiece == trumpet.getMouthPiece());
   }


   public static void main(String... args) throws Exception {
      TrumpetTest trumpetTest = new TrumpetTest();
      trumpetTest.testGetBellSize();
      trumpetTest.testSetMaterial();
      trumpetTest.testSetMaterialWithException();
      trumpetTest.testSetMouthPiece();
      trumpetTest.testSetMouthPieceWithException();
      trumpetTest.testGetMaterial();
      trumpetTest.testGetMouthPiece();
   
      System.out.println("All Trumpet Tests passed");
   }
}