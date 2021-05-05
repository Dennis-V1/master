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
    File artikelFile = new File("C:\\Users\\Dennis\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\Artikel.txt");
    ArrayList<Artikel> artikelListe = new ArrayList<>();
    double preis;
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
     
    public void Gruss(String begruessung) {
        begruessung = "Guten Tag lieber Kunde was möchten sie gerne Kaufen?";
        System.out.println(begruessung);
    }
    public void Kaufen(String zuKaufenderArtikel) {
        
        //rep:{
        while(true){
        System.out.println("wollen sie einen Artikel kaufen?");
        String antwortKundeaufFrage = abfragen.next();
        if ("y".equals(antwortKundeaufFrage)) {
            System.out.println("Welches Produkt möchten sie gerne kaufen?");
            productid = abfragen.nextInt();
            //ich muss die ids in einem extra array speicher um dieses am ende aus zu lesen
            for (Artikel art : artikelListe ){
                // int id = art.getId();  nichtmehr benötigt :)
                String bez = art.getArtikelBez();
                int anzahlen = 0;
                System.out.println("Wie viele" + bez + "wollen sie kaufen?"); anzahlen = abfragen.nextInt(); 
                art.setanzahlKaufen(anzahlen);
                }

            } else if("n".equals(antwortKundeaufFrage)){
            System.out.println("Danke für ihren Besuch, das Programm wird automatisch geschlossen!");
            break;
            } else {
            //ich muss hier noch eine falscheingabe implementieren
                System.out.println("Ihre eingabe war inkorrekt, bitte geben sie y für Ja und n für Nein ein.");
                //break rep;   //https://stackoverflow.com/questions/18159965/errorundefined-label-how-to-use-label-statement-in-this-code-in-java
            }
        }
        // ende while
        
    }
}
