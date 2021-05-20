import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.ArrayList;

public class Berechnung {
    int anzahlen;
    double preis;
    double netto;
    double gesamtpreis;
    double nachlass;
    int gesamtMenge;
    File artikelFile = new File("Artikel.txt");
    ArrayList<Artikel> artikelListe = new ArrayList<>();
    
    int menge1;
    String bez;
    int id;
    String [] parts;
    public void Berechnen(){
        
    }
    public void readArticleFromFile(String fileLine) throws FileNotFoundException{   
        Scanner scanner = new Scanner(artikelFile);
        while (scanner.hasNextLine()){
            String line =scanner.nextLine();
            Artikel art = getArticleFromLine(line);
            artikelListe.add(art);
        }
    }
    
        public Artikel getArticleFromLine(String fileLine){  
        parts = fileLine.split(",");               
        id = Integer.parseInt(parts[0]);
        bez = parts[1];
        preis = Double.valueOf(parts[2]);
        menge1 = Integer.parseInt(parts[3]);
               
        Artikel art = new Artikel(id , bez , preis , menge1);
        return art;
    }
    
    public void KundenNettoPreisBerechnunug(ArrayList<Artikel> alleArtikel) {
        //anzahlen * (preis * 1.19)
//        for (Artikel kaufenArtikel: alleArtikel){
//            int anzahlKaufen = kaufenArtikel.anzahlKaufen;
            
//        }
        
        for (Iterator<Artikel> artikel = artikelListe.iterator(); artikel.hasNext();) {
            gesamtpreis = (preis * netto) * anzahlen;
        }
        System.out.println("ihr zu zahlender Preis ist " + gesamtpreis + "€");
    } 
    public void KundenPreis(ArrayList<Artikel> i){
        int kostenpunkt;
        for (Artikel art : i){
            
            kostenpunkt = art.getanzahlKaufen();
            
        }
    }
    
    public void getGesamtMenge(ArrayList<Artikel> i){
        int gesamtMenge = 0;
        for (Artikel art : i){
            
            gesamtMenge = gesamtMenge + art.getanzahlKaufen();
        }
    }
    public void NachlassBerechnunug() {
        nachlass = 0.03;
    }
    public void AusgabeRechnunug(){
        for(Artikel a : artikelListe){
            System.out.println(a);
            //soll mir anzeigen was in meiner Artikelliste ist. https://stackoverflow.com/questions/2047003/print-arraylist-element/46814414
        } 
    }
}
