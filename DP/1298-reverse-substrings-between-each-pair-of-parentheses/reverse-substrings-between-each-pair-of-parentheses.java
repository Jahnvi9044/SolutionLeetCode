class Solution {
    public String reverseParentheses(String s) {
    
          s="(("+s+"))";

           Stack<Character> stack = new Stack<>() ; 
           
           int i = 0;
           String sol = "",newSt="";
           while(s.length() > i)
           {
               
    
            while( s.charAt(i) != ')' )
            {
                stack.push(s.charAt(i));
                i++;
            }
          

            if(s.charAt(i)==')')
            {   
                
                i++;
                 newSt="";
                while( stack.peek()!='(')
                 {
                     newSt = newSt + stack.pop(); 

                 }
    
                 sol = newSt;
                 
                    stack.pop();
                 if(!stack.isEmpty())
                 {   
                        for(int j = 0; j<newSt.length() ; j++)
                        {
                            stack.push(newSt.charAt(j));
                        }
                        
                 }  
            }

            
           }


           return sol;

    }
}