package com.suyesh.dfs;

public class DFSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS d=new DFS();
		
		d.addNewEdge(0,1, true);
		d.addNewEdge(0,2, true);
		d.addNewEdge(1,3, true);
		d.addNewEdge(1,4, true);
		
		d.addNewEdge(2,5, true);
		d.addNewEdge(2,6, true);
		
		d.addNewEdge(6,7, true);
		
		System.out.println(d);
		System.out.println("Total number of vertices : "+d.vertexCount());
		System.out.println("Total number of edges : "+d.edgeCount());
		d.traverse(0);

	}

}
