public class Point {
    private int x;
    private int y;

    public Point(int absc, int ord) {
        this.x = absc;
        this.y = ord;
    }

    public void deplacer(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public void afficher() {
        System.out.println(" Mes coordonnees sont x=" + this.x + " et y=" + this.y);
    }

}
