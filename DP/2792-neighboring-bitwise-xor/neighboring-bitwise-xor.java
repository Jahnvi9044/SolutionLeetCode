class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
        if(derived.length == 1 && derived[0]==0)
          return true ; 

        int countone = 0 ;

       for(int i : derived)
       {
        
            countone^=i;
        
       }
       return countone!=1 ;  
    }
}