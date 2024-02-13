 class Solution {

    long[] cumu0;
    int[] NSL;
    int[] NSR;
    long  M=1_000_000_007L;
    

public int maxSumMinProduct(int[] nums) {
    int n = nums.length;
     cumu0 = new long[n];
     cumu0[0] = nums[0];
   
    for (int i = 1; i < n; i++) {
        cumu0[i] = (cumu0[i - 1]  + nums[i] ) ;
    }

    NSL = new int[n];
    NSR = new int[n];

    NSL(nums);
    NSR(nums);
    long max = 0L;

    for (int i = 0; i < n; i++) {
        long s = sumC(nums, NSL[i] + 1 , NSR[i] - 1);
        max = Math.max(max, (s* nums[i]) );
    }

    return (int) (max % M);

}





public long sumC(int nums[], int a, int b) {
    int n = nums.length;
    long sum = 0L;

    // Ensure indices are within bounds
    // a = Math.max(a, 0);
    // b = Math.min(b, n - 1);

    long c0 = cumu0[a] - nums[a];
    long cn = cumu0[b] ;
    sum = (cn-c0);
    // System.out.println(sum);
    return sum;

}


    public void NSR(int[] nums)
    {
        int n=nums.length;
        int pseudo=n;
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && nums[s.peek()]>=nums[i])
              s.pop();

            if(s.isEmpty())
              NSR[i]=pseudo;
            else NSR[i]=s.peek(); 

           s.push(i);  
        }
    }

    public  void NSL(int[] nums)
    {
        int n=nums.length;
        int pseudo=-1;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {   
            while(!s.isEmpty() && nums[s.peek()]>=nums[i])
            s.pop();

            if(s.isEmpty())
              NSL[i]=pseudo;
            else NSL[i]=s.peek(); 

            s.push(i); 
        }
    }



 }
