class Solution {
    public boolean checkInclusion(String s1, String s2) {
    

    int n1 = s1.length();
    int n2 = s2.length();

      if(n1>n2)
        return false; 
     Map<Character,Integer> map1 = new HashMap<>();
     Map<Character,Integer> map2 = new HashMap<>();

     for(int i = 0; i<s1.length() ; i++)
     {
        map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
 
     }

     for(int i = n1 ; i<n2 ; i++)
     {


        if(map1.equals(map2))//O(n) time 
         {
           
              return true;
         }
         
         map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
         map2.put(s2.charAt(i-n1),map2.getOrDefault(s2.charAt(i-n1),0)-1);
             
         if(map2.get(s2.charAt(i-n1))==0)
           map2.remove(s2.charAt(i-n1));  
           
     }       
         if(map1.equals(map2)) // checking for the last time , in the ablove loop the last slide is unchecked 
         {
           
              return true;
         }
     return false ;    
    }
}


// Time complexity is O(n^2);
// Space Complexity is O(n);