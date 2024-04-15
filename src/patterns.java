import java.util.Scanner;
public class patterns {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c= sc.nextInt();
        //Hollow Rectangle
        //outer loop
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
