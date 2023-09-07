package MazeProblem;

public class Main {
    public static void main(String[] args) {

        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {2, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}
        };
        MazeSolver mazeSolver = new MazeSolver(map, 1,0);
        mazeSolver.findWay();//  => Solution exist..

        /*
        if we changed map[3][5] = 1
        we see 'No solution exist'
         */

    }
}
