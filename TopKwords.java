class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i]) + 1);
            }else{
                map.put(words[i],1);
            }
        } 

        Queue<String> q = new PriorityQueue<>((w1, w2)-> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));

        for(String str : map.keySet()){
            q.add(str);
            if(q.size() > k){
                q.poll();
            }
        } 

        List<String> l = new ArrayList<>();
        while(!q.isEmpty()){
            l.add(q.poll());
        }
        Collections.reverse(l);

        return l;
         
    }
}
