public class BankAccount {
    private String name;
    private int balance;
     private int deposit;
     private int withdraw;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public void deposit(){
     balance= balance+deposit;
     System.out.println("Balance"+balance);
    }
    public void withdraw(){
      if(balance>withdraw) {
          balance = balance - withdraw;
          System.out.println("Balance" + balance);
      }
        else{
            System.out.println("invalid");
        }
      }
    }


