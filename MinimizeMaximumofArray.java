class Solution {
    public int minimizeArrayValue(int[] nums) {
        int start = 0;
        int end = maxElement(nums);
        int ans = 0;
        while( start <= end){
            int mid = start + (end- start)/2;
            if(valid(mid, nums)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public int maxElement(int []nums){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++){
            maxi = Math.max(nums[i], maxi);
        }
        return maxi;
    }

    public boolean valid(int mid ,int []nums){
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if( sum > (long)mid * (i + 1)){
                return false;
            }
        }
        return true;
    }
}
