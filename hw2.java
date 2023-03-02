import java.util.Scanner;
public class hw2{
    public static void main(String[] argv){
        float tempC, tempF;
        System.out.println("請輸入攝氏溫度:");
        Scanner scn = new Scanner(System.in);
        tempC=scn.nextInt();
        tempF=tempC * 9 / 5 + 32;
        System.out.println("現在華氏溫度為"+tempF);
    }
}
