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
                    for(int j = 0;j<words[i].length();j++)
                    {    
                        char k = words[i].charAt(j);

                        if(list.contains(k+""))
                           {
                             newLis.add(k+"");
                             list.remove(k+"");
                           }
                    }
           
           list  = newLis;
                   
               }  

               return list ; 

    }
}