package afi;

public class HashSetB {
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int hashCode() {
		
		int hashcode = (int) (10 +Math.random()*11);
		//System.out.println(hashcode);
		return hashcode;
	}

}
