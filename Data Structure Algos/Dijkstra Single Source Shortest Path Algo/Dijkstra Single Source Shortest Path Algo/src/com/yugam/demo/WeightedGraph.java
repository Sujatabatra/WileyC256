package com.yugam.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class WeightedGraph {

	private Map<Integer, ArrayList<Vertex>> map = new LinkedHashMap<Integer, ArrayList<Vertex>>();
	private int edges=0;
	
	class Vertex implements Comparable<Vertex>{
		int data;
		int weight;
		public Vertex(int data, int weight) {
			super();
			this.data = data;
			this.weight = weight;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		@Override
		public int compareTo(Vertex v2) {
			return this.weight-v2.weight;
		}
		@Override
		public String toString() {
			return "[vertex: " + data + ", weight: " + weight + "]";
		}
		
	}
	
	public void addNewEdge(int source,int destination,int weight) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		Vertex v1 = new Vertex(source,weight);
		Vertex v2 = new Vertex(destination,weight);
		map.get(source).add(v2);
		map.get(destination).add(v1);
		edges++;
	}
	public int countVertices() {
		return map.keySet().size();
	}
	public int countEdges() {
		return edges;
	}
	
	public void addNewVertex(int vertex) {
		map.put(vertex,new ArrayList<Vertex>());
	}
	
	public void dijkstraAlgo(int source) {
		int [] ans = dijkstra(source);
		for(int i:ans) {
			System.out.println(i+" ");
		}
	}
	
	private int[] dijkstra(int source) {
		
		boolean[] visited = new boolean[countVertices()];
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(new Vertex(source,0));
		
		int[] answer = new int[countVertices()];
		Arrays.fill(answer, Integer.MAX_VALUE);
		answer[source] = 0;
		
		while(queue.size()!=0) {
			Vertex currVertex = queue.remove();
			
			int u = currVertex.data;
			if(visited[u]==true) {
				continue;
			}
			
			visited[u]=true;
			
			ArrayList<Vertex> neighbours = map.get(currVertex.data);
			for(Vertex ver: neighbours) {
				int vertex = ver.data;
				int weight = ver.weight;
				if(answer[vertex]>answer[u]+weight) {
					answer[vertex]=answer[u]+weight;
					queue.add(new Vertex(vertex,answer[vertex]));
				}
			}
		}
		
		return answer;
	}
	
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		for(int source:map.keySet()) {
			stringBuilder.append(source+" : ");
			for(Vertex dest: map.get(source)) {
				stringBuilder.append("-->|"+dest.toString());
			}
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
}