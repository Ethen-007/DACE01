import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The number pyramid of " + num + " is ");
        for(int i = 1; i <= num; i++){
            //spaces
            for(int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            //printing number
            for(int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
