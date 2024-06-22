import java.util.*;
public class array {
    public static void main(String[] args){
        int[] marks= new int[3];
        marks[0]=97;
        marks[2]=87;
        marks[1]=45;
        System.out.println(marks);// We receive a jargon value
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //printing the values in a array using for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
