class Solution {
    public String longestPalindrome(String s) {
         
         boolean [][] dp2 = new boolean[s.length()][s.length()];
         
         computePalin(s,dp2);
 
        String[][] dp = new String[s.length()+1][s.length()+1];   
        //    System.out.println(Arrays.toString(dp));
            return longestPalindrome1(s,s.length(),0,dp,dp2);
     
    }

    private String longestPalindrome1(String s,int n, int i,String [][] dp ,boolean [][] dp2) {
            
        
       if(""==s)
          return "";
       
        String max ="";
        // int  i = 0 ; 
        for( int j  = i ; j < s.length() ; j++ )
        {   
            String str= "" , st="" ;



             if(dp[i][j]!=null)
             {
                return dp[i][j];
             }
        //  System.out.println("out"+s.substring(ind, j+1));
            if(dp2[i][j] )
            {  
                str = s.substring( i , j+1 );
                // System.out.println(str);
            }


            max = (max.length()>str.length())?max:str;
            st = longestPalindrome1(s,n ,j+1,dp,dp2);
            max = (max.length()>st.length())?max:st;


            dp[i][j] = max;
        }  
            return max;

    }


    static void computePalin(String s, boolean[][]dp2)
    {  int n = s.length();
        for(int len = 1; len<=n ; len++ )
        {
            for(int i = 0,j; i<=n-len ;i++)
            {
                j = i + len - 1 ; 
                dp2[i][j] = (s.charAt(i)==s.charAt(j) && (len<=2||dp2[i+1][j-1])) ; 
            }
        }
    }
 

    static boolean isPalin(String s ){ 
        int i = 0;
         int j = s.length()-1 ; 

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
               return false;
            else{
                i++;
                j--;
            }   
        }
          return true;
    }
}