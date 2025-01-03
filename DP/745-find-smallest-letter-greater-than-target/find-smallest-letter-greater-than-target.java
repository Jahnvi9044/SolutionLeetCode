class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int low = 0, high = letters.length-1 ,mid = 0;
         int ans = 0 ;
        while(low <= high)
        {
            mid =(low + high)/2;
            if((int)letters[mid]>(int)target)
            {
                ans= mid ; 
                high = mid - 1 ;
            }
            else 
              low = mid + 1 ;
        } 

        return letters[ans];
    }
}