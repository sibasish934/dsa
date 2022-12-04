class Solution {
    public int minimumAverageDifference(int[] nums) {
       long sum = 0;
       long csum = 0;
       int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
             sum += nums[i];
        }
        int redI = 0;
        for(int i = 0; i<nums.length;i++){
            csum += nums[i];
            int avg1 =(int)(csum / (i + 1));
            if(i == nums.length-1){
                if(avg1 < min){
                    return nums.length-1;
                }else{
                     break;
                }
            }
            int avg2 =(int)((sum-csum)/ (nums.length - i -1));
            int diff = Math.abs(avg1 - avg2);
            if(diff < min){
                min = diff;
                redI = i;
            }
        }

        System.out.println(min);

        return redI;
    }
}
