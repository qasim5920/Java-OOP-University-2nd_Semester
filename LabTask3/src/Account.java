public class Account {
    public String AccountTitle= "Qasim";
    public int moneyLeft;
    public int NewMoney;
    public int TotalBalance=6000;
    public int deposit=700;
    public int withdraw=1000;
    public void deposit(){
        NewMoney=TotalBalance+deposit;
      System.out.println("deposit="+deposit);
        System.out.println("money after deposit="+NewMoney);

    }
    public void withdraw(){
        if(TotalBalance>=withdraw){
            moneyLeft=TotalBalance-withdraw;
            System.out.println("withdraw="+withdraw);
            System.out.println("moneyleft="+moneyLeft);

        }
        else{
            System.out.println("invalid entery");
        }
    }
}
