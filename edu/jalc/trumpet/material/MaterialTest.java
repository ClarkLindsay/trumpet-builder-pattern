package edu.jalc.trumpet.material;

import edu.jalc.trumpet.materialProperties.color.Color;
import edu.jalc.trumpet.materialProperties.etching.Etching;

public class MaterialTest {
   
   public void testSetEtching() throws Exception {
      System.out.println("Testing Material::setEtching");
      Material material = new Material(null, null);
      Etching etching = new Etching(1);
      material.setEtching(etching);
      assert(etching == material.getEtching());
   }

   public void testGetColor() throws Exception {
      System.out.println("Testing Material::getColor");
      Color color = new Color(2, 2, 2);
      Material trumpetMaterial = new Material(color, null);		
      assert(trumpetMaterial.getColor() == color);
   }
   
   public void testGetEtching() throws Exception {
      System.out.println("Testing Material::getEtching");
      Etching etching = new Etching(1);
      Material trumpetMaterial = new Material(null, etching);
      assert(trumpetMaterial.getEtching() == etching);
   }

   public static void main(String[] args) throws Exception{
      MaterialTest materialTest = new MaterialTest();
      materialTest.testSetEtching();
      materialTest.testGetColor();
      materialTest.testGetEtching();
      System.out.println("MaterialTest complete");
   }
}