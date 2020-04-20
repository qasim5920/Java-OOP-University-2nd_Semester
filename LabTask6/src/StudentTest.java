public class StudentTest {
    public static void main(String []args){
     Student obj1 = new Student("sp19-bse-004","Hamza",3,"Comsats");
        Student obj2 = new Student("sp19-bse-003","Ali",3.2,"Comsats");
        Student obj3 = new Student("sp19-bse-002","Rauf",3.9,"Comsats");
        Student obj4 = new Student("sp19-bse-001","Bilal",3.11,"Comsats");
        obj1.displayInformation();
        obj2.displayInformation();
        obj3.displayInformation();
        obj4.displayInformation();
    }
}