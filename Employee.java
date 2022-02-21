public class Employee {

    private int empid;
    private String ename;
    private double salary;

    Employee()
    {

    }
    Employee(int id,String name,double sal)
    {
        this.empid=id;
        this.ename=name;
        this.salary=sal;
    }

    public void display() 
    {
            System.out.println("Emp id="+empid+"   Emp name="+ename+"  Salary="+salary);
        
    }
}
