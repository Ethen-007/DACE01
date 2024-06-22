import java.util.Scanner;

public class inverted_180triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        //half pyramid rotated 180 degree
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//this is for printing the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
