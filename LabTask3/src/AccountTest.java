public class AccountTest {
    public static void main(String []args){
     Account obj1= new Account();
     System.out.println("Account Title ="+obj1.AccountTitle);
        System.out.println("Total money ="+obj1.TotalBalance);
        obj1.deposit();
        obj1.withdraw();
    }
}
