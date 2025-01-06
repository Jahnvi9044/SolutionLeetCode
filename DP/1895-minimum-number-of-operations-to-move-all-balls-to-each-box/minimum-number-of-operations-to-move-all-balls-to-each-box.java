class Solution {
    public int[] minOperations(String boxes) {
    
    ArrayList<Integer> arr = new ArrayList<Integer>();

    for(int  i = 0 ; i<boxes.length() ; i++ )
    {
        if(boxes.charAt(i)=='1')
        {
          arr.add(i);
        }

    } 
    int n = boxes.length();
    int[] ans = new int[n];

    for(int i = 0;i<n;i++)
    {
       for(int j:arr)   
         ans[i] += Math.abs(i-j);    
    } 

    return ans;
     

    }
}