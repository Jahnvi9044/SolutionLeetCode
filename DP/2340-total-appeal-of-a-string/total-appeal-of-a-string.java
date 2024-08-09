class Solution {
    public long appealSum(String s) {

        HashMap<Character,List<Long>> map = new HashMap<>();
        long  n = s.length(); 
        for( int i = 0 ; i<s.length() ; i++)
        {
           if(!map.containsKey(s.charAt(i)))
           {
              map.put(s.charAt(i),new ArrayList<>());
              map.get(s.charAt(i)).add(-1l);
             
           }
         
           map.get(s.charAt(i)).add((long)i);
          
        }
      
        for(List<Long> e :map.values()  )
        {
           e.add(n);
        }
         
          long no = n*(n+1)/2;
          long sum = 0l ;
         
         for (Map.Entry<Character, List<Long>> entry : map.entrySet())
         {

            long sub = 0l;
            long contri= 0l ;
            List<Long> list = entry.getValue();
            for(int i = 0;i<list.size()-1;i++)
            {

              long   su = list.get(i+1)-list.get(i)-1;
                su = su*(su+1)/2;
                sub += su ;  

            }

            contri = no - sub ; 
            sum += contri;
            
         } 
            System.out.println(sum);

        return sum ;
    }
}