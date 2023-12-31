package SimulatedAnneling__TravellingSalesmanProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {
    private final List<City> tour;
    // the total sum of the edge weights
    private int distance;

    public SingleTour() {
        tour = new ArrayList<>();

        for (int i = 0; i < Repository.getNumberOfCities(); i++) {
            tour.add(null);
        }
    }

    public SingleTour(List<City> cities) {
        tour = new ArrayList<>();

        tour.addAll(cities);
    }

    // we have to calculate the total sum of edge weights
    public double getDistance() {
        if (distance == 0) {
            int tourDistance = 0;

            for (int cityIndex = 0; cityIndex<tour.size();++cityIndex){
                City fromCity = tour.get(cityIndex);
                City destinationCity;

                if (cityIndex+1 <tour.size()){
                    destinationCity = tour.get(cityIndex+1);
                }else {
                    destinationCity = tour.get(0);
                }
                tourDistance += fromCity.distanceTo(destinationCity);
            }
            distance = tourDistance;
        }
        return distance;
    }

    // to generate a random individual (random tour)
    // this is how we generate a hamiltonian cycle
    public void generateIndividual() {
        for (int cityIndex = 0; cityIndex < Repository.getNumberOfCities(); ++cityIndex) {
            setCity(cityIndex, Repository.getCity(cityIndex));


        }
        // the order is randomize
        Collections.shuffle(tour);
    }

    public List<City> getTour() {
        return this.tour;
    }

    public void setCity(int index, City city) {
        tour.set(index, city);
    }

    public City getCity(int index) {
        return tour.get(index);
    }

    public int getTourSize() {
        return tour.size();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (City city : tour) {
            s.append(city.toString()).append(" - ");
        }
        return s.toString();
    }
}
