class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        int n1=order.length();
        String res="";

        for(int i=0;i<n1;i++)
        {   

            int count=map.getOrDefault(order.charAt(i),0);
            while(count-->0)
              res=res+order.charAt(i);
            map.put(order.charAt(i),-1);  
        }

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> entry = it.next();
            char ch = entry.getKey();
            int c = entry.getValue();
            
            while (c-- > 0) {
                // Append the character 'c' times to the result string
                res += ch;
            }
        }
        System.out.println(res);


        return   res;
    }
}