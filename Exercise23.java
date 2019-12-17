
/**
 * Exercise23
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise23 {
    int record[] = new int[10];
    String kb;
    BufferedReader br;

    Exercise23() {
        getData();

    }

    public void getData() {
        String kb;

        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            kb = br.readLine();
            while (kb != null) {
                record[Integer.parseInt(kb)] = record[Integer.parseInt(kb)] + 1;
                kb = br.readLine();

            }
            System.out.println("end of file loading");
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Exercise23();
    }

}