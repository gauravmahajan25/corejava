package afi;

public enum EnumSingleton implements Cloneable{
	
	instance;
	
	public EnumSingleton getInstance() throws CloneNotSupportedException {
		return (EnumSingleton) instance.clone();
	}
	
	public void setInstance(EnumSingleton instance) {
		//this.instance = instance;
	}
	


	

}
