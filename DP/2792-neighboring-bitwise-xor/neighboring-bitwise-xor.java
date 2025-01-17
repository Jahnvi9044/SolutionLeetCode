class Solution {
    public boolean doesValidArrayExist(int[] derived) {
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