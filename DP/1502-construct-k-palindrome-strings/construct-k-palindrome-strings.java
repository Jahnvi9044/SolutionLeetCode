class Solution {
    public boolean canConstruct(String s, int k) {
        
      int[] freq = new int[26] ;
      int n = s.length();
      int odd = 0,count=0 ;
      for(int i = 0 ; i<n ; i++)
      {   
            char ch = s.charAt(i);
             freq[ch-'a']++;
             if(freq[ch-'a']%2==0)
              odd--;
             else 
               odd++;  
             count++;  
      }
       
       if(odd>k)
         return false;
        if(count<k) 
          return false ;
  
       return true;

    }
}