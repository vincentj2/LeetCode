class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        
      List<String> wordlst = new LinkedList<>(wordList);
        wordlst.add(beginWord); //it seems the wordList does not contain the begin word
        Map<String, Set<String>> graph = buildGraph(wordlst); //

        //clasic bfs starts here
        int len = 1;
        Queue<String> q = new ArrayDeque<>();
        q.add(beginWord);
        Set<String> seen = new HashSet<>();
        seen.add(beginWord);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String curr = q.poll();
                if(curr.equals(endWord))
                    return len;
                for(String nei: graph.get(curr)){
                    if(!seen.contains(nei)){
                        seen.add(nei);
                        q.add(nei);
                    }
                }
            }

            len++;
        }

        return 0;
    }
    private Map<String, Set<String>> buildGraph(List<String> wordList){
        Map<String, List<String>> adjGroup = new HashMap<>();
        Map<String, Set<String>> graph = new HashMap<>();

        //for each word generate all posibile keys while keeping track words that have a common key
        for(String word: wordList){
            for(int i = 0; i < word.length(); ++i){
                String key = word.substring(0, i) + "*" + word.substring(i + 1);
                adjGroup.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }
        for(String word: wordList){
            graph.put(word, new HashSet<>());
            for(int i = 0; i < word.length(); ++i){
                String key = word.substring(0, i) + "*" + word.substring(i + 1);
                List<String> neighbours = adjGroup.get(key);
                graph.get(word).addAll(neighbours);
            }
        }
        return graph;
    }
}