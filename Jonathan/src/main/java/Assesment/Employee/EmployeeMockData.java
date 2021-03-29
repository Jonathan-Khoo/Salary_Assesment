package Assesment.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMockData {
    private List<Employee> employeeList;


    private static EmployeeMockData instance = null;

    public static EmployeeMockData getInstance() {
        if (instance == null) {
            instance = new EmployeeMockData();
        }
        return instance;
    }

    public EmployeeMockData() {
        employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee("johnny", 10000));
        employeeList.add(new Employee("teh", 7654));
        employeeList.add(new Employee("abdul razak", 30000));
        employeeList.add(new Employee("johnny may", 100));

    }

    public List<Employee> fetchEmployee() {
        return employeeList;
    }

    public List<Employee>  getEmployeeName(String name) {
        int annuallySalary = 0;
        int taxAmount = 0;
        List<Employee> result = new ArrayList<>();
        for (Employee b : employeeList) {
            System.out.println("b name = " + b.getName());
            System.out.println("name " + name);
            if (b.getName().equals(name)) {
                System.out.println("name " + name);
                annuallySalary = b.getSalary() * 12;
                System.out.print(annuallySalary);
                if (annuallySalary > 20000 && annuallySalary < 5001) {
                    taxAmount = (int) ((annuallySalary * 0.01) * 100);
                } else if (annuallySalary > 20001 && annuallySalary < 35000) {
                    taxAmount = (int) ((annuallySalary-20000) * 0.03)+150;
                } else if (annuallySalary > 350001 &&  annuallySalary < 50000) {
                    taxAmount = (int) ((annuallySalary-35000) * 0.08)+600;
                } else if (annuallySalary > 50001 &&  annuallySalary < 70000) {
                    taxAmount = (int) ((annuallySalary-50000) * 0.14)+1800;
                } else if (annuallySalary > 70001 &&  annuallySalary < 100000) {
                    taxAmount = (int) ((annuallySalary-70000) * 0.21)+4600;
                } else if (annuallySalary > 100001 &&  annuallySalary < 250000) {
                    taxAmount = (int) ((annuallySalary-100000) * 0.24)+10900;
                } else if (annuallySalary > 250001 &&  annuallySalary < 400000) {
                    taxAmount = (int) ((annuallySalary-250000) * 0.245)+46900;
                } else if (annuallySalary > 400001 && annuallySalary < 600000) {
                    taxAmount = (int) ((annuallySalary-400000) * 0.25)+83600;
                } else {
                    taxAmount = 0;
                }
                b.setName(name);
                b.setSalary(annuallySalary*100);
                b.setTax_Payable(taxAmount*100);
                result.add(b);
                return  result;
            }



        }
        return null;
    }

        public List<Employee>  updateEmployee(String name,int monthlySalary) {
            List<Employee> result = new ArrayList<>();
        for(Employee b: employeeList) {
            if(b.getName() == name) {
                b.setName(name);
                b.setSalary(monthlySalary);
                result.add(b);
                return result;


            }

        }

        return null;
    }
}