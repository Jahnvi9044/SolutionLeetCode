class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
          return false;
   int ref = 0;
         for(int i =x;i!=0 ; i/=10)
         {
             int d = i%10;
              ref = ref *10+d;
         } 
         if(x==ref)
           return true;
           else return false;
    }
}