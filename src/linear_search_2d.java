import java.util.Scanner;

public class linear_search_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //linear search
        System.out.println("Enter the element to be searched: ");
        int search = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == search) {
                    System.out.println("Element found at position " + "["+i+","+j+"]");
                }
            }
        }


    }
}
