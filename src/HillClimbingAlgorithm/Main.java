package HillClimbingAlgorithm;

public class Main {
    public static void main(String[] args) {
        double dx = 0.01;
        double actualX = 8;
        double maxX = actualX;

        while (f(actualX - dx) >= f(maxX)) {
            maxX = actualX - dx;
            System.out.println("x:" + actualX + " f(x):" + f(actualX));
            actualX -= dx;
        }
        System.out.println("Max with hill climbing x=: "+maxX + " f(x)="+f(maxX));


    }

    public static double f(double x) {
        return -0.09 * Math.pow(x - 0.1, 4) + 3 * Math.pow(x - 0.4, 2) + 12;
    }
}
