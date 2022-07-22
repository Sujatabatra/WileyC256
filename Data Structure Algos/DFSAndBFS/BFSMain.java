package com.suyesh.bfs;

public class BFSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS b=new BFS();
		
		b.addNewEdge(0,1, true);
		b.addNewEdge(0,2, true);
		b.addNewEdge(1,3, true);
		b.addNewEdge(1,4, true);
		
		b.addNewEdge(2,5, true);
		b.addNewEdge(2,6, true);
		
		b.addNewEdge(6,7, true);
		
		System.out.println(b);
		System.out.println("Total number of vertices : "+b.vertexCount());
		System.out.println("Total number of edges : "+b.edgeCount());
		b.traverse(1);
		


	}

}
