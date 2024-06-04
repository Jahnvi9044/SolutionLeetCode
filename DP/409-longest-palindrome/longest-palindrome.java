class Solution {
    public int longestPalindrome(String s) {

       int[] freq=new int[60];
    
       char[] ch =s.toCharArray();

       for(char i: ch)
      {  
    
       

        freq[(int)i-65]++;
    
      }
      int k = 0 ;
       int sum=0 , odd_max=0;
      for(int i=0;i<60;i++)
      { 
        if(freq[i]%2==0)
            sum+=freq[i];
        
        else 
        {          
            if(odd_max<freq[i])
            {  odd_max = freq[i];
                 k = i;
            }
        }
      }
      
     

       for(int i=0;i<60;i++)
      { 
        if(freq[i]%2!=0 && i!=k)
            sum+=(freq[i]-1);
        
      }

    //    System.out.println(Arrays.toString(freq));
 

      sum+=odd_max;
    

    return sum;
    }
}