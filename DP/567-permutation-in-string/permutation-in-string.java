class Solution {
    public boolean checkInclusion(String s1, String s2) {
    

    int n1 = s1.length();
    int n2 = s2.length();

      if(n1>n2)
        return false; 

     int [] freq = new int[26];
     int[] freq2 = new int[26];

    
     for(int i = 0; i<s1.length() ; i++)
     {
        freq[s1.charAt(i)-'a']++;
        freq2[s2.charAt(i)-'a']++;

     }

     for(int i = n1 ; i<n2 ; i++)
     {


        if(chkEquals(freq2,freq))//O(n) time 
         {
           
              return true;
         }
          
          freq2[s2.charAt(i)-'a']++; 
          freq2[s2.charAt(i-n1)-'a']--; 
          
       
           
     }       
         if(chkEquals(freq2,freq)) // checking for the last time , in the ablove loop the last slide is unchecked 
         {
           
              return true;
         }
     return false ;    
    }

    public boolean chkEquals(int[] freq, int[] freq2){

        for(int i = 0;i<26;i++)
        {
            if(freq[i]!=freq2[i])
              return false ;
        }
         return true;

    }
}


// Time complexity is O(n^2);
// Space Complexity is O(n);