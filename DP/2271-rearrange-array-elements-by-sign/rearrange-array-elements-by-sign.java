class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList();
        ArrayList<Integer> neg=new ArrayList();
        int n=nums.length;

        for(int i =0;i<n;i++)
        { 
            if(nums[i]>0)
             pos.add(nums[i]);
            else 
              neg.add(nums[i]); 
        } 

        System.out.println(pos);
        System.out.println(neg);

        Iterator it =pos.iterator();
        Iterator it1 =neg.iterator();
        
        int i=0;
        while ( it.hasNext()) {
                nums[i] = (Integer)it.next();
                i+=2;
            } 
       i=1;
        while (it1.hasNext())  
        {   
                nums[i] = (Integer)it1.next();
                i+=2;
        }
        
        return nums;
    }
}