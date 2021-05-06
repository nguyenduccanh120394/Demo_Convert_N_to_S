import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        System.out.println("Enter Amount of Money(in USD)");
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        int USD = sc.nextInt();
        int VND = USD*rate;
        if (USD>0){
            System.out.printf("%d USD Conver VND is %d vnđ ",USD,VND);
        }else {
            System.out.println("Input Unvalid");
        }
    }
}
