
/**
 * Nicholas Ruppel
 * Exercise 22 
 * 2019/12/10
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise22 {
    int data;
    String kb;
    BufferedReader br;

    Exercise22() {

        InputStreamReader iStreamReader = new InputStreamReader(System.in);
        br = new BufferedReader(iStreamReader);
        do {
            data = getData();
            if (data > 0) {
                System.out.println(data);
            } else {
                System.out.println("Not an int or it was zero or less");
            }
        } while (data > 0);
        System.out.println("The system was terminated");
    }

    public int getData() {
        String kb;
        int data;

        try {
            System.out.print("Input");
            kb = br.readLine();
            data = Integer.parseInt(kb);
            return data;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Enter an int");
            return 0;
        }
    }

    public static void main(String[] args) {
        new Exercise22();
    }
}