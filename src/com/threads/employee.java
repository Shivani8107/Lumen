package com.threads;
import java.io.*;

public class employee {
	
	public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("employee.txt");
            writer.write("Employee Name: Peter\n");
            writer.write("Department: Sales\n");
            writer.write("Designation: Manager\n");
            writer.write("Salary: 135000\n");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        
        try {
            FileReader reader = new FileReader("employee.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
