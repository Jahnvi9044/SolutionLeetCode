class Solution {
    public int longestPalindrome(String s) {

       int[] freq=new int[58];
    
       char[] ch =s.toCharArray();

       for(char i: ch)
      {  
        freq[(int)i-65]++;
      }
     
       int sum=0 ;
       boolean fg=false;
      for(int i=0;i<58;i++)
      { 
        if(freq[i]%2==0)
            sum+=freq[i];
        else
        {
               sum+=(freq[i]-1);
               fg=true;
        }    
        
      }
      

     
        
     if(fg==true)
         sum+=1;

    //    System.out.println(Arrays.toString(freq));
 

    
    

    return sum;
    }
}