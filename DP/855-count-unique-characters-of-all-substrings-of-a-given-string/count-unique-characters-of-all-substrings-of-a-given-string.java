class Solution {
    public int uniqueLetterString(String s) {


        HashMap<Character , List<Integer>> map = new HashMap<>();
         
        for(int i = 0; i<s.length(); i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),new ArrayList<>());
                map.get(s.charAt(i)).add(-1);
            }
            map.get(s.charAt(i)).add(i);
        }

        for(int i = 0; i<s.length(); i++)
        {
            map.get(s.charAt(i)).add(s.length());

        }

        int sum = 0;
        for( char ch = 'A' ; ch<= 'Z'; ch++)
        {   if(map.containsKey(ch))
           { 

            List<Integer> list = map.get(ch);
         
         
            for(int i = 1;i<list.size()-1;i++)
            {
                sum = sum + (list.get(i)-list.get(i-1))*(list.get(i+1)-list.get(i));
            }  


           }
        }

        return sum ;

         
    }
}