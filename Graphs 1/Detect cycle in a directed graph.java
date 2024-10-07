class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[]= new boolean[V];
        boolean isFound[]= new boolean[V];
        for(int i=0; i<V; i++) 
        {
            if(!isFound[i]) 
            {
                if(isCycle(i, adj, visited, isFound))
                    return true;
            }
        }
        return false;
    }
    boolean isCycle(int x, ArrayList<ArrayList<Integer>> adj, boolean visited[], boolean isFound[]) 
    {
        if(visited[x])
            return true;
            
        visited[x]=true;
        isFound[x]=true;
        ArrayList<Integer> temp=adj.get(x);
        
        for(int i=0; i<temp.size(); i++)
        {
            if( !isFound[temp.get(i)]) 
            {
                if(isCycle(temp.get(i), adj, visited, isFound))
                    return true;
            } 
            else if(visited[temp.get(i)])
                return true;
        }
        visited[x]=false;
        return false;
    }
}