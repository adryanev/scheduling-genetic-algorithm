/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class GeneticAlgorithm {

    private int populationSize;
    private double mutationRate;
    private double crossoverRate;

    public GeneticAlgorithm(){
        this.populationSize = HyperParameter.getMaxPopulation();
        this.mutationRate = HyperParameter.getMutationRate();
        this.crossoverRate = HyperParameter.getCrossoverRate();


    }

}
