class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     int n1 =nums1.length;
     int n2 =nums2.length;   

     int[] freq = new int[10001];
     Stack<Integer>  s = new Stack<>();
     for(int i = n2-1; i>=0 ; i--)
     {
        
                while(!s.isEmpty() && nums2[i]>=s.peek())
                {
                    s.pop();
                }

                if(s.isEmpty())
                {
                    freq[nums2[i]]=-1;
                }

                else if(nums2[i]<s.peek())
                {
                    freq[nums2[i]]=s.peek();
                }

            

            s.push(nums2[i]);   

     }

    //  System.out.print(Arrays.toString(freq));
    

    int [] ans = new int[nums1.length];

    for(int  i =0 ;i<nums1.length;i++)
    {
        ans[i] = freq[nums1[i]];

    }

    return ans ;
    }
}