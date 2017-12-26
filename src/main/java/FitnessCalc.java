/**
 * Created by Adryan Eka Vandra on 12/26/2017.
 */
public class FitnessCalc {

    static Character[] solution = new Character[HyperParameter.getChromosomLength()];

    static void setSolution(Character[] newSolution){
        solution = newSolution;
    }

    static double getFitness(Individual individual) {
        int counter = 0;
        double fitness = 0;
        char[] temp = new char[3];
        int tempIndex = 0;
        //cek apakah ada 1 hari yg sama
        for (int i = 1; i <=individual.size() ; i++) {
            if(i%3==0 &&  i!=0){
                if(temp[0] == temp[1]) counter++;
                if(temp[0] == temp[2]) counter++;
                if (temp[1] == temp[2]) counter++;
                tempIndex = 0;
                if(i== individual.size()) break;
                temp[tempIndex] = individual.getGene(i);

                tempIndex++;
            }
            else{
                temp[tempIndex] = individual.getGene(i);
                tempIndex++;
            }

        }

        //cek apakah bentrok sama jadwal piket
        for (int i = 0; i <=individual.size() ; i++) {

        }

        return fitness;
    }

    // Get optimum fitness
    static int getMaxFitness() {
        int maxFitness = solution.length;
        return maxFitness;
    }
}
