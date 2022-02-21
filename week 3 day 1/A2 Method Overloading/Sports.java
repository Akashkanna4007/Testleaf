package org.system;

public class Sports {
    public void acheiver(String name,int medalCount) {
    	System.out.println("The name is"+" "+name);
    	System.out.println("Number of medals :"+" "+medalCount);
    }
    	public void acheiver(String country ,String sportName, int rank) {
    		System.out.println("Country name: "+country);
    		System.out.println("Game name is:"+sportName);
    		System.out.println("Rank:"+rank);
    	}
    	public void acheiver(float weight, int height, long contactNo) {
    		System.out.println("Weight:"+weight);
    		System.out.println("Height:"+height);
    		System.out.println("ContactNo:"+contactNo);
    	}
    	public void acheiver(String tournamentName, long prizeMoney) {
    		System.out.println("Tournament Name:"+tournamentName);
    		System.out.println("Prize Money:"+prizeMoney);
    	}
	public static void main(String[] args) {
		Sports call = new Sports();
		call.acheiver("Akash", 3);
		call.acheiver("Archery", 100000000);
		call.acheiver(95, 5, 869518261);
		call.acheiver("India", "Archery", 1);
		
	

	}

}
