package Assesment.Controller;

import Assesment.Employee.Employee;
import Assesment.Employee.EmployeeMockData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EnquireSalary {

    EmployeeMockData employeeMockData = EmployeeMockData.getInstance();

    @GetMapping("/employee/search")
    public List<Employee> search(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        return employeeMockData.getEmployeeName(name);
    }

    @PostMapping("/employee/update")
    public List<Employee> update(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        int salary = Integer.parseInt(body.get("salary"));
        return employeeMockData.updateEmployee(name, salary);
    }
}
