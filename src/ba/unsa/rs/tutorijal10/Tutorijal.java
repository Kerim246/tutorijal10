package ba.unsa.rs.tutorijal10;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {


    public static void main(String[] args) {

    }
        public static ArrayList<Grad> ucitajGradove () {
            ArrayList<Grad> gradovi = new ArrayList<>();
            Scanner ulaz = null;
            try {
                ulaz = new Scanner(new FileReader("mjerenja.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti");
                return null;
            }

            double[] mjerenja = new double[1000];

            String ime ="";
            String pom = "";

            while (ulaz.hasNext()) {
                pom = ulaz.nextLine();
                pom = pom.replace(',', '\n');

                Scanner mojUlaz = new Scanner(pom);

                ime = mojUlaz.nextLine();

                int j = 0;

                for (int i = 0; mojUlaz.hasNextLine() && i < 1000; i++, j++) {
                    mjerenja[i] = mojUlaz.nextDouble();
                }

                gradovi.add(new Grad(ime, mjerenja, j));
            }

            return gradovi;

    }

}