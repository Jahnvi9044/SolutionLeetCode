class Solution {

    HashMap<Integer,Integer> map=new HashMap<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
     int n1=nums1.length;
     int n2=nums2.length;
     
    
     NGR(nums2);
      int[] ans=new int[n1];
     for(int i=0;i<n1;i++)
     {
          if(map.containsKey(nums1[i]))
              {
                  ans[i]= map.get(nums1[i]);
                 
              }
        
     }

 return ans;
     }

    public void NGR(int[] nums)
    {
        int n=nums.length;
        int pseudo=-1;
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=nums[i] )
              s.pop();
            if(s.isEmpty())
              map.put(nums[i],-1);
            else 
              map.put(nums[i],s.peek());
            s.push(nums[i]);    
        }
    }
}


//        int n=nums2.length;
//         int[] ans = new int[n];
        
//         Stack<Integer> stk = new Stack<>();
//         ans[n-1] = -1;
//         stk.push(nums2[n-1]);
//         for (int i = n-2; i >= 0; i--)
//          {
       
//             while (!stk.isEmpty() && stk.peek() < nums2[i])
//                 stk.pop();
//             if (stk.isEmpty()) 
//                  ans[i] = -1;
           
//             else ans[i] = stk.peek();

//              stk.push(nums2[i]);
//         }
         
//          int[] ans2=new int[nums1.length];
      

//       HashMap<Integer,Integer> map=new HashMap<>();
//        for(int j=0;j<nums2.length;j++)
//              {
//                     map.put(nums2[j],ans[j]);
                
//              }

//          for(int i=0;i<nums1.length;i++)
//          {
//                  if(map.containsKey(nums1[i]))
//                  {
//                       ans2[i]=map.get(nums1[i]);
                      
//                  } 
             
//          }
//             return ans2;
//     }
// }
