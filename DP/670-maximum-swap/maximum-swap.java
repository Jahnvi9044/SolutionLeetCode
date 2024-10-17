class Solution {
    public int maximumSwap(int num) {
        
        String st =Integer.toString(num);    
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> max = new ArrayList<Integer>();
         arr.add(-100);
         max.add(-100);
        int max_ele = -1 ;
        int n =st.length(); 
        for(int i =n-1 ; i>=0 ;i-- )
        {  
            int ch = (int)st.charAt(i)-48;
            arr.add(0,ch);
            if( max_ele<ch  )
            {   max_ele = ch ;
                max.add(0,-1);
            }
            else max.add(0,max_ele);   
        }

         int no = 0;
         int fg= 0 ;
        for(int i = 0;i<n;i++)
        { 
            if(arr.get(i)<max.get(i)&& fg==0)
            {   fg=1;
                int temp =arr.get(i);
                int ind = arr.lastIndexOf(max.get(i));
                arr.set(i,max.get(i));
                arr.set(ind,temp);
                
            }
            
             no = no*10 + arr.get(i);
             arr.set(i,-1);
             max.set(i,-1);
        }

          
     

        return no;

    }
}