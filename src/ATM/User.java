package ATM;

public class User {
    private String name;
    private int money;
    private String accountNumber;

    public User() {
        this.name = "";
        this.accountNumber = "000000";
        this.money = 0;
    }

    public User(String name, String accountNumber, int money) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void insertMoney(int money) {
        this.money += money;
    }

    public void minusMoney(int money) {
        this.money -= money;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
