class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long  sum = 0;
        int k = n-1 ;
        for(int i = 0 ;i<n;i++)
        {  char ch = s.charAt(i);
            if(ch == '1')
            {   
               sum += k-i;
                k--;
            }
        }
    //   System.out.println(sum);
      return sum;
    }
}