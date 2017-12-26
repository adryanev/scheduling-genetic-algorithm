/**
 * Created by Adryan Eka Vandra on 12/26/2017.
 */
public class FitnessCalc {

    static Character[] solution = new Character[HyperParameter.getChromosomLength()];

    static void setSolution(Character[] newSolution){
        solution = newSolution;
    }

    static double getFitness(Individual individual) {
        char[] jadwalKuliah = new char[]{'A','C','E','D','C','E','A','B','F','A','B','D','A','C','D','C','F','A'};
        int counter = 0;
        int counter1 = 0;
        char[] temp = new char[3];
        int tempIndex = 0;
        //cek apakah ada 1 hari yg sama
        for (int i = 0; i <=individual.size() ; i++) {
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
            if(i == individual.size()){
                break;
            }else{
                if(individual.getGene(i)==jadwalKuliah[i]){
                    counter1++;
                }
            }

        }
        double fitness = 1/(1+((0.005*counter)+ (0.005*counter1)));
        return fitness;
    }

    // Get optimum fitness
    static double getMaxFitness() {
        double maxFitness = solution.length;
        return maxFitness;
    }
}
