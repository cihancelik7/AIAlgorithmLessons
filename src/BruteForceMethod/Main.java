package BruteForceMethod;

public class Main {
    public static void main(String[] args) {

        double startX = -2;
        double endX = 2;
        double maxX = startX;

        // this is why brute-force search is slow
        for (double i = startX; i <= endX; i += 0.1) {
            if (f(i) > maxX) {
                maxX = i;
            }
        }System.out.println("maximum x is: " + maxX+" f(x)"+f(maxX));


    }

    public static double f(double x) {
        return -((x-2)*(x-2))+5;
    }
}
