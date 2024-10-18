class Solution {
    int max = 0 ;
    int freq = 0;
    public int countMaxOrSubsets(int[] nums) {
        

        subsets(0,0,nums,nums.length);
        return freq ; 
    }

    public void subsets(int val , int i, int[] nums,int n )
    {
        if(n==i)
        {   if(max<val)
            {   max=val;
                freq=0;
            }
            if(max==val)
            {
                freq++;
            }
         
            return ;           
        }

        //take i th element of nums 
        
        subsets(val|nums[i],i+1,nums,n);

        // do not take i th element of nums
      
        subsets(val,i+1,nums,n);  

    }
}