import java.util.Random;

/**
 * Created by Adryan Eka Vandra on 12/26/2017.
 */
public class TestingKedua {

    public static void main(String[] args) {

        char[] jadwalKuliah = new char[]{'A','C','E','D','C','E','A','B','F','A','B','D','A','C','D','C','F','A'};
        char[] chromosome = new char[]{'A','D','D','D','B','B','C','F','B','F','A','A','E','B','C','D','B','E'};
        char[] offspring1 = new char[18];
        char[] offspring2 = new char[18];

        Random r = new Random();
         int cutPoint = r.nextInt(jadwalKuliah.length);
        for (int i = 0; i < jadwalKuliah.length; i++) {
            if(i<cutPoint){
                offspring1[i] = jadwalKuliah[i];
                offspring2[i] = chromosome[i];
            }
            else{
                offspring1[i] = chromosome[i];
                offspring2[i] = jadwalKuliah[i];
            }
        }
        System.out.println("random cut point = "+cutPoint);
        System.out.print("P1  = [");
        for (int i = 0; i <jadwalKuliah.length ; i++) {
            System.out.print(jadwalKuliah[i]+",");
        }
        System.out.println("]");

        System.out.print("P2  = [");
        for (int i = 0; i <chromosome.length ; i++) {
            System.out.print(chromosome[i]+",");
        }
        System.out.println("]");

        System.out.print("C1  = [");
        for (int i = 0; i <offspring1.length ; i++) {
            System.out.print(offspring1[i]+",");
        }
        System.out.println("]");

        System.out.print("C2  = [");
        for (int i = 0; i <offspring2.length ; i++) {
            System.out.print(offspring2[i]+",");
        }
        System.out.println("]");

    }
}
