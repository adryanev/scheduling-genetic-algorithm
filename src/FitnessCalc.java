/**
 * Created by Adryan Eka Vandra on 12/26/2017.
 */
public class FitnessCalc {

    static Character[] solution = new Character[HyperParameter.getChromosomLength()];

    static double getFitness(Individual individual) {
        int fitness = 0;
        // Loop through our individuals genes and compare them to our cadidates
        for (int i = 0; i < individual.size() && i < solution.length; i++) {
            if (individual.getGene(i) == solution[i]) {
                fitness++;
            }
        }
        return fitness;
    }

}
