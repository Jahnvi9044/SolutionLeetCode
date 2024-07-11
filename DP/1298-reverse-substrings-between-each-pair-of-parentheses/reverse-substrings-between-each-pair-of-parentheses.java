class Solution {
    public String reverseParentheses(String s) {
    
          s="(("+s+"))";

           Stack<Character> stack = new Stack<>() ; 
           
           int i = 0;
           String sol = "",newSt="";
           while(s.length() > i)
           {
               
            //    System.out.println(s.charAt(i));
            try{
            while( s.charAt(i) != ')' )
            {
                stack.push(s.charAt(i));
                i++;
            }
          
            // System.out.println(stack);

            if(s.charAt(i)==')')
            {   
                
                i++;
                 newSt="";
                while( stack.peek()!='(')
                 {
                     newSt = newSt + stack.pop(); 

                 }
                //  System.out.println(newSt);
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
            catch(StringIndexOutOfBoundsException e )
            {   
                System.out.println("Error"+i+" "+s.length());
            }
           }


           return sol;

    }
}