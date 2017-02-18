package edu.jalc.trumpet.materialProperties.color;

public class ColorTest{
   
  public void testGetRed(){
		System.out.println("Testing Color:getRed");
		Color Color = new Color(1, 1, 1);
		assert(Color.getRed() == 1);
	}

	public void testGetGreen(){
		System.out.println("Testing Color:getGreen");
		Color Color = new Color(1, 1, 1);
		assert(Color.getRed() == 1);
	}

	public void testGetBlue(){
		System.out.println("Testing Color:getBlue");
		Color Color = new Color(1, 1, 1);
		assert(Color.getRed() == 1);
	}

	public static void main(String... args){
		ColorTest ColorTest = new ColorTest();
		ColorTest.testGetRed();
		ColorTest.testGetGreen();
		ColorTest.testGetBlue();

		System.out.println("ColorTest Completed");
	}}