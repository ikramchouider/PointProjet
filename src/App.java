import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Point p = new Point(x, y);
        p.afficher();
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir x :");
        int x1 = sc.nextInt();
        System.out.print("Veuillez saisir y :");
        int y1 = sc.nextInt();
        Point p1 = new Point(x1, y1);
        p1.afficher();
        sc.close();

    }
}
