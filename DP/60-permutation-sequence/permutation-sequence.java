class Solution {
    public String getPermutation(int n, int k )
    {
     StringBuffer ans =new StringBuffer("");
    ArrayList<Integer> arr = new ArrayList<>();
     for(int i =0;i<n;i++)
     {
        arr.add(i+1);
     }
     k--;
     int ind=0, d=0;

     for(int i = 0;i<n;i++)
     {
           d= fact(arr.size())/arr.size();//sections 
           ind = k/d;
           k= k % d;
           ans.append(arr.get(ind));
           arr.remove(ind); 
             
     }

     return ans.toString();

      
    }



    public int fact(int n){
       if(n==0||n==1)
         return 1;

        return n*fact(n-1); 
    }
}



// k--; // k=8
    //                                  [1,2,3,4]
    // d = 24/4 = 6   fact(n)/n
    // ind = 8/6 = 1  => k/d             2
    // k = k % d => 8 % 6 =>2 
    //                 n--;             [1,3,4]
    // d = 6/3 = 2
    // ind= 2/2 = 1                      3
    // k = 2%2 = 0
    //                 n--;             [1,4]
    // d = 2/2 = 1
    // ind = 0/1  = 0                    1
    // k= 0%1 = 0
    //                 n--;             [4]   
    // d = 1/1= 1
    // ind = 0/1= 0                      4
    // k = 0%1=0

