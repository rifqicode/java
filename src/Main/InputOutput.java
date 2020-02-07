package Main;

import java.io.*;

public class InputOutput {

    public static void main (String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            int c = 1;
            in = new FileReader("F:\\latihan.txt");
            out = new FileWriter("F:\\latihan.txt");

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
