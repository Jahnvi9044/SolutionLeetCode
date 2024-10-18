class Solution {
    public int countMaxOrSubsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        subsets(arr,0,0,nums,nums.length);
         int max = 0;
        for(Integer i : arr )
        {  
            max = (max<i)? i : max;
            
        }
        int count = 0;
        for(Integer i : arr)
        {
            if(max == i )
                count++;
        }
        return count ; 
    }

    public void subsets(List<Integer> arr ,int val , int i, int[] nums,int n )
    {
        if(n==i)
        {
            arr.add(val);
            return ;           
        }

        //take i th element of nums 
        
        subsets(arr,val|nums[i],i+1,nums,n);

        // do not take i th element of nums
      
        subsets(arr,val,i+1,nums,n);  

    }
}