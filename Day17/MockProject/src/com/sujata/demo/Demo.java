package com.sujata.demo;

public enum Demo {

	SUJATA("JAVA","Delhi",22){
		public void show() {
			System.out.println("Hi I am show method for SUJATA ");
		}
	},VIVEK{
		public void show() {
			System.out.println("Hi I am show method for VIVEK");
		}
	};
	
	
	
	private Demo(String technology,String location, int yearsOfExp) {
		this.technology = technology;
		this.location=location;
		this.yearsOfExp = yearsOfExp;
	}
	private Demo() {
		
	}
	private String technology,location;
	private int yearsOfExp;
	public abstract void show();
}
