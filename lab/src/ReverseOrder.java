public class ReverseOrder {
    public static void main(String arg []){
        int num=862,reverse=0;
        while(num!=0){
            int x=num%10;
            reverse=reverse*10+x;
            num/=10;
        }
        System.out.println("Reversed order="+reverse);
    }
}
