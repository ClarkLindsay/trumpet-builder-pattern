package edu.jalc.trumpet;

public class MaterialTest {

   public void testSetColor() throws Exception {
      System.out.println("Testing Material::setColor");
      Material material = new Material(null, null);
      Color color = new Color(null);
      material.setColor(color);
      assert(color == material.getColor());
   }
   
   public void testSetEtching() throws Exception {
      System.out.println("Testing Material::setEtching");
      Material material = new Material(null, null);
      Etching etching = new Etching(null);
      material.setEtching(etching);
      assert(etching == material.getEtching());
   }


   public void testGetColor() throws Exception {
      System.out.println("Testing Material::getColor");
      Color color = new Color(null);
      Material trumpetMaterial = new Material(color, null);		
      assert(trumpetMaterial.getColor() == color);
   }
   
   public void testGetEtching() throws Exception {
      System.out.println("Testing Material::getEtching");
      Etching etching = new Etching(null);
      Material trumpetMaterial = new Material(null, etching);
      assert(trumpetMaterial.getEtching() == etching);
   }

   public static void main(String[] args) throws Exception{
      MaterialTest materialTest = new MaterialTest();
      materialTest.testSetColor();
      materialTest.testSetEtching();
      materialTest.testGetColor();
      materialTest.testGetEtching();
      System.out.println("MaterialTest complete");
   }
}