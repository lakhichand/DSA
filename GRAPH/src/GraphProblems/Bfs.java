package GraphProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	             
	 public static void main(String args[]) {

	        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
	        for (int i = 0; i < 5; i++) {
	            adj.add(new ArrayList < > ());
	        }
	        adj.get(0).add(1);
	        adj.get(1).add(0);
	        adj.get(0).add(4);
	        adj.get(4).add(0);
	        adj.get(1).add(2);
	        adj.get(2).add(1);
	        adj.get(1).add(3);
	        adj.get(3).add(1);
	        
	        Bfs Bl = new Bfs(); 
	        ArrayList < Integer > ans = Bl.bfsOfGraph(5, adj);
	        int n = ans.size(); 
	        for(int i = 0;i<n;i++) {
	            System.out.print(ans.get(i)+" "); 
	        }
	    }

	public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
		
		ArrayList<Integer> Bfs = new ArrayList<Integer>();
		
		Queue<Integer> q = new LinkedList<>();
		
		boolean vis [] = new boolean[v];
		
		q.add(0);
		vis[0] =true;
		
		while(!q.isEmpty()) {
			int node = q.remove();
			Bfs.add(node);
			
			for(int it : adj.get(node)) {
				if(!vis[it]) {
					q.add(it);
					vis[it] = true;
				}
			}
	
	}
		return Bfs;
	}

}