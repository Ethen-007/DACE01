import java.util.ArrayList;
class DecodeString {
  public String decodeString(String s){
    ArrayList<String> list = new ArrayList<>();
    for(char ch : s.toCharArray()){
      if(ch != ']'){
        list.add(String.valueOf(ch));
      }else{
        StringBuilder curr = new StringBuilder();
        while(!list.isEmpty() && !list.get(list.size()-1).equals("[")){
          curr.insert(0,list.remove(list.size()-1));
        }
        if(!list.isEmpty() && list.get(list.size()-1).equals("[")){
          list.remove(list.size()-1);
        }
        StringBuilder num = new StringBuilder();
        while(!list.isEmpty() && Character.isDigit(list.get(list.size()-1).charAt(0))){
          num.insert(0,list.remove(list.size()-1));
        }
        int repeatTime = Integer.parseInt(num.toString());
        String repeatStr = curr.toString().repeat(repeatTime);
        list.add(repeatStr);
      }
    }
    StringBuilder result = new StringBuilder();
    for(String str : list){
      result.append(str);
    }
   return result.toString();
  }
}

//Same implementation with Stack class

// import java.util.Stack;
// class Solution{
//   public String decodeString(String s){
//     Stack<String> stack = new Stack<>();
//     for(char ch : s.toCharArray()){
//       if(ch !=']'){
//         stack.push(String.valueOf(ch));
//       }else{
//         StringBuilder curr = new StringBuilder();
//         while(!stack.isEmpty() && !stack.peek().equals("]")){
//           curr.insert(0,stack.pop());
//         }
//         stack.pop();
//         StringBuilder num = new StringBuilder();
//         while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
//           num.insert(0,stack.pop());
//         }
//         int repeatTimes = Integer.parseInt(num.toString());
//         String repeatStr = curr.toString().repeat(repeatTimes);
//         stack.push(repeatStr);
//       }
//     }
//     StringBuilder result = new StringBuilder();
//     for(String str: stack){
//       result.append(str)}
//     return result.toString();
//   }
// }
        
      
        
      
