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
    double netto = 1.19;
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
    
    public void rechnungBerechnenUndAusgeben(ArrayList<Artikel> i){
        int gesamtMenge = 0;
        double gesamtpreisNachlass;
        nachlass = 0.03;
        System.out.println("Sie Kaufen: ");
        for (Artikel art : i){
            
            gesamtMenge = gesamtMenge + art.getanzahlKaufen();
            if(art.getanzahlKaufen() > 0){
                System.out.println(art.bez + " " + art.anzahlKaufen);
            }
        }
        for (Iterator<Artikel> artikel = artikelListe.iterator(); artikel.hasNext();) {
            gesamtpreis = (Artikel.getpreis(preis) * netto) * anzahlen;   
//??? cannot find symbol   symbol:   method getpreis(double)    location: class Artikel
        }  
        if(gesamtMenge > 3){
            gesamtpreisNachlass = gesamtpreis - (gesamtpreis * nachlass);
            System.out.println("Ihr zu zahlender Preis ist " + gesamtpreisNachlass + "€");
        }else{
            System.out.println("Ihr zu zahlender Preis ist " + gesamtpreis + "€");
        }
    }

    public void ausgabeRechnunug(){
        for(Artikel a : artikelListe){
            System.out.println(a);
            //soll mir anzeigen was in meiner Artikelliste ist. https://stackoverflow.com/questions/2047003/print-arraylist-element/46814414
            
        } 
    }
}
