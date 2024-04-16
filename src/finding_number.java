import java.util.Scanner;

public class finding_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //Entering the elements in array
        for(int i = 0; i < size; i++){
            System.out.println("Enter the elements of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find: ");
        int element = sc.nextInt();
        for(int i = 0; i < size; i++) {
            if(arr[i] == element) {
                System.out.println("Element found at position " + i + " : " + element);
            }
        }
    }
}
