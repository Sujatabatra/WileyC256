package com.amrit.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PrismAlgo {
	
	class adjVertex{
		int ver;
		int wei;
		public adjVertex(int ver, int wei) {
			super();
			this.ver = ver;
			this.wei = wei;
		}
		public int getVer() {
			return ver;
		}
		public int getWei() {
			return wei;
		}
		
	}
	
	private Map<Integer,List<adjVertex>> graph = new HashMap<Integer,List<adjVertex>>();
	
	public void addNewVertex(int vertex) {
		graph.put(vertex, new LinkedList<adjVertex>());
	}
	
	public void addNewEdge(int v1,int v2,int weight) {
		if(!graph.containsKey(v1)) {
			addNewVertex(v1);
		}
		if(!graph.containsKey(v2)) {
			addNewVertex(v2);
		}
		graph.get(v1).add(new adjVertex(v2,weight));
		graph.get(v2).add(new adjVertex(v1,weight));
	}
	
	public int getNumberOfVertex() {
		return graph.size();
	}
	
	 public void printMST(int parent[],int V)
	    {
	        System.out.println("Edge \tWeight");
	        for (int i = 1; i < V; i++) {
	        	int w=0;
	        	List<adjVertex> v=graph.get(parent[i]);
	        	for(adjVertex x:v) {
	        		if(x.getVer()==i)
	        			w=x.getWei();
	        	}
	            System.out.println(parent[i] + " - " + i + "\t"+w);
	        }
	    }
	
	
	public int minKey(int key[],Boolean[] mstSet) {
		int V=getNumberOfVertex();
		
		int min = Integer.MAX_VALUE, min_index = -1;
		  
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
  
        return min_index;
	}
	
	public void primMST()
    {
		int V=getNumberOfVertex();
		
        int parent[] = new int[V];//for storing the parent of a vertex
  
        int key[] = new int[V];//keeping the weights
  
        Boolean mstSet[] = new Boolean[V];//tracking the node which is left
  
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
  
        key[0] = 0;
        parent[0] = -1;
  
        for (int count = 0; count < V - 1; count++) {

            int u = minKey(key, mstSet);
  
            mstSet[u] = true;
              
            for(adjVertex v:graph.get(u)){
            	if(mstSet[v.getVer()]==false && v.getWei()<key[v.getVer()]) {
            		parent[v.getVer()] = u;
            		key[v.getVer()]=v.getWei();
            	}
            }
        }
  
        printMST(parent,V);
    }
}
