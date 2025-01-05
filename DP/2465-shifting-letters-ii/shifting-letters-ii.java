class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        
        int n  = s.length() ; 
        int m = shifts.length;  
        
        
          
          int [] arr = new int[n];
        for( int i = 0 ; i<m ; i++ )
        {
           int start = shifts[i][0];
           int end = shifts[i][1];

           
              if(shifts[i][2]==1) 
              {
                arr[start]++;
                if(end+1<n)
                {
                    arr[end+1]--;
                }
              } 
              else if(shifts[i][2]==0) 
              {
                 arr[start]--;
                 if(end+1<n)
                 {
                    arr[end+1]++;
                 }
              }

        }

        String st = "";
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            char ch = s.charAt(i);
            sum = (sum+arr[i])%26;
            int k = (int)ch+sum;
         
            if(k>122)
            {
                k=k%122;
                k+=96;
            } 
            else if(k<97)
            {   
                k= k%97;
                k=97-k;
              
                k=123-k;
            }
        
            
            ch= (char)(k);
            st+=ch;
        }



         System.out.println(Arrays.toString(arr));
        return st;    
    }
}