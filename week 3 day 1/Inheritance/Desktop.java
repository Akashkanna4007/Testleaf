package org.system;

public class Desktop extends ComputerModel {
	
	public void desktopSize (){
		System.out.println("1080x2340");
	}

	public static void main(String[] args) {
		Desktop size = new Desktop();
		size.computerModel();
		size.desktopSize();

	}

}
