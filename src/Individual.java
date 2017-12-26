import java.util.Random;

/**
 * Created by Adryan Eka Vandra on 12/24/2017.
 */
public class Individual {

    private int idIndividual;
    private Character[] genes;
    private double fitness = 0;

    public void generateIndividual(){
        String character = "abcdef";
        Random random = new Random();
        for (int i = 0; i <size() ; i++) {
           Character gene =  (char) character.charAt(random.nextInt(character.length()));
           genes[i] = gene;
        }
    }

    public Character getGene(int index){
        return this.genes[index];
    }
    public void setGene(int index, Character gen){
        genes[index] = gen;
        fitness = 0;
    }

    public int getIdIndividual() {
        return idIndividual;
    }

    public void setIdIndividual(int idIndividual) {
        this.idIndividual = idIndividual;
    }

    public int size(){
        return genes.length;
    }

    public double getFitness() {

        if(this.fitness == 0){
            this.fitness = FitnessCalc.getFitness(this);
        }
        return fitness;
    }
    @Override
    public String toString() {
        String geneString = "";
        for (int i = 0; i < size(); i++) {
            geneString += getGene(i);
        }
        return geneString;
    }
}
