package com.amrit.demo;

public class PrismMain {

	public static void main(String[] args) {
		PrismAlgo graph=new PrismAlgo();
		graph.addNewEdge(0, 1, 4);
		graph.addNewEdge(0, 7, 8);
		graph.addNewEdge(1, 7, 11);
		graph.addNewEdge(2, 1, 8);
		graph.addNewEdge(7, 8, 7);
		graph.addNewEdge(7, 6, 1);
		graph.addNewEdge(2, 3, 7);
		graph.addNewEdge(2, 5, 4);
		graph.addNewEdge(6, 5, 2);
		graph.addNewEdge(2, 8, 2);
		graph.addNewEdge(8, 6, 6);
		graph.addNewEdge(3, 4, 9);
		graph.addNewEdge(3, 5, 14);
		graph.addNewEdge(5, 4, 10);
		
		graph.primMST();
	}

}
