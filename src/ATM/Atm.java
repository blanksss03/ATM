package ATM;

import java.io.IOException;
import java.util.Scanner;

public class Atm {

    static void atmMain() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하여 주십시오.");

        String name = sc.next();

        User user = UserController.UserLoad(name);

        System.out.println("원하시는 거래를 선택하십시오.");
        System.out.println("1.     예금인출");
        System.out.println("2.     예금조회");
        System.out.println("3.     입금");
        System.out.println("4.     계좌이체");
        System.out.println("나머지. 프로그램 종료");

        String number;

        while (true) {
            number = sc.next();
            int accountNumber;
            int howMuch;
            switch (number) {
                case "1":
                    System.out.println("금액을 입력하십시오.");

                    howMuch = sc.nextInt();
                    user.minusMoney(howMuch);

                    System.out.println("=============================================");
                    System.out.println(howMuch + "원을 출금하였습니다.");
                    System.out.println("잔액 " + user.getMoney() + " 원");
                    System.out.println("=============================================");

                    UserController.UserSave(user);
                    break;
                case "2":
                    System.out.println("=============================================");
                    System.out.println(user.getName() + "님의 계좌에는 " + user.getMoney() + "원이 있습니다.");
                    System.out.println("=============================================");

                    break;
                case "3":
                    System.out.println("금액을 입력하십시오.");

                    howMuch = sc.nextInt();
                    user.insertMoney(howMuch);

                    System.out.println("=============================================");
                    System.out.println(howMuch + "원을 입금완료. 현재 계좌에는 "+ user.getMoney() + "원이 있습니다.");
                    System.out.println("잔액 " + user.getMoney() + " 원");
                    System.out.println("=============================================");

                    UserController.UserSave(user);

                    break;

                case "4":
                    System.out.println("보내려는 분의 성함을 입력해주십시오.");

                    name = sc.next();

                    User user2 = UserController.UserLoad(name);

                    System.out.println("금액을 입력하십시오.");

                    howMuch = sc.nextInt();

                    user2.insertMoney(howMuch);
                    user.minusMoney(howMuch);

                    System.out.println(user.getName() + "님의 계좌에서 " + user2.getName() + "님 계좌로 " + howMuch + "원을 입금하였습니다.");
                    System.out.println(user.getName() + "님의 계좌에는 " + user.getMoney() + "원이 있습니다.");
                    System.out.println(user2.getName() + "님의 계좌에는 " + user2.getMoney() + "원이 있습니다.");

                    UserController.UserSave(user);
                    UserController.UserSave(user2);

                    break;

                default:
                    System.exit(0);
            }

        }
    }
}
