import java.util.Scanner;



public class nacticisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, v;
        do {
            c = sc.nextInt();
            v = 1;
            for (int i = c; i > 0; i--)
                v = v * i;
            System.out.print(c + "! = ");
            for (int i = c; i > 0; i--) {
                System.out.print(i);
                if (i != 1)
                    System.out.print(" * ");
            }
            System.out.println(" = " + v);
        } while (c != 0);




    }
}
