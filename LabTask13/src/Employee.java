public class Employee {

    private String name;
    private int id;
    private int basicSalary;
    private Gender gender;

    public Employee(String name, int id, int basicSalary, Gender gender) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public Gender getGender() {
        return gender;
    }
    public void calculateBonus(){
        int totalSalary,inc;
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("basic salary:"+basicSalary);
        System.out.println("gender:"+gender);
        if(gender == Gender.Male){
            inc=(basicSalary*10)/100;
            totalSalary=basicSalary+inc;
            System.out.println("bonus:"+totalSalary);
            System.out.println("salary"+inc);
        }
        else if(gender == Gender.Female){
            inc=basicSalary*(12/100);
            totalSalary=basicSalary+inc;
            System.out.println("bonus:"+totalSalary);
            System.out.println("salary"+inc);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
