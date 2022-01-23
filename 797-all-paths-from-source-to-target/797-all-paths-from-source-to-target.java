class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //using BFS
        
        int n = graph.length;
        
        if (n == 0) return new ArrayList<>();
        
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        List<List<Integer>> paths = new ArrayList<>();
        
        q.add(new ArrayList<>(Arrays.asList(0)));
        
        while (!q.isEmpty()) {
            List<Integer> node = q.poll();
            if (node.get(node.size() - 1) == n - 1) {
                paths.add(node);
            }
            for (int nextNode : graph[node.get(node.size() - 1)]) {
                node.add(nextNode);
                q.add(new ArrayList<>(node));
                node.remove(node.size() - 1);
            }
        }
        return paths;
    }
}