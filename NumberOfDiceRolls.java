class Solution {
    static int mod = 100000007;
    public int numRollsToTarget(int n, int k, int target) {
        int [][]dp = new int [n][target+1];
        for(int i=0; i<dp.length; i++){
            for( int j=0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }
        return solve(n, k, target, dp);
    }

    public int solve(int dice, int faces, int target, int [][] dp){
        if(target < 0){
            return 0;
        }

        if(target != 0 && dice == 0){
            return 0;
        }

        if(dice == 0 && target != 0){
            return 0;
        }

        if(dice == 0 && target == 0){
            return 1;
        }

        if(dp[dice][target] != -1){
            return dp[dice][target];
        }
        int ans = 0;
        for(int i=1; i<=faces; i++){
            ans = ans  + solve(dice-1, faces, target-i, dp);
        }

        dp[dice][target] = ans % mod;
        return dp[dice][target];
    }
}
