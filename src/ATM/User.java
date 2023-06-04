package ATM;

public class User {
    private String name;
    private int money;
    private int accountNumber;

    public User()
    {
        this.name = "";
        this.accountNumber = 0;
        this.money = 0;
    }
    public User(String name, int accountNumber, int money) {
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

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
