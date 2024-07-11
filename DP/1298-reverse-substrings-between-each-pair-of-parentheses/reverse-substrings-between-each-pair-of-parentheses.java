class Solution {
    public String reverseParentheses(String s) {

           Stack<StringBuffer> stack = new Stack<>() ; 
           StringBuffer str = new StringBuffer() ; 
           int i = 0 ;
    
           
           for( i= 0 ; i<s.length() ; i++ )
           { 

            char ch = s.charAt(i);
            
            if( ch =='(')
            {   
                 stack.push( str );
                 str = new StringBuffer() ; 

            }
             
            else if( ch ==')')
            {   
                    str.reverse();
                    if(!stack.isEmpty())
                    {
                        stack.peek().append(str);
                        str = stack.pop();
                    }
            }

            else 
              str.append(ch);

            
           }


           return str.toString();

    }
}