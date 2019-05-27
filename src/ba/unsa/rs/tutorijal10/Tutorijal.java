package ba.unsa.rs.tutorijal10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {


    public static void main(String[] args) {

        public static ArrayList<Grad> ucitajGradove () {
            Scanner ulaz;
            try {
                ulaz = new Scanner(new FileReader("mjerenja.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti");
            }

            ArrayList<Grad> gradovi = new ArrayList<>();
            double[] mjerenja = new double[1000];

            String naziv ="";
            String pom = "";

            try {
                while (ulaz.hasNext()) {
                    pom = ulaz.nextLine();
                    pom = pom.replace(',', '\n');

                    Scanner mojUlaz = new Scanner(pom);

                    naziv = mojUlaz.nextLine();

                    int i;
                    int j = 0;

                    for (i = 0; mojUlaz.hasNextLine() && i < 1000; i++, j++) {
                        mjerenja[i] = mojUlaz.nextDouble();
                    }

                    gradovi.add(new Grad(naziv, mjerenja, j));
                }
            }
                return gradovi;

    }



}