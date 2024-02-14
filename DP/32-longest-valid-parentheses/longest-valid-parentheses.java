class Solution {
    public int longestValidParentheses(String s) {
           
         int n=s.length();
         int count=0;
         int max=0;

         Stack<Integer> st=new Stack<>();

         for(int i=0;i<s.length();i++)
         {  char ch=s.charAt(i);
             if(!st.isEmpty() && ch==')')
              {
                  if(s.charAt(st.peek())=='(')
                  {
                      st.pop();
                      if(st.isEmpty())
                        max=Math.max(max,i-(-1));
                      else 
                        max=Math.max(max,i-st.peek());  
                  }
                  else st.push(i);  
              }
             else if(st.isEmpty() && ch==')')
             {  
                 st.push(i);
             }
             else st.push(i);

         }

       return max;
         

    }
}








//          int si=0;
//          int smax=0;
//          Deque<Character> stack=new ArrayDeque<>();
//            for(int i=0;i<n;i++ )
//            {
//                char ch=s.charAt(i);
//                if(stack.isEmpty() && ch==')')
//                {
//                    if(si>smax)
//                      smax=si;
//                    si=0;  
//                }
//                else if(ch=='(')
//                {
//                    stack.offerLast('(');
//                }
//                else if(ch==')')
//                {
                  
//                 si+=2;
//                  System.out.println(si);
//                 stack.pollLast();
//                }
//            }

//            if(si>smax)
//             smax=si;
//             return smax;




//     }
// }