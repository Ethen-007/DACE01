import java.util.Scanner;

public class InsertionSrt {
    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Sort(int[] arr) {
        //insertion sort
        for(int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]){
                arr[j+1]=arr[j];// j index is to keep track of the unsorted part . In insertion sort there are two parts unsorted and sorted part
                j--;
            }
            //placement
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Sort(arr);
        PrintArray(arr);
    }
}
