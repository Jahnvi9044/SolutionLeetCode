class Solution {
    public int beautySum(String s) {
        
        int []freq = new int[26] ;
       int sum = 0;
          
         int n= s.length() ; 

       for(int i = 0 ; i<n ; i++ )
       { 
          for( int j = i ; j<n ; j++)
          { 
            char ch = s.charAt(j);
            freq[ch-97]++;
            int min = freq[ch-97] , max = freq[ch-97]  ;
            for(int k = 0;k<26;k++)
            {
                if(freq[k]!=0 && freq[k]<min)
                 min = freq[k];
                if(freq[k]!=0 && freq[k]>max)
                 max = freq[k]; 

            }
         
            sum += max-min; 
          }
          for(int k = 0;k<26;k++)
            {
                freq[k] = 0 ; 
            }

            
        }

        System.out.println(sum);
          return sum ; 
    }
}