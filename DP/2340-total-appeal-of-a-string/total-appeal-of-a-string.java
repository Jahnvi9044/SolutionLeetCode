class Solution {
    public long appealSum(String s) {

     
        long  n = s.length(); 
        long no = n*(n+1)/2;
        long sum = 0l ;

        for(char ch = 'a';ch<='z';ch++)  
        {  
            List<Integer> list = new ArrayList<>();
            list.add(-1);
           for( int i = 0 ; i<s.length() ; i++)
           {
               if(s.charAt(i)==ch)
              {
                 list.add(i);
             
              }
        
            }
            list.add(s.length()); 


             long sub = 0l;
             long contri= 0l ;

              for(int i = 0;i<list.size()-1;i++)
             {

                long   su = list.get(i+1)-list.get(i)-1;
                 su = su*(su+1)/2;
                 sub += su ;  

             }

            contri = no - sub ; 
            sum += contri;
            


        }
            // System.out.println(sum);

        return sum ;
    }
}