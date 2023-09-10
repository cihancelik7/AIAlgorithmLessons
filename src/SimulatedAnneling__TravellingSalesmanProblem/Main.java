package SimulatedAnneling__TravellingSalesmanProblem;

public class Main {
    public static void main(String[] args) {
        SimulatedAnnealing sa = new SimulatedAnnealing();
        for (int i =0; i<5;i++){
            City city = new City();
            Repository.addCity(city);
        }

        sa.simulate();

        System.out.println("The best solution "+sa.getBest().getDistance());
        System.out.println(sa.getBest());
    }
}
