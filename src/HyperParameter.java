import java.util.ArrayList;

/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class HyperParameter {

    public static int getMaxGeneration() {
        int maxGeneration = 150;
        return maxGeneration;
    }

    public static int getMaxPopulation() {
        int maxPopulation = 3;
        return maxPopulation;
    }

    public static double getCrossoverRate() {
        double crossoverRate = 0.7;
        return crossoverRate;
    }

    public static double getMutationRate() {
        double mutationRate = 0.3;
        return mutationRate;
    }

    public static int getChromosomLength() {
        int chromosomLength = 18;
        return chromosomLength;
    }

}
