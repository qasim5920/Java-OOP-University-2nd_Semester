public class Employee {
    private String employeeName;
    private int employeeID;
    private Address employeeAddress;

    public Employee( int employeeID, Address employeeAddress) {
        this.employeeID = employeeID;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public  int getEmployeeId() {
        return employeeID;
    }
}
