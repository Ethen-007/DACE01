import java.util.Scanner;

public class Functions {
    public static void printMyName(String  name){// void used since no item is returned
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        printMyName(name);//other methods are called from the main function
    }
}
