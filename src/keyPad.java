import java.util.Scanner;

public class keyPad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str , int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i =0;i<mapping.length();i++){
            printCombination(str,idx+1,combination+mapping.charAt(i));
        }}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String s = sc.nextLine();
            printCombination(s,0,"");
        }
    }

