package Assesment.Employee;

public class Employee {
    private String name;
    private int salary;
    private int tax_payable;

    public Employee(String name, int monthly_salary) {
        this.setName(name);
        this.setSalary(monthly_salary);
        this.setTax_Payable(tax_payable);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTax_Payable() {
        return tax_payable;
    }

    public void setTax_Payable(int tax_payable) {
        this.tax_payable = tax_payable;
    }

}
