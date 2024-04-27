//Strings in Java are immutable
public class Strings {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String name= sc.nextLine();// This is the method to read the full string
        //Concatenation
        String firstName="Tony";
        String newName="Tony";
        String lastName="Kyle";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());//length function used for calculating the length of string

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
        //compare
        if(newName.compareTo(firstName)==0){
            System.out.println("Strings are equal");
        }
        //Substring
        System.out.println(fullName.substring(0,3));//prints the substring from 0 to 2

        //Strings are immutable
    }
}
