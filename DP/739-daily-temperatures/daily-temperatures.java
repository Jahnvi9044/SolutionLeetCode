class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //  ngr

        int n=temperatures.length;
        int[] ans=new int[n];
        ArrayDeque<Integer> arr=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--)
        {
                while(arr.size()>0 && temperatures[arr.peekLast()]<=temperatures[i])
                 arr.removeLast();
                 if(arr.isEmpty())
                   ans[i]=0;
                 else 
                    ans[i] =  arr.peekLast()-i ;


              arr.addLast(i);

                 
        }   

        return ans; 
    }
}