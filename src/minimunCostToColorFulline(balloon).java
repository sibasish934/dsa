class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i= 0, j = 0;
        int totalTime = 0;

        char []arr = colors.toCharArray();

        while(i < colors.length() && j < colors.length()){
            int maxTime = 0 , currTime = 0;

            while(j < colors.length() && arr[i] == arr[j]){
                maxTime = Math.max (maxTime , neededTime[j]);
                currTime += neededTime[j];
                j++;
            } 

            i = j;
            totalTime += currTime - maxTime;
        }

        return totalTime;
        
    }
}
