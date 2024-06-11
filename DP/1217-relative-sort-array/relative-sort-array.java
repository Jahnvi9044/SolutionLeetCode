class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {


      int[] freq = new int[1001];
        
         int  n = arr1.length ; 
         for(int i = 0 ;i<1001;i++)
         {
            freq[i] = -1;
         }
         int l = 0;
        for(int i = 0 ; i<n ; i++ )
        {    

              freq[arr1[i]]++;
            
        }
        // System.out.println(map);
         int c=0;
         int [] ans= new int[n];
         for(int i = 0; i< arr2.length ;i++)
         {
            int  k = freq[arr2[i]];

            for(int j = -1 ; j<k ; j++)
            {
                ans[c++] = arr2[i];
            
            }
            freq[arr2[i]]=-1;
            
         } 
        //   System.out.println(Arrays.toString(ans));
        
           for(int i = 0; i<1001;i++)
           {
            if(freq[i]!=-1)
            {
            int k = freq[i];
            int m = i;
            for( int j = -1 ; j<k ; j++ )
            {   
                ans[c] = m ;
                c++;
            }
            }
           }
         
         

        //  System.out.println(Arrays.toString(arr1));
        //  System.out.println(Arrays.toString(ans));

    return ans;
    }  
}