import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class nacticislatext {

        public static void main(String[] args) {
            try {
                FileWriter writer = new FileWriter("numbers.txt");
                Scanner sc = new Scanner(System.in);
                int a;
                do{
                    a = sc.nextInt();
                    writer.write(a + "");
                }
                while(a != 0);
                writer.close();
            } catch (IOException e) {
                System.out.println(("Error") + e.getMessage());
       }
    }
}
