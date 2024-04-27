import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bit");
        int n = sc.nextInt();
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask |n;
        System.out.println("New Number: " + newNumber);
    }
}
