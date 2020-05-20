/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytestream01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import org.omg.CORBA.Any;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;

/**
 *
 * @author the_developer
 */
public class ByteStream01 {

    /**
     * @param args the command line arguments
     */
        static String Eno,E_name,Dept,dob,doj;
        static String Employee_datail;
        static int salary;
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
       System.out.println("Enter Employee Details");
       Eno = s.nextLine();
       E_name = s.nextLine();
       Dept = s.nextLine();
       dob = s.nextLine();
       doj = s.nextLine();
       salary = s.nextInt();
       
       Employee_datail = Eno+" \n"+E_name+" \n"+Dept+" \n"+dob+" \n"+doj+" \n"+salary+" \n";
       write();
       read();
       
    }

    private static void write() throws Exception{
        File file = new File(Eno+".txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.writeUTF(Employee_datail);
    }

    private static void read() throws Exception {
       File file = new File(Eno+".txt");
       FileInputStream fis = new FileInputStream(file);
       DataInputStream dis = new DataInputStream(fis);
       
       String detail = dis.readUTF();
        System.out.println(detail);
    }
    
}
