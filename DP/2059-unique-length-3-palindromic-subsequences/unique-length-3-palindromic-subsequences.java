class Solution {

    public int countPalindromicSubsequence(String s) {
       
        int n  = s.length();
    
        int [] first  = new int[26];
        int [] last = new int[26];
        Arrays.fill(first,-1);
        Arrays.fill(last,-1);



        for(int i = 0;i<n;i++)
        {
           int ind = s.charAt(i)-'a';

           if(first[ind]== -1)
           {
                 first[ind] = i;
           }

           last[ind] = i ;
           
        }
       

       int ans = 0 ;

      
        for( int i = 0 ;i<26;i++)
        {
            if(first[i]==-1||last[i]==-1 )
            {
                continue;
            }
             Set<Character> between = new HashSet<>();  
            for(int j = first[i]+1 ; j <last[i] ; j++)
            {
                between.add(s.charAt(j));   
            }
           
           ans += between.size();

        }

        return ans ;


    }
}