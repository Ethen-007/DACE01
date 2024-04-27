import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 : set oper=0 : clear
        int n = sc.nextInt();
        int pos = sc.nextInt();

        int bitMask = 1<<pos;
        if(oper == 1){
            //set
            int newNumber = bitMask |n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask&n;
            System.out.println(newNumber);
        }
    }
}
