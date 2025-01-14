class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
       int[] ar = new int[A.length];
        int[] arr = new int[A.length];
       
       int common = 0;
        for(int i = 0;i<A.length;i++)
        {
          int d = 0;
          ar[A[i]-1]++;
          ar[B[i]-1]++;
              
          if(ar[A[i]-1]==2) 
            d++;
          if(ar[B[i]-1]==2)
            d++;

            if(A[i]==B[i])
             d--;
             
             
          arr[i] = d+common;
          common = arr[i];   
        }
       
           return  arr; 

    }
}