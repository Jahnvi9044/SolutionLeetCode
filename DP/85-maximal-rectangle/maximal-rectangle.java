class Solution {
    public int maximalRectangle(char[][] matrix) {

         int n=matrix.length;
         int m=matrix[0].length;
         int[] mah=new int[m];

         for(int i=0;i<m;i++)
         {   
             if(matrix[0][i]=='1')
              mah[i]=1;
             else 
               mah[i]=0;
         }  
         int max=-1;

         max=Math.max(MAH(mah),max);
            //  System.out.println(Arrays.toString(mah));


         for(int i=1;i<n;i++)
         {
             for(int j=0;j<m;j++)
            { 
                if(matrix[i][j]=='1')   
                 mah[j]=mah[j]+1;
                else 
                 mah[j]=0;
             }
            //  System.out.println(Arrays.toString(mah));
              max=Math.max(max,MAH(mah));
         }

         return max;


    }


    int[] NSR;
    int[] NSL;
    public int  MAH(int[] heights) {
        // NSL(index)
        // NSR(index)
        NSL(heights);
        NSR(heights);

        int n=heights.length;
       
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max((NSR[i]-NSL[i]-1)*heights[i],max);
        }

    
       return max;
      

    }

    public void NSR(int[] height)
    {   NSR=new int[height.length];
        Stack<Integer> s=new Stack<>();
        int pseudoIndex=height.length;
        int n=pseudoIndex;

        for(int i=n-1;i>=0;i--)
        {
            if(s.isEmpty())    //
            {
                NSR[i]=pseudoIndex;
            }
            else if(s.size()>0 && height[s.peek()]<height[i])
            {
                NSR[i]=s.peek();
            }

            else {    //
                while(s.size()>0 && height[s.peek()]>=height[i])
                {
                    s.pop();
                }

                if(s.isEmpty())
                {
                    NSR[i]=pseudoIndex;
                }
                else NSR[i]=s.peek();
            }   //
              
              s.push(i);

        }

    //    System.out.println(Arrays.toString(NSR));
    
        
    }
    public void NSL(int[] height)
    {   NSL=new int[height.length];
        Stack<Integer> s=new Stack<>();
        int pseudoIndex=-1;
        int n=height.length;

        for(int i=0;i<n;i++)
        {
            if(s.isEmpty())     //
            {
                NSL[i]=pseudoIndex;
            }
            else if(s.size()>0 && height[s.peek()]<height[i])
            {
                NSL[i]=s.peek();
            }

            else {        //
                while(s.size()>0 && height[s.peek()]>=height[i])
                {
                    s.pop();
                }

                if(s.isEmpty())
                {
                    NSL[i]=pseudoIndex;
                }
                else NSL[i]=s.peek();
            }//
              
              s.push(i);

        }

    //    System.out.println(Arrays.toString(NSL));
    
        
    }

}