class Solution {
    public int maxTotalReward(int[] rewardValues) {

      int  sum = 0 ;  
     int n = rewardValues.length; 
     Arrays.sort(rewardValues) ; 
     
     int[][] dp = new int[n][4001];  

      for(int i = 0;i<n;i++)
     {  
        for(int j =0 ;j<4000+1; j++)
        {  dp[i][j] = -1 ;  
          
        }  
     } 
    return   maxRewardM(rewardValues , 0 ,  0 , n ,dp) ; 
    }

    private int maxReward(int[] arr , int x , int i , int n )
    {
        if(n == i)
        {
            return x ;
        }

        int a = 0 ; 
        int b = 0 ; 

        //take and not take 
       
        if(x < arr[i] )
        {
            x = x + arr[i];
            a = maxReward(arr , x , i+1 , n );
            x = x - arr[i];
        }
        b = maxReward(arr , x ,i +1 , n);
        x= Math.max(a,b);
        return x;
    }

     private int maxRewardM(int[] arr , int x , int i , int n  , int[][] dp )
    {
        if(n == i)
        {
            return x ;
        }
        if(dp[i][x] != -1)
           return dp[i][x] ; 

        int a = 0 ; 
        int b = 0 ; 

           
        //take and not take 
           b = maxRewardM(arr , x ,i+1 , n,dp);
        if(x < arr[i] )
        {
            x = x + arr[i];
            a = maxRewardM(arr , x , i+1 , n ,dp);
         
        }
     
         
        dp[i][x]=Math.max(b,a);   
        return dp[i][x];
    }
}