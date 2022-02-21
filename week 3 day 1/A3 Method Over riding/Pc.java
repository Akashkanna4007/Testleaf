package org.system;

public class Pc extends Laptop {
	public void getSystemInfo() {
		System.out.println("MAC");
	}

	public static void main(String[] args) {
		Pc info2 = new Pc();
		info2.getSystemInfo();

	}

}
