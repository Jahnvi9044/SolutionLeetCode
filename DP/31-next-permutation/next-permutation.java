class Solution {
    public void nextPermutation(int[] nums) {
        

        int n = nums.length;
        int b1=-1;
        for(int i = n-1; i>0 ; i--)
        { 

            if(nums[i-1]<nums[i])
            {
                b1=i-1;
                break;
            }
        }
        if(b1==-1){

            reverse(nums,0,n-1);

        }  
        else {

        
        int b2 = -1 ;

        for(int i = n - 1 ;i>b2 ; i--)
        {    

            if(nums[b1]<nums[i])
            {
                b2=i;
                break;
            }
        
         }

         //swap

         int temp = nums[b1];
         nums[b1] = nums[b2];
         nums[b2] = temp;
        //  System.out.println(Arrays.toString(nums)); 

        //  2,3,0,0,1,4,5
          reverse(nums,b1+1,n-1);

    
        }
        

      
        //  System.out.println(Arrays.toString(nums));

    }



    public static void reverse(int[] nums,int a , int b)
    {
            

         int temp=0;
        for( int i = 0; i<=(b-a)/2 ; i++)
        {   
         temp=nums[i+a];
         nums[i+a]=nums[b-i];
         nums[b-i]=temp;
        
            
        }


    }
}