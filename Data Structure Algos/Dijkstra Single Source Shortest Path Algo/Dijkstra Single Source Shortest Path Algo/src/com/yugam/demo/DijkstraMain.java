package com.yugam.demo;

public class DijkstraMain {

	public static void main(String[] args) {
		WeightedGraph graph = new WeightedGraph();
		graph.addNewEdge(0,3,2);
		graph.addNewEdge(0,2,4);
		graph.addNewEdge(1,2,9);
		graph.addNewEdge(1,4,1);
		graph.addNewEdge(2,3,3);
		graph.addNewEdge(2,5,1);
		graph.addNewEdge(3,5,1);
		graph.addNewEdge(4,5,2);
		/*
		 *      0    1
		 *    / |   / \
		 *  2/  |4 /9  \1
 		 *  / 3 | /     \
		 * 3----2       4
		 * \    |      /
		 * 1\   |1    /
		 *   \  |    /2
		 *    \ |   /
		 *       5  
		 *       
		 *  answer = [0,6,4,2,5,3]
		 *  
		 * */
		System.out.println(graph.toString());
		System.out.println(graph.countEdges());
		System.out.println("Shortest distance of every vertex from source vertex: ");
		graph.dijkstraAlgo(0);
	}

}
