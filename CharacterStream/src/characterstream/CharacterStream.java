package characterstream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStream {

    public static void main(String args[]) throws IOException {

        Scanner s = new Scanner(System.in);
        String Name,roll_no,dept;
        
        System.out.println("Enter the details");
        Name = s.nextLine();
        roll_no = s.nextLine();
        dept = s.nextLine();
        
        String details = "Name: "+Name+"\n Dept: "+dept+"\n Roll no: "+roll_no;
        //Creating FileReader object   
        File file = new File("C:/myFile.txt");
        FileReader reader = new FileReader(file);
        char chars[] = details.toCharArray();
        //Reading data from the file
        reader.read(chars);
        //Writing data to another file
        File out = new File("C:/CopyOfmyFile.txt");
        FileWriter writer = new FileWriter(out);
        //Writing data to the file
        writer.write(chars);
        writer.flush();
        System.out.println("Data successfully written in the specified file");
    }
}
