package AlproModule3;;

public class Soal7Koordinat {
    public static void main(String[] args) {
        
        double a, b, c, d, xp, yp;
        
        a = 5;
        b = 10;
        c = 7;
        d = (b * b) - (4 * (a * c));
        xp = -b / (2 * a);
        yp = d / (-4 * a);
        
        System.out.println("Titik Puncak Parabola dari titik 5x^2 + 10x + 7 adalah " +xp+ " ," +yp);
    }
}