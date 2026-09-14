class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char charAtI = '.';
        char peekStack = '.';

        for(int i = 0 ; i< s.length() ; i++){
            charAtI = s.charAt(i);
            if (charAtI == '(' || charAtI == '{' || charAtI == '['){
                stack.push(charAtI);
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                else{
                    peekStack = stack.peek();
                    if ((s.charAt(i) == ')' && peekStack == '(' ) ||
                        (s.charAt(i) == '}' && peekStack == '{' ) ||
                        (s.charAt(i) == ']' && peekStack == '[' ) ){                              
                        stack.pop();
                    }
                    else return false;
                    
                } 
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        else return false;
    }
}

// without using variables for peek and charAt
// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for(int i = 0 ; i< s.length() ; i++){
//             if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
//                 stack.push(s.charAt(i));
//             }
//             else{
//                 if (stack.isEmpty()){
//                     return false;
//                 }
//                 else{
//                     if ((s.charAt(i) == ')' && stack.peek() == '(' ) ||
//                         (s.charAt(i) == '}' && stack.peek() == '{' ) ||
//                         (s.charAt(i) == ']' && stack.peek() == '[' ) ){                              
//                         stack.pop();
//                     }
//                     else return false;
                    
//                 } 
//             }
//         }
//         if (stack.isEmpty()){
//             return true;
//         }
//         else return false;
//     }
// }
