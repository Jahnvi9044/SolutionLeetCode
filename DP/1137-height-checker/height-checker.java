class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
      int[] arr = new int[heights.length];   
       for(int i =0 ;i<n;i++)
       {
        arr[i]=heights[i];
       }
       Arrays.sort(arr);
         int count = 0; 
       for(int i = 0;i<n;i++)
       {
        if(arr[i]!= heights[i])
             count++;         
       }
        return count; 
    }
}