class Solution {
    public List<String> commonChars(String[] words) {
            
           
               

               List<String> list = new ArrayList<>();
                char[] ch = words[0].toCharArray();
               for( char c : ch)
               {
                list.add(c+"");
               }
               if(words.length ==1)
                 return list;

               for(int  i = 1 ;i<words.length;i++){
                    
                     List<String> newLis = new ArrayList<>();   
                     char[] ch1 = words[i].toCharArray();
                        for( char c : ch1)   
                     {  
                        if(list.contains(c+""))
                           {
                             newLis.add(c+"");
                             list.remove(c+"");
                           }
                    }
           
           list  = newLis;
          

               }  

               return list ; 

    }
}