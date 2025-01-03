class Solution {
    public int countNegatives(int[][] grid) {
        
    int low ,high ,mid,count = 0 , n =grid[0].length ;
     for(int i = 0;i<grid.length ;i++ )
     {  int ans = -1 ;
        low = 0 ;
        high = n-1;
       
        while(low<=high)
        { mid = low + (high -low)/2;
            if(grid[i][mid]<0)
            { 
                ans = mid ;
                high = mid - 1 ;
            }
            else low = mid + 1 ;

        }
         if(ans!=-1)  
          count += n-ans;

          
         
     }
       return count;
    }
}