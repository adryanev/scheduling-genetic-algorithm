/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class Population {

    Individual[] individuals;

    public Population (int populationSize, boolean initialize){

        individuals = new Individual[populationSize];

        if(initialize){
            for (int i = 0; i < populationSize ; i++) {
                Individual newIndividual = new Individual();
                newIndividual.generateIndividual();
                saveIndividual(i, newIndividual);
            }
        }
    }

    public Individual getIndividual(int index){
        return this.individuals[index];
    }

    public Individual getFittest() {
        Individual fittest = individuals[0];
        // Loop through individuals to find fittest
        for (int i = 0; i < size(); i++) {
            if (fittest.getFitness() <= getIndividual(i).getFitness()) {
                fittest = getIndividual(i);
            }
        }
        return fittest;
    }

    public void saveIndividual(int i, Individual newIndividual) {

        individuals[i] = newIndividual;
    }

    public int size(){
        return individuals.length;
    }
}
