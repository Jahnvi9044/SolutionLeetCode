import java.util.* ;
import java.io.*; 

class Solution {
    public int[] searchRange(int[] nums, int target) {

          int f=firstIndex(nums, nums.length, target);
          int[] ans=new int[2];
          ans[0]=f;
          if(f==-1)
          {ans[1]=-1;
          return ans;
          }
          int l=lastIndex(nums, nums.length, target);
          ans[1]=l;
          return ans;
    
    
    }

    public static int firstIndex(int[] arr,int n,int k)

    {
        int low=0,high=n-1,mid,ans=-1;
        while(low<=high)
        { mid=(low+high)/2;
           if(arr[mid]==k)
           {
               ans=mid;
               high=mid-1;
           }
            if(arr[mid]<k)
               low=mid+1;
               
           else high=mid-1;    
        }


         return  ans;
          

    }


      public static int lastIndex(int[] arr,int n,int k)

    {
        int low=0,high=n-1,mid,ans=-1;
        while(low<=high)
        { mid=(low+high)/2;
           if(arr[mid]==k)
           {
               ans=mid;
               low=mid+1;
           }
           else if(arr[mid]<k)
               low=mid+1;
           else high=mid-1;    
        }


         return  ans;
          

    }}






















// import java.util.* ;
// import java.io.*; 

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
        
        
//        // System.out.println(Arrays.toString(arr1));
//         int fp=lower_Bound(nums,nums.length,target);
//         int lp=upper_Bound(nums,nums.length,target)-1;
//        // System.out.print(fp+" "+lp);
//         if(fp==nums.length||nums[fp]!=target) {
//             fp=-1;
//             lp=-1;
//         }
       
//         int[] ans=new int[2];
//         ans[0]=fp;
//         ans[1]=lp;
//         return ans;

//     }


//     public static int lower_Bound(int[] arr, int n, int k)
//     {
//         int low=0,high=n-1,mid;
//         int ans=n;
//         while(low<=high)
//         {     mid=(low+high)/2;
//             if(arr[mid]>=k)
//             {
//                 ans=mid;
//                 high=mid-1;
//             }
//             else low=mid+1;
//         }
//         return ans;
//     }

//      public static int upper_Bound(int[] arr, int n, int k)
//     {
//         int low=0,high=n-1,mid;
//         int ans=n;
//         while(low<=high)
//         {     mid=(low+high)/2;
//            if(arr[mid]>k)
//             {
//                 ans=mid;
//                 high=mid-1;
//             }
//             else low=mid+1;
//         }
//         return ans;
//     }

// };


// import java.util.*;
// import java.io.*;
// class Solution {
//     public int[] searchRange(int[] nums, int target) {

//         int[] arr1 = nums;
//         int n=arr1.length;
//         int k=target;
//        // System.out.println(Arrays.toString(arr1));
//         int fp=lower_Bound(arr1,n,k);
//         int lp=floor__(arr1,n,k);
//         System.out.print(fp+" "+lp);
//         if(fp==n||arr1[fp]!=k) {
//             fp=-1;
//             lp=-1;
//         }
//         if(lp==-1||arr1[lp]!=k)
//         {
//             fp=-1;
//             lp=-1;
//         }
//         int[] ans=new int[2];
//         ans[0]=fp;
//         ans[1]=lp;
//         return ans;

//     }


//     public static int lower_Bound(int[] arr, int n, int k)
//     {
//         int low=0,high=n-1,mid;
//         int ans=n;
//         while(low<=high)
//         {     mid=(low+high)/2;
//             if(arr[mid]>=k)
//             {
//                 ans=mid;
//                 high=mid-1;
//             }
//             else low=mid+1;
//         }
//         return ans;
//     }

//      public static int floor__(int[] arr, int n, int k)
//     {
//         int low=0,high=n-1,mid;
//         int ans=-1;
//         while(low<=high)
//         {     mid=(low+high)/2;
//             if(arr[mid]<=k)
//             {
//                 ans=mid;
//                 low=mid+1;
//             }
//             else high=mid-1;
//         }
//         return ans;
//     }


// };
