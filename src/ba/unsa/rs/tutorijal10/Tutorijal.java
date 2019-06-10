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


        public static UN ucitajXml(ArrayList<Grad> gradovi){
            Document xmldoc = null;
            try {
                DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                xmldoc = docReader.parse(new File("drzave.xml"));
            } catch (Exception e) {
                System.out.println("drzave.xml nije validan XML dokument");
            }
            UN un = new UN();
            ArrayList<Drzava> drzave = new ArrayList<>();

            NodeList drzaveXml = xmldoc.getElementsByTagName("drzava");

            for(int i = 0; i < drzaveXml.getLength(); i++) {
                Node drzavaNode = drzaveXml.item(i);

                if(drzavaNode instanceof Element) {
                    Element drzavaEl = (Element)drzavaNode;

                    int brojStanovnika = Integer.parseInt(drzavaEl.getAttribute("stanovnika"));
                    String naziv = drzavaEl.getElementsByTagName("naziv").item(0).getTextContent();

                    Element  glavniGradXML = (Element)drzavaEl.getElementsByTagName("glavnigrad").item(0);
                    int glavniBrojStanovnika = Integer.parseInt( glavniGradXML.getAttribute("stanovnika"));
                    String nazivGrada =  glavniGradXML.getTextContent().trim();

                    Element povrsinaXml = (Element)drzavaEl.getElementsByTagName("povrsina").item(0);
                    String jedinicaPovrsine = povrsinaXml.getAttribute("jedinica");
                    double povrsina = Double.parseDouble(drzavaEl.getElementsByTagName("povrsina").item(0).getTextContent());

                    Grad glavniGrad = new Grad(nazivGrada, null, 0,glavniBrojStanovnika);
                    drzave.add(new Drzava(naziv, brojStanovnika, povrsina, jedinicaPovrsine, glavniGrad));
                }
            }

            un.setDrzave(drzave);
            return un;
        }
    }

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