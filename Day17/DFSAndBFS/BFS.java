package com.suyesh.bfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
private Map<Integer,List<Integer>> map=new HashMap<Integer, List<Integer>>();
	
	public void addNewVertex(Integer v) {
		map.put(v, new LinkedList<Integer>());
	}
	
	public void addNewEdge(Integer source,Integer destination,boolean bidirectional) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		map.get(source).add(destination);
		if(bidirectional)
			map.get(destination).add(source);
	}
	
	public int vertexCount() {
		return map.size();
	}

	public int edgeCount() {
		int sum = 0;
		for(Integer ele:map.keySet())
		{
			sum = sum + map.get(ele).size();
		}
		return sum/2;
	}
	
	
	 public void traverse(int startVertex) {
	        Queue<Integer> queue = new LinkedList<>();
	        HashSet<Integer> visited = new HashSet<>();
	        queue.add(startVertex);
	        while (!queue.isEmpty()) {
	            int current = queue.poll();
	            if (!visited.contains(current)) {
	                visited.add(current);
	                System.out.print(current+" ");
	                queue.addAll(map.get(current));
	            }
	        }
	    }
	
	

	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		for(Integer vertex:map.keySet()) {
			stringBuilder.append(vertex.toString()+" : ");
			for(Integer connectedVertex:map.get(vertex)) {
				stringBuilder.append(connectedVertex.toString()+" -> ");
			}
			stringBuilder.append("\n");
		}
		return(stringBuilder.toString());
	}
	

}
