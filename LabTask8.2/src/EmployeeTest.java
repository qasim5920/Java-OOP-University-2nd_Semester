public class EmployeeTest {
    public static void main(String args[]){
        Date obj1 = new Date(10,1,2000);
        Date obj2= new Date(22,8,2022);
        Employee E1=new Employee("Qasim","Tariq",obj1,obj2);
        System.out.println("Name:"+E1.getFirstName());
        System.out.println("Last name:"+E1.getLastName());
        System.out.println("Date of birth:"+E1.getBirthDate().getDay()+"/"+E1.getBirthDate().getMonth()+"/"+E1.getBirthDate().getYear());
        System.out.println("Date of Hiring:"+E1.getHiringDate().getDay()+"/"+E1.getHiringDate().getMonth()+"/"+E1.getHiringDate().getYear());
    }
}
