import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

/**
 * Created by Adryan Eka Vandra on 12/26/2017.
 */
public class TestGA {

    private static final String FILE_NAME = "JadwalPiket.xlsx";

    public static void main(String[] args) {

        Population myPop = new Population(HyperParameter.getMaxPopulation(), true);
        int generationCount = 0;

        while (generationCount < HyperParameter.getMaxGeneration()) {
            generationCount++;
            System.out.println("Generation = " + generationCount + " || " + "Fitness = " + myPop.getFittest().getFitness() + " || Fittest = " + myPop.getFittest());
            myPop = GeneticAlgorithm.evolvePopulation(myPop);
        }

        System.out.println(myPop.getIndividual(myPop.getFittest().getIdIndividual()));

        Individual individual = myPop.getIndividual(myPop.getFittest().getIdIndividual());



            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Jadwal Piket");

            Object[][] headers = {
                    {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"}
            };

            Object[] datas = new Object[individual.size()];
            for (int i = 0; i <datas.length; i++) {
                switch (individual.getGene(i)){
                    case 'A': datas[i] ="Adryan"; break;
                    case 'B': datas[i] ="Ade"; break;
                    case 'C': datas[i] ="Dimas"; break;
                    case 'D': datas[i] ="Dirga"; break;
                    case 'E': datas[i] ="Iqbal"; break;
                    case 'F': datas[i] ="Wira"; break;
                }
            }

            int numRows = 0;


            System.out.println("Membuat File Excel");

            //create the header
            for (Object[] header: headers ){
                Row row = sheet.createRow(numRows++);
                int numColumn = 0;
                for(Object field: header){
                    Cell cell = row.createCell(numColumn++);
                    if(field instanceof  String){
                        cell.setCellValue((String) field);
                    } else if(field instanceof Integer){
                        cell.setCellValue((Integer)field);
                    }
                }
            }

            for (int i = 0; i <3 ; i++) {
                Row row = sheet.createRow(numRows++);

                int numColumn = 0;
                for (int j = i ; j<datas.length ; j+=3) {
                    Cell cell = row.createCell(numColumn++);

                    cell.setCellValue((String)datas[j]);


                    }
                }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
