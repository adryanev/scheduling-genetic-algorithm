import java.util.Random;

/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class GeneticAlgorithm {

    private static final int populationSize = HyperParameter.getMaxPopulation();
    private static final double mutationRate = HyperParameter.getMutationRate();
    private static final double crossoverRate = HyperParameter.getCrossoverRate();
    private static final boolean elitism = true;

    /* Public Method */

    public static Population evolvePopulation(Population pop){
        Population newPopulation = new Population(pop.size(),false);

        // Keep our best individual
        if (elitism) {
            newPopulation.saveIndividual(0, pop.getFittest());
        }

        // Crossover population
        int elitismOffset;
        if (elitism) {
            elitismOffset = 1;
        } else {
            elitismOffset = 0;
        }
        // Loop over the population size and create new individuals with
        // crossover
        for (int i = elitismOffset; i < pop.size(); i++) {
            Individual indiv1 = selectRandomIndividual(pop);
            Individual indiv2 = selectRandomIndividual(pop);
            Individual newIndiv = crossover(indiv1, indiv2);

            newPopulation.saveIndividual(i, newIndiv);

        }

        // Mutate population
        for (int i = elitismOffset; i < newPopulation.size(); i++) {
            mutate(newPopulation.getIndividual(i));
        }

        return newPopulation;
    }



    // Crossover individuals
    private static Individual crossover(Individual indiv1, Individual indiv2) {
        Individual newSol = new Individual();

        Random r = new Random();
        int crossoverPoint = r.nextInt(HyperParameter.getChromosomLength());

        for (int i = 0; i < indiv1.size(); i++) {
            // Crossover
            if (Math.random() <= crossoverRate) {
                newSol.setGene(i, indiv1.getGene(i));
            } else {
                newSol.setGene(i, indiv2.getGene(i));
            }
        }
        return newSol;
    }

    // Mutate an individual
    private static void mutate(Individual indiv) {
        // Loop through genes
        for (int i = 0; i < indiv.size(); i++) {
            if (Math.random() <= mutationRate) {
                // Create random gene
                String character = "ABCDEF";
                Random random = new Random();
                char gene = character.charAt(random.nextInt(character.length()));
                indiv.setGene(i, gene);
            }
        }
    }

    public static Individual selectRandomIndividual(Population pop){

        Population select = new Population(3,false);
        for (int i = 0; i <select.size() ; i++) {
            //get random individual
            int randomId  = (int) (Math.random() * pop.size());
            select.saveIndividual(i,pop.getIndividual(randomId));
        }
        Individual fittess = select.getFittest();

        return fittess;
    }
}
