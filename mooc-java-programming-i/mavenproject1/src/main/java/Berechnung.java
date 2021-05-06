import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Berechnung {
    int anzahlen;
    double preis;
    double netto;
    double gesamtpreis;
    double nachlass;
    int gesamtMenge;
    File artikelFile = new File("C:\\Users\\Dennis\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\Artikel.txt");
    ArrayList<Artikel> artikelListe = new ArrayList<>();
    
    int menge1;
    String bez;
    int id;
    String [] parts;

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
    
    public void Berechnunug(int anzahlen, double preis, double netto) {
        //anzahlen * (preis * 1.19)  
        get anzahlkaufen(anzahlen); //diese Methode muss noch implementiert werden
        gesamtpreis = (preis * netto) * anzahlen;
        
    }  
    public void getGesamtMenge(){
        for (Integer anzahlen: art){
            
        }
    }
    public void NachlassBerechnunug() {
       
    }
}
