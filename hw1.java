import java.util.*;
public class hw1{
public static void main(String[] argv){
    int num,n=2;
    System.out.println("請輸入一整數:");
    Scanner scn = new Scanner(System.in);
    num = scn.nextInt();
    if(num % 2 == 0){
        System.out.println("此數為偶數");
    }else{
        System.out.println("此數為奇數");
    }
}
}
