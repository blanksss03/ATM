package ATM;

import java.util.Scanner;

public class AccountManager {
    static void createAccount() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하여 주십시오. (프로그램 종료는 종료를 입력하시오.)");

            String name = sc.next();
            if (name.equals("종료")) {
                System.exit(0);
            }
            System.out.println("얼마를 입금하시겠습니까?");

            int money = sc.nextInt();

            System.out.println("계좌번호를 입력하십시오.");

            String accountNumber = sc.next();

            User user = new User(name, accountNumber, money);

            UserController.saveUser(user);
        }

    }

}
