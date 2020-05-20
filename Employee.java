/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.*;
/**
 *
 * @author the_developer
 */

class Employee_details
{
    private String Emp_name,Emp_id,Emp_desg;
    private double salary;

    public Employee_details(String Emp_name, String Emp_id, String Emp_desg, double salary) {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Emp_desg = Emp_desg;
        this.salary = salary;
    }
    public String getEmp_name() {
        return Emp_name;
    }
    public String getEmp_id() {
        return Emp_id;
    }

    public String getEmp_desg() {
        return Emp_desg;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }

    public void setEmp_id(String Emp_id) {
        this.Emp_id = Emp_id;
    }

    public void setEmp_desg(String Emp_desg) {
        this.Emp_desg = Emp_desg;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Emp_name,Emp_id,Emp_desg;
        double Emp_salary;
        Employee_details[] arr = new Employee_details[3];
        for(int i=0;i<arr.length;i++)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Employee Name: ");
            Emp_name = s.nextLine();
            System.out.println("Enter Employee Id: ");
            Emp_id = s.nextLine();
            System.out.println("Enter Employee Desgnation: ");
            Emp_desg = s.nextLine();
            System.out.println("Enter Employee Salary: ");
            Emp_salary = s.nextDouble();
            
            arr[i] = new Employee_details(Emp_name,Emp_id,Emp_desg,Emp_salary);
            
        }
    }

    private static void increment_salary(Employee_details employee_details) {
     double new_salary = (employee_details.getSalary()/5)+employee_details.getSalary();
     employee_details.setSalary(new_salary);
    }

    private static void update_desgnation(Employee_details employee_details) {
       employee_details.setEmp_desg("Analyst");
    }
    
}
