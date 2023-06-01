package ATM;

import java.util.Scanner;

public class Atm {

    void sendMoney(User user1, User user2, int money) {

    }

    void atmMain() {
        User user = new User("심상진", 12345678, 50000);
        User user2 = new User("김현빈", 1234567, 50000);

        System.out.println("원하시는 메뉴를 선택해주십시오.");
        System.out.println("1. 예금출금");
        System.out.println("2. 예금조회");
        System.out.println("3. 입금");
        System.out.println("4. 계좌이체");

        Scanner sc = new Scanner(System.in);
        String number;

        while (true) {
            number = sc.next();
            int accountNumber;
            int howMuch;
            switch (number) {
                case "1":
                    System.out.println("출금하려는 계좌의 계좌번호를 입력하여 주십시오.");
                    accountNumber = sc.nextInt();
                    if (user.getAccountNumber() != accountNumber) {
                        System.out.println("잘못된 계좌번호 입니다.");
                        break;
                    }
                    else{
                        System.out.println("얼마를 출금하시겠습니까?");
                        howMuch = sc.nextInt();
                        user.minusMoney(howMuch);
                        System.out.println(user.getName() + "님의 계좌에는 " + user.getMoney() + "원이 있습니다.");
                        break;
                    }
                case "2":
                    System.out.println("조회하려는 계좌의 계좌번호를 입력하여 주십시오.");
                    accountNumber = sc.nextInt();
                    if (user.getAccountNumber() != accountNumber) {
                        System.out.println("잘못된 계좌번호 입니다.");
                        break;
                    }
                    else{
                        System.out.println(user.getName() + "님의 계좌에는 " + user.getMoney() + "원이 있습니다.");
                        break;
                    }
                case "3":
                    System.out.println("입금하려는 계좌의 계좌번호를 입력하여 주십시오.");
                    accountNumber = sc.nextInt();
                    if (user.getAccountNumber() != accountNumber) {
                        System.out.println("잘못된 계좌번호 입니다.");
                        break;
                    }
                    else{
                        System.out.println("얼마를 입금하시겠습니까?");
                        howMuch = sc.nextInt();
                        user.insertMoney(howMuch);
                        System.out.println(user.getName() + "님의 계좌에 " + howMuch + "원을 입금하였습니다. 현재 계좌에는 "+ user.getMoney() + "원이 있습니다.");
                        break;
                    }
                case "4": {
                    System.out.println("돈을 빼려는 계좌의 계좌 번호를 입력해 주십시오.");
                    accountNumber = sc.nextInt();
                    if (user.getAccountNumber() == accountNumber) {
                        System.out.println("보내려는 계좌의 계좌번호를 입력해주십시오.");
                        accountNumber = sc.nextInt();
                        if (user2.getAccountNumber() != accountNumber) {
                            System.out.println("잘못된 계좌번호 입니다.");
                            break;
                        }
                        else{
                            System.out.println("얼마를 입금하시겠습니까?");
                            howMuch = sc.nextInt();
                            user2.insertMoney(howMuch);
                            user.minusMoney(howMuch);
                            System.out.println(user.getName() + "님의 계좌에서 " + user2.getName() + "님 계좌로" + howMuch + "원을 입금하였습니다.");
                            System.out.println(user.getName() + "님의 계좌에는 " + user.getMoney() + "원이 있습니다.");
                            System.out.println(user2.getName() + "님의 계좌에는 " + user2.getMoney() + "원이 있습니다.");
                            break;
                        }

                    }
                    else if(user2.getAccountNumber() == accountNumber)
                    {
                        System.out.println("보내려는 계좌의 계좌번호를 입력해주십시오.");
                        accountNumber = sc.nextInt();
                        if (user.getAccountNumber() != accountNumber) {
                            System.out.println("잘못된 계좌번호 입니다.");
                            break;
                        }
                        else{
                            System.out.println("얼마를 입금하시겠습니까?");
                            howMuch = sc.nextInt();
                            user.insertMoney(howMuch);
                            user2.minusMoney(howMuch);
                            System.out.println(user2.getName() + "님의 계좌에서 " + user.getName() + "님 계좌로 " + howMuch + "원을 입금하였습니다.");
                            System.out.println(user.getName() + "님의 계좌에는 " + user.getMoney() + "원이 있습니다.");
                            System.out.println(user2.getName() + "님의 계좌에는 " + user2.getMoney() + "원이 있습니다.");
                            break;
                        }

                    }
                    else{
                        System.out.println("잘못된 계좌번호 입니다.");
                        break;
                    }
                }
                default:
                    System.out.println("다시 선택해 주십시오.");
            }

//            if(number == "1")
//            {
//                System.out.println("출금하려는 계좌의 계좌번호를 입력하여 주십시오.");
//            }
//            else if(number == "2")
//            {
//                System.out.println("조회하려는 계좌의 계좌번호를 입력하여 주십시오.");
//            }
//            else if(number == "3")
//            {
//                System.out.println("입금하려는 계좌의 계좌번호를 입력하여 주십시오.");
//            }
//            else
//            {
//                System.out.println("얼마를 이체하시겠습니까?");
//
//                String howMuch = sc.next();
//
//            }
        }
    }
}
