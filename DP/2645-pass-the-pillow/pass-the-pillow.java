class Solution {
    public int passThePillow(int n, int time) {


         int div = n - 1;
         int afterDivide = time/div;
         int off = div * afterDivide ;

          if(afterDivide % 2 == 0)
          return 1 + (time-off);
          else return n-(time-off); 

    }
}