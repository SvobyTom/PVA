import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class namesurname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name, surname;
        int age;

        System.out.print("Zadej jmeno: ");
        name = sc.nextLine();
        System.out.print("Zadej prijmeni: ");
        surname = sc.nextLine();
        System.out.print("Zadej vek: ");
        age = sc.nextInt();

        try {
            FileWriter writer = new FileWriter("osoba.txt");
            writer.write(name + "\n");
            writer.write(surname + " \n");
            writer.write(age + "\n");
            writer.close();
        }
        catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }


    }
}
