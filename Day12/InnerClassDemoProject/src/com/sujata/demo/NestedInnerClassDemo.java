package com.sujata.demo;


class DemoOuter{
	
	//Nested Class
	static class DemoInner{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
}

public class NestedInnerClassDemo {

	public static void main(String[] args) {
		
		DemoOuter.DemoInner obj=new DemoOuter.DemoInner();
		
		obj.setName("Harmeet");
		System.out.println("Name from Inner class : "+obj.getName());
	}

}
