class Solution {
    public int maxScore(String s) {
        
     int n =s.length();
    
     int max = -501 ;
     int one=0,zero=0;
     for(int i = 0 ; i<n-1 ; i++ )
     {
        if(s.charAt(i)=='1')
          {
           one++;
          }
          else zero++;
  
        int ans= zero-one;
        max = (max>(ans))?max:ans;
    }

    one+= (s.charAt(n-1)=='1')?1:0;

      
      return one + max;
    }
}