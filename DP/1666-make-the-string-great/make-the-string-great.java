class Solution {
    public String makeGood(String s) {
        Stack<Character>  st= new Stack<Character>();
          int n=s.length();
          int i=0;
        while(i<n)
        {      
           

           if(!st.isEmpty() && Character.isUpperCase(s.charAt(i)) && st.peek()==Character.toLowerCase(s.charAt(i)))
           {    

               System.out.println(s.charAt(i));
               st.pop();
           }
           else if(!st.isEmpty() && Character.isLowerCase(s.charAt(i)) && st.peek()==Character.toUpperCase(s.charAt(i)))
           {    

               System.out.println(s.charAt(i));
               st.pop();
           }
            
            else st.push(s.charAt(i));
            i++;
        }

        String ans="";
        while(!st.isEmpty())
        {
               ans = st.pop()+ans;
        }

         return ans;
    }
}