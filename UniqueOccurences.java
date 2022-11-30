class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
         
        HashSet<Integer> uniqFreq = new HashSet<>();

        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            if(uniqFreq.contains(i.getValue())){
                return false;
            }
            uniqFreq.add(i.getValue());
        }

        return true;

    }
}
