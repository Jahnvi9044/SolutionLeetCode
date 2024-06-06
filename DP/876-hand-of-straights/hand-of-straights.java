class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) 
    {   
         int n =hand.length;
        if( n % groupSize != 0 )
           return false;
         Arrays.sort(hand);
       
           
       for(int i =0 ;i<n;i++)
        {
            if(hand[i]>=0)
            {
                if(!findGroup(hand, groupSize,i , n )) 
                  return false; 
            }
        }
        return true;
    }

    public boolean  findGroup(int[] arr, int groupSize, int i, int n  )
    {    
        int f = arr[i] + 1;
        arr[i]=-1;
        i++;   
        int count = 1 ;

        while( i < n && count < groupSize ) 
        {    

            if(arr[i]==f)
            {
                f=arr[i]+1;
                arr[i]=-1;
                count++;
            }

             i++;
        }

         if( count != groupSize )
         {
            return false;
         }

         return true;

    }
}