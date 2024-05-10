import java.util.Scanner;

public class TowerofHanoi {
    public static void towerofhanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+ n + " from "+ src+ " to "+ dest);
            return;
        }
        towerofhanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+ n + " from "+ src+ " to "+ dest);
        towerofhanoi(n-1,helper,dest,src);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        towerofhanoi(n,"S","H","D");
    }
}
