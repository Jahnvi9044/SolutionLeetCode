class Solution {
    public boolean canConstruct(String s, int k) {
        
     
      int n = s.length();
       if(n<k) return false ;
       if(n==k) return true;

      int odd = 0,count=0 ;
      for(int i = 0 ; i<n ; i++)
      {   
            char ch = s.charAt(i);
            odd ^= 1 << (ch - 'a');
      }
      
       
       if(Integer.bitCount(odd)>k)
         return false;
       
  
       return true;

    }
}