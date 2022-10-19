class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        Queue<Integer> q = new PriorityQueue<>((i, j)->map.get(i).equals(map.get(j)) ? j.compareTo(i): map.get(i) - map.get(j));

        int []arr = new int [k];
        for(Integer i : map.keySet()){
            q.add(i);
            if(q.size() > k){
                q.poll();
            }
        }
        int idx = 0;
        while(!q.isEmpty()){
           arr[idx++] = q.poll();  
        }

        return  arr;
    }
}
