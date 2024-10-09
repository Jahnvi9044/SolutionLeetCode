

class Solution {
    public int minAddToMakeValid(String s) {
        

      int stack = 0;
      int count = 0;
         int i = 0;
         int n = s.length(); 
      while(i<n)
      {
        char ch = s.charAt(i);

        if(ch == '(' )
          stack++;
        else if(ch==')' && stack!=0)
           stack--;
        else if(ch==')' && stack==0)
           count++; 

           i++;    
      }

     count +=  stack;
     
     return count;
    }
}
















































// import java.util.*;

// class Solution {
//     public int minAddToMakeValid(String s) {
//       int n=s.length();
//       int count=0;
//        int  st = 0;
//        for(char ch:s.toCharArray())
//        {
//          if( st==0 && ch==')' )
//             count++;
//          else if(st>0 && ch==')')
//              st--;
//          else st++;

//        }
       
//        return count+st;
//     }
// }
// //        int count=0;
// //         int stack=0;
// //         for(int i=0;i<n;i++)
// //         {    
// //             ch=s.charAt(i);

// //             if(ch==')' && stack==0)
// //             { count++;
// //               continue;  
// //             }
// //             else if(ch=='(')
// //               stack++;
// //             else if(ch==')')
// //                stack--;  


// //         }

// //         while(stack!=0)
// //         {
// //             stack--;
// //             count++;
// //         }

// //         return count;


        
// //     }
// // }


// // // "(()(((((()()))()()))("




// // // (
// // // (       
// // // (
// // //   = 3




// // // https://certificate.codingninjas.com/coding_recap/033f239bc8050d43
