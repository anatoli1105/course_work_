public class Employee {
    int id ;


    private String secondName;
    private String firstName;
    private String surName;
    private int salary;
    private int departament;


    public Employee(int id,String secondName,String firstName,
                    String surName,int salary,int departament) {

        this.id=id;
        this.secondName = secondName;
        this.firstName=firstName;
        this.surName=surName;
        this.salary=salary;
        this.departament=departament;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }



    @Override
    public String toString() {
        String Employee = String.format("%d" +
                        " %s %s %s %d %d",id, secondName,firstName,
                surName, salary,departament);
        return Employee;
    }
}
