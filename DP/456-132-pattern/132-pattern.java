class Solution {
    public boolean find132pattern(int[] nums) 
    {
          

        
         int n=nums.length;
         Stack<Integer> s=new Stack<Integer>();

         int numk=Integer.MIN_VALUE;

         for(int i=n-1;i>=0;i--)
         {  
             if(nums[i]<numk)
                return true;

             while(!s.isEmpty() && nums[i]>s.peek())
             {
                 numk=s.peek();
                 s.pop();
             }

             s.push(nums[i]);
         }


         return false;


    }

}



    