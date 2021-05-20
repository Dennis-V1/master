
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Abfrage {

    Scanner abfragen = new Scanner(System.in);
    String begruessung;
    String zuKaufenderArtikel;
    int productid;
    int menge;

    //File artikelFile = new java.io.File("C:/Users/Dennis/Documents/NetBeansProjects/mavenproject1/src/main/java"); //C:\Users\Dennis\Documents\NetBeansProjects\mavenproject1\src\main\java\Artikel.txt
    ArrayList<Artikel> artikelListe = new ArrayList<>();
    double preis;
    int menge1;
    String bez;
    int id;
    String[] parts;
    Berechnung Berechnen = new Berechnung();

    public void readArticleFromFile() {
        System.out.println("pfad der datei");
        try {
            File artikelFile = new java.io.File("C:/Users/Dennis/Documents/NetBeansProjects/mavenproject1/src/main/java/Artikel.txt");
            System.out.println(artikelFile.getPath());
            Scanner scanner = new Scanner(artikelFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Artikel art = getArticleFromLine(line);
                artikelListe.add(art);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        //try {// code which possibly throws an exception} catch (Exception e) {// code block executed if an exception is thrown}

    }

    public Artikel getArticleFromLine(String fileLine) {
        parts = fileLine.split(",");
        id = Integer.parseInt(parts[0]);
        bez = parts[1];
        preis = Double.valueOf(parts[2]);
        menge1 = Integer.parseInt(parts[3]);

        Artikel art = new Artikel(id, bez, preis, menge1);
        return art;
    }

    public void Gruss() {
        begruessung = "Guten Tag lieber Kunde.";
        System.out.println(begruessung);

    }

    public void Kaufen() {
        //System.out.println(Artikel art);
        //rep:{
        while (true) {
            System.out.println("wollen sie einen Artikel kaufen? y Beginnt die Abfrage und n Bricht das Programm ab, f bringt sie zur Kasse");
            String antwortKundeaufFrage = abfragen.next();
            if ("y".equals(antwortKundeaufFrage)) {
//            System.out.println("Welches Produkt möchten sie kaufen?");
//            productid = abfragen.nextInt();

                //System.out.println(artikelListe.size());
                for (Artikel art : this.artikelListe) {
                    String bez = art.getArtikelBez();
                    int anzahlen = 0;
                    System.out.println("Wie viele " + bez + " wollen sie kaufen? ");
                    anzahlen = abfragen.nextInt();
                    art.setanzahlKaufen(anzahlen);
                    //art.getanzahlKaufen();
                }
            } else if ("f".equals(antwortKundeaufFrage)) {
                System.out.println("Sie werden zur Kasse geleitet!");

//            System.out.println("print loop");
//            for(int i=0; i < art.getanzahlKaufen(); i++)
//                System.out.println(art.get(i));
                //////////////////
                //Berechnen.KundenPreis(ArrayList<Artikel> i);
                //////////////////
                break;
            } else if ("n".equals(antwortKundeaufFrage)) {
                System.out.println("Danke für ihren Besuch, das Programm wird automatisch geschlossen!");
                break;
            } else {
                System.out.println("Ihre eingabe war inkorrekt, bitte geben sie y für Ja und n für Nein ein.");
            }
        }
        // ende while

    }

    public void ausgabeArtikelListe() {
        for (Artikel a : artikelListe) {
            System.out.println(a.getArtikelBez() +" " +  a.getanzahlKaufen());
            //soll mir anzeigen was in meiner Artikelliste ist. https://stackoverflow.com/questions/2047003/print-arraylist-element/46814414
        }
    }

}

/////////////////////////////////
//for (int i =0; artikelListe.size() > i; i++){
//  int id = Artikel art.getId();
//if(productid.equals(Artikel.getId(){
///////////////////////////////// anpassen        
//}
            //System.out.println(artikelListe.size());
