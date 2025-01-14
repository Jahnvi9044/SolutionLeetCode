class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();


        for(Character ch :s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // Iterator it = map.iterator();
        int count = 0;
        
        for(Integer i : map.values())
        {
             if(i<=2) count+=i;

            else if(i%2==0) count+=2;
            else count+=1;
        }

        
        return count;

    }
}