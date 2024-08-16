package GraphProblems;

import java.util.ArrayList;

public class Dfs {

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
        
        Dfs Dl = new Dfs(); 
        ArrayList < Integer > ans = Dl.DfsOfGraph(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }

public ArrayList<Integer> DfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
		
		ArrayList<Integer> dfs = new ArrayList<Integer>();
		
		boolean vis[] = new boolean [v];
		
		vis[0] = true;
		DFS(0,vis,dfs,adj);
		return dfs;
	}

	private void DFS(int node, boolean[] vis, ArrayList<Integer> dfs, ArrayList<ArrayList<Integer>> adj) {
		
		vis[node] =true;
		
		dfs.add(node);
		
		for(Integer it: adj.get(node)) {
			if(!vis[it]) {
				DFS(it, vis, dfs, adj);
			}
			
		}
		
	}
	
	   
}