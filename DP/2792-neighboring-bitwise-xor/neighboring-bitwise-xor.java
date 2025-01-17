class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
        if(derived.length == 1 && derived[0]==0)
          return true ; 

        int countone = 0 ;

       for(int i : derived)
       {
        if(i == 1 )
        {
            countone++;
        }
       }
       return countone%2==0 ;  
    }
}