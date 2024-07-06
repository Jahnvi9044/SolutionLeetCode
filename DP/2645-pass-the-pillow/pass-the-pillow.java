class Solution {
    public int passThePillow(int n, int time) {


       int fullround = time/(n-1);
       int left = time % (n-1);

       if( fullround % 2 == 0 )//-->
         return left+1;
       else //<--
         return n - left ;   
    }
}