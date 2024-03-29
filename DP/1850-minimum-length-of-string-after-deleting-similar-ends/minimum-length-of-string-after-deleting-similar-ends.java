class Solution {
    public int minimumLength(String s) {

        int n=s.length();
        int i=0,j=n-1;

        while(i!=j && s.charAt(i)==s.charAt(j))
        {
            while( i<n-1 && i<j && s.charAt(i)==s.charAt(i+1))
             i++;
            i++; 
            while(j>0 && j>i && s.charAt(j)==s.charAt(j-1))   
              j--;
            j--;  

            if(i>=j)
            break;
            
        }

        if(i>j) return 0;  

        return j-i+1;
     
    }
}