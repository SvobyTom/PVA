import java.io.FileWriter;
import java.io.IOException;

public class nasobilkafile {
    public static void main(String[] args) {


        try {
            FileWriter writer = new FileWriter("nasobilka.txt");
            for (int i = 1; i <= 10; i++)
                writer.write("\t" + i);
            writer.write("\n\n\n");

            for (int i = 1; i <= 10; i++) {
                writer.write("" + i +"\t");

                for (int j = 1; j <= 10; j++)
                    writer.write((i * j) + "\t");
                writer.write("\n");
            }
            writer.close();

        } catch (IOException e) {
            System.out.println(("Error") + e.getMessage());
        }
    }
}
