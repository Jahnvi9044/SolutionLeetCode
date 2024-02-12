class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int n=nums.length;
    Stack<Integer> s=new Stack<>();
    int[] ans=new int[n];
    

    //just think there are 2 arrays like this
    for(int i=2*n-1;i>=0;i--)
    {
        while(!s.isEmpty() && nums[i%n]>=s.peek())
          s.pop();
        if(s.isEmpty())
          ans[i%n]=-1;
        else if(nums[i%n]<s.peek())
          ans[i%n]=s.peek();

         s.push(nums[i%n]);   
    }

    return ans;

    }
}










//     int fg;  
//     for(int i=n-1;i>=0;i--)
//     {  fg=0;
//        for(int j=i+1;j<n;j++)
//        {
//            if(nums[i]<nums[j])
//             {
//                 ans[i]=nums[j];
//                 fg=1;
//                 break;
//             }
//        }

//     //    System.out.println("fg:"+fg);
//          if(fg==0)
//          {
//              for(int k=0;k<n-(n-i);k++)
//              {
//                  if(nums[i]<nums[k])
//                  {
//                      ans[i]=nums[k];
//                      fg=1;
//                      break;
//                  }
//              }
//          }

//         // System.out.println(Arrays.toString(ans));

//          if(fg==0)
//            ans[i]=-1;    

//     }


// return ans;

//         }
// }
         
       
// //            Output: [2,-1,2]

// //            [1,2,3,4,3]
// //            Output: [2,3,4,-1,4]

       
//         int n = nums.length;
//         int[] ans = new int[nums.length];
//         Stack<Integer> stk = new Stack<>();
//         ans[n-1] = -1;
//         stk.push(nums[n-1]);
//         for (int i =  2*n-1 ;i>= 0; i--) {
//             if (stk.peek() > nums[i%n])
//                 ans[i%2] = stk.peek();
//             while (!stk.isEmpty() && stk.peek() <= nums[i%n])
//                 stk.pop();
//             if (stk.isEmpty()) {
//                 ans[i%n] = -1;
//             } else ans[i%n] = stk.peek();
//             stk.push(nums[i%n]);
//         }
//         for (int i : ans)
//             System.out.print(i + " ");
//             return ans;
//     }
// }

