class Solution{
  public static kadanealgo (int [] nums){
    int maxsum = 0;
    int cursum = 0;
    
    for(int i =0; i<nums.lenght;i++){
      cursum =  cursum + nums[i];
      if(cursum > maxsum){
        maxsum = cursum;
      }
      if(cursum < 0){
        cursum = 0;
      }
      
    }
    
    return maxsum;
        
}
