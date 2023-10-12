import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner chitalka = new Scanner(new File("trTxt"));
        int x = chitalka.nextInt();
        int y = chitalka.nextInt();
        int z = chitalka.nextInt();
        System.out.println(x+y+z);
    }
    public static double trianglePerimetr(Point x, Point y, Point z) {
        double XY = Math.sqrt(Math.pow(y.getX() - x.getX(),2)+Math.pow(y.getY() - x.getY(),2));
        double XZ= Math.sqrt(Math.pow(y.getX() - x.getX(),2)+Math.pow(y.getY()- x.getY(),2));
        double YZ=Math.sqrt(Math.pow(y.getX() - x.getX(),2)+Math.pow(y.getY()- x.getY(),2));
        return XY+XZ+YZ;
    }
}