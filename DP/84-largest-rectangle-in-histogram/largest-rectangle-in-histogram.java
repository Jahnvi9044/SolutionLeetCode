class Solution {
    int[] NSR;
    int[] NSL;
    public int largestRectangleArea(int[] heights) {
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
           
                while(s.size()>0 && height[s.peek()]>=height[i])
                {
                    s.pop();
                }

                if(s.isEmpty())
                {
                    NSR[i]=pseudoIndex;
                }
                else NSR[i]=s.peek();
           
              s.push(i);

        }

       System.out.println(Arrays.toString(NSR));
    
        
    }
    public void NSL(int[] height)
    {   NSL=new int[height.length];
        Stack<Integer> s=new Stack<>();
        int pseudoIndex=-1;
        int n=height.length;

        for(int i=0;i<n;i++)
        {
           
                while(s.size()>0 && height[s.peek()]>=height[i])
                {
                    s.pop();
                }

                if(s.isEmpty())
                {
                    NSL[i]=pseudoIndex;
                }
                else NSL[i]=s.peek();
           
              
              s.push(i);

        }

       System.out.println(Arrays.toString(NSL));
    
        
    }
}