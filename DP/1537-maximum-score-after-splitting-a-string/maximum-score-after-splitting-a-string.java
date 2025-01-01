class Solution {
    public int maxScore(String s) {
        
     int n =s.length();
     int arr0[] = new int[n];
     int k = 0 ;
     
     for(int i = 0 ; i<n ; i++ )
     {
        if(s.charAt(i)=='0')
          {
            arr0[i] = k + 1; 
            k=arr0[i];
          }
          else arr0[i] = k;
     }
 

    int [] arr1=new int[n];
      k = 0;

      for(int i = n-1 ; i>=0 ; i-- )
     {
        if(s.charAt(i)=='1')
          {
            arr1[i] = k + 1; 
            k = arr1[i];
          }
          else arr1[i] = k;
     }

    int max = 0 ;
    for(int i = 0;i<n-1;i++)
    {
        int ans = arr0[i] + arr1[i+1];
        max = (max>(ans))?max:ans;
    }
    //  System.out.println(Arrays.toString(arr0));
    //  System.out.println(Arrays.toString(arr1));     
      return max;
    }
}