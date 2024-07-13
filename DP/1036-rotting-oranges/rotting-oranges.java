class Solution {
    public int orangesRotting(int[][] grid) {
        
      int n = grid.length;  
      int m = grid[0].length;  
      Queue<Ind> pending = new LinkedList<>();
      int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};

      int count_orange = 0;

      for(int i = 0; i<n ; i++)
      {
        for(int j = 0; j<m ; j++)
        {
             
          if(grid[i][j]==2)
            pending.add(new Ind(i,j));

          if( grid[i][j]==1 || grid[i][j]==2 )
            count_orange++;     

        }
      }

      System.out.println( count_orange);

      System.out.println(pending.size());
  
       
       int count_rottenOrange = 0 , rot_time = 0;

      while( !pending.isEmpty() )
      {
         
         int size = pending.size();
         count_rottenOrange += size;

         for(int i = 0 ;i<size; i++)
         {
            Ind u =pending.poll();
            for(int d =0;d<4;d++)
            {
                int x =u.a + dir[d][0];
                int y =u.b + dir[d][1];

                if(x<n && y<m && x>=0 && y>=0)
                {
                    if(grid[x][y]==2 || grid[x][y]==0)
                     continue;
                    else if(grid[x][y]==1)
                    {
                        grid[x][y] = 2 ;
                        pending.add(new Ind(x,y));
                    } 
                }
            }
         }

         if(!pending.isEmpty())
         {
            rot_time++;
         }

      }
      
      System.out.println( count_orange+" "+count_rottenOrange);

      if( count_orange == count_rottenOrange)
         return rot_time;
      else 
          return -1;


    }
}


class Ind
{
    int a ;
    int b ;

    Ind(int a,int b)
    {   
        this.a = a;
        this.b = b;

    }
}