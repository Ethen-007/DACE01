import java.util.Scanner;

public class TowerofHanoi {
    public static void towerofhanoi(int n,String from_rod,String to_rod,String helper_rod){
        if(n==1){
            System.out.println("transfer disk "+ n + " from "+ from_rod+ " to "+ to_rod);
            return;
        }
        towerofhanoi(n-1,from_rod,helper_rod,to_rod);
        System.out.println("transfer disk "+ n + " from "+ from_rod+ " to "+ to_rod);
        towerofhanoi(n-1,helper_rod,to_rod,from_rod);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        towerofhanoi(n,"S","D","H");
    }
}
