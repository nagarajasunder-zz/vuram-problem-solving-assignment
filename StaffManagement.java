/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffmanagement;

import java.util.Scanner;

/**
 *
 * @author the_developer
 */
class Staff
{
    String Name,Address;

    public Staff(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }
    
}

class FullTimeStaff extends Staff
{
    String Dept,Salary;

    public FullTimeStaff(String Dept, String Salary, String Name, String Address) {
        super(Name, Address);
        this.Dept = Dept;
        this.Salary = Salary;
    }
    
    public void displaydetails()
    {
        System.out.println("Emp Name: "+this.Name);
        System.out.println("Emp Address: "+this.Address);
        System.out.println("Emp Dept: "+this.Dept);
        System.out.println("Emp salary: "+this.Salary);
    }
    
}

class PartTimeStaff extends Staff
{
    int n_o_h,rph;

    public PartTimeStaff(int n_o_h, int rph, String Name, String Address) {
        super(Name, Address);
        this.n_o_h = n_o_h;
        this.rph = rph;
    }
    
    public void displaydetails()
    {
        System.out.println("Emp Name: "+this.Name);
        System.out.println("Emp Address: "+this.Address);
        System.out.println("Emp no. of Hours Work: "+this.n_o_h);
        System.out.println("Rate Per hous: ₹"+this.rph);
    }
}
public class StaffManagement {

    /**
     * @param args the command line arguments
     */
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        int options,n;
        System.out.println("1.Full Time Staff \n2.Part Time Staff");
        options = s.nextInt();
        
        if(options == 1)
        {
            System.out.println("Enter the number of objects");
            n = s.nextInt();
            create_n_objects(n,1);
        }
        else
        {
            System.out.println("Enter the number of objects");
            n = s.nextInt();
            create_n_objects(n,2);
        }
    }

    private static void create_n_objects(int n, int i) {
        if(i==1)
        {
            FullTimeStaff[] obj = new FullTimeStaff[n];
            for(int j=0;j<n;j++)
            {
            System.out.println("Enter Employee Name");
            String name = s.nextLine();
            System.out.println("Enter Employee Address");
            String Address = s.nextLine();
            System.out.println("Enter Dept");
            String dept = s.nextLine();
            System.out.println("Enter the salary");
            int sal = s.nextInt();
            obj[i] = new FullTimeStaff(dept, String.valueOf(sal), name, Address);
            }
            
            for(int j=0;j<n;j++)
            {
                obj[i].displaydetails();
            }
            
        }
        else
        {
            PartTimeStaff[] obj = new PartTimeStaff[n];
            for(int j=0;j<n;j++)
            {
            System.out.println("Enter Employee Name");
            String name = s.nextLine();
            System.out.println("Enter Employee Address");
            String Address = s.nextLine();
            System.out.println("Enter no of hours");
            int noh = s.nextInt();
            System.out.println("Enter the rate per hour");
            int rph = s.nextInt();
            obj[i] = new PartTimeStaff(noh, rph, name, Address);
            }
            for(int j=0;j<n;j++)
            {
                obj[i].displaydetails();
            }
        }
    }
    
}
