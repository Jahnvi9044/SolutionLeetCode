class Solution {
    public int pivotInteger(int n) {
        int sum1 = 0 , sum2 = 0 ;

          for( int i = 1 ; i <= n / 2 ; i++ )
            sum1 += i;
          for( int i = n / 2 ; i <= n ; i++)
            sum2 += i;

          int no = n / 2 ; 

          while( true )
          {
               

            if( sum1 == sum2 )
            { 
               return no;
            }

               sum2 = sum2 - no ;
               no++;
               sum1 = sum1 + no ;

               if(sum1>sum2)
               return -1;

          }

        

    }
}