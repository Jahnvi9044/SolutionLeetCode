class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]==2)
            return nums[i];
        }
        return -1;
    }
}