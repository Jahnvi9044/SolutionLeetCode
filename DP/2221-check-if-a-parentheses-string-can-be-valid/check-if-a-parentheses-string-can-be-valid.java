// class Solution {
//     public boolean canBeValid(String s, String locked) {
//           int n = s.length();

//           if(n%2!=0) return false ;

//           Stack<Pair> stack = new Stack<>();

//           for(int i = 0;i<n;i++)
//           {  char ch1 = s.charAt(i);
//              char ch2 = locked.charAt(i);
//             if(stack.isEmpty() &&  ch1==')' && ch2=='1' ) return false;

//             if(ch1==')' && stack.peek().ch=='(')
//               stack.pop();
//             else if (ch1==')' && ch2=='1' && stack.peek().ch==')' && stack.peek().val=='0')
//               stack.pop();
//             else if(ch1=='(')
//               stack.push(new Pair(ch1,ch2));    
//             else if(ch1==')' && ch2=='0')
//               stack.push(new Pair(ch1,ch2));   
//           }

// (1
// )0

//           if(stack.isEmpty()) return true ; 
           
//            int one = 0 , zero = 0 ;
//           while(!stach.isEmpty())
//           {
//             if(stack.peek().val=='1')
//             {

//             }
//           }
//     }
// }

// class Pair
// {
//     char ch ;
//     char val;

//     Pair(char ch , char val)
//     {
//         this.ch = ch ;

//         this.val = val ;  
//     }
// }\\import java.util.Stack;

class Solution {
    public boolean canBeValid(String s, String locked) {
        int stringLength = s.length();
        if (stringLength % 2 == 1) {
            return false;
        }

        Stack<Integer> openIndices = new Stack<>();
        Stack<Integer> unlockedIndices = new Stack<>();

        // Traverse the string
        for (int i = 0; i < stringLength; i++) {
            if (locked.charAt(i) == '0') {
                unlockedIndices.push(i);
            } else if (s.charAt(i) == '(') {
                openIndices.push(i);
            } else if (s.charAt(i) == ')') {
                if (!openIndices.isEmpty()) {
                    openIndices.pop();
                } else if (!unlockedIndices.isEmpty()) {
                    unlockedIndices.pop();
                } else {
                    return false;
                }
            }
        }

        // Match remaining open parentheses
        while (!openIndices.isEmpty() && !unlockedIndices.isEmpty() &&
               openIndices.peek() < unlockedIndices.peek()) {
            openIndices.pop();
            unlockedIndices.pop();
        }

        // Final check
        if (openIndices.isEmpty() && !unlockedIndices.isEmpty()) {
            return unlockedIndices.size() % 2 == 0;
        }

        return openIndices.isEmpty();
    }
}