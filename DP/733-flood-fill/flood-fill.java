class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc]==color)
           return image;
        int col = image[sr][sc]; 
        dfs(image,sr,sc,color,image.length,image[0].length,col);

        return image;   
    }
    static  int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};


    public void dfs(int[][] edge,int i,int j,int color,int n,int m,int col)
    {
            
            edge[i][j]=color;

           for(int d = 0; d<4 ; d++)
            {
                int x = i  + dir[d][0];
                int y = j  + dir[d][1];

                 if(x<n && y<m && x>=0 && y>=0)
                {      
                    if(edge[x][y]==col)
                      {  
                        dfs(edge,x, y,color,n, m,col);
                        
                      }
                    
                       
                } 
             }
    }
}