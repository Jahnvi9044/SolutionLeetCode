class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {


        TreeMap<Integer,Integer> map = new TreeMap<>();
        
         int  n = arr1.length ; 

        for(int i = 0;i<n;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1) ; 
            
        }
        // System.out.println(map);
         int c=0;
         int [] ans= new int[arr1.length];
         for(int i = 0; i<arr2.length;i++)
         {
            int  k = map.get(arr2[i]);

            for(int j = 0 ; j<k ; j++)
            {
                ans[c] = arr2[i];
                 
                c++;
            }
            map.remove(arr2[i]);
            
         } 
        //   System.out.println(Arrays.toString(ans));
          Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
         int i = c ; 
           while(it.hasNext())
           {
            Map.Entry<Integer,Integer> a =it.next();
            int k = a.getValue();
            int m = a.getKey();
            for(int j = 0;j<k ;j++)
            {   
                ans[c] = m ;
                c++;
            }
           }
         
         

        //  System.out.println(Arrays.toString(arr1));
        //  System.out.println(Arrays.toString(ans));

    return ans;
    }  
}