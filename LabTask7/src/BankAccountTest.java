import java.util.Scanner;
public class BankAccountTest {
    public static void main(String []args){
        int Option;
        BankAccount obj=new BankAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        obj.setName(input.nextLine());
        System.out.println("Enter balance");
        obj.setBalance(input.nextInt());
        System.out.println("Press 1: To Deposit an amount");
       System.out.println( "Press 2:To Withdraw an amount");
        System.out.println("Press 3: To View the current balance");
        Option=input.nextInt();
        if(Option==1){
            System.out.println("name: "+obj.getName());
            System.out.println("Enter the amount of money that you want to deposit");
            obj.setDeposit(input.nextInt());
            obj.deposit();
        }
        else if(Option==2){
            System.out.println("name: "+obj.getName());
            System.out.println("Enter the amount of money that you want to withdraw");
            obj.setWithdraw(input.nextInt());
            obj.withdraw();
        }
        else if(Option==3){
            System.out.println("name: "+obj.getName());
            System.out.println("balance: "+obj.getBalance());
        }
        else{
            System.out.println("Invalid entry");
        }



    }
}
