class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
         
        int i = 0,sum=0;
        int [] arr = new int[words.length];
        int [] pre = new int[words.length]; 
         for(String st :words )
         {
             char ch1 = st.charAt(0);
             char ch2 = st.charAt(st.length()-1);
             
            if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')&&(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'))
            { 
              arr[i] = 1;
            }
            else arr[i] = 0;
               
            sum += arr[i];
            pre[i] = sum ;
          i++;
         }

        //  System.out.println(Arrays.toString(arr));
        //  System.out.println(Arrays.toString(pre));
         
         int n = queries.length;
         int [] ans = new int[n] ; 

          for(i = 0; i<n ; i++ ) 
          {
             sum = pre[queries[i][1]]-pre[queries[i][0]];
             if(arr[queries[i][0]]==1)
              sum++;

            ans[i] = sum ;   
          }     
          
          return ans ;
    }
}