package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. 계좌생성");
        System.out.println("2. ATM");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 1)
        {
            AccountManager.createAccount();
        }
        else
        {
            Atm.atmMain();
        }
    }
}
