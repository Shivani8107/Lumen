package com.threads;
import java.io.*;

public class BufferDemo {
	
	public static void main(String[] args) {

        try {
            // Save values to a file using BufferedOutputStream
            FileOutputStream stream = new FileOutputStream("bugreport.txt");
            BufferedOutputStream bufferout = new BufferedOutputStream(stream);

            String developerName = "Shivani";
            int bugNumber = 123; // Replace with any number
            String bugDescription = "Description";

            String data = "Developer Name:" + developerName + "\n" +
                          "Bug No:" + bugNumber + "\n" +
                          "Bug Description:" + bugDescription;
            
            bufferout.write(data.getBytes());
            bufferout.flush();
            bufferout.close();

            // Read values from the file using BufferedInputStream
            FileInputStream finstream = new FileInputStream("bugreport.txt");
            BufferedInputStream bufferin = new BufferedInputStream(finstream);
            byte[] bytes = new byte[bufferin.available()];
            bufferin.read(bytes);
            String content = new String(bytes);
            System.out.println(content);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
