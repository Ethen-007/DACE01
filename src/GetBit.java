import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bit");
        int n =sc.nextInt();
        int pos=2;
        int bitMask=1<<pos;// left shift or right shift to get the 1 to the corresponding position
        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
