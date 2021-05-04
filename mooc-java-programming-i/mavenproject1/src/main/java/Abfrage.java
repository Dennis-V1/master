import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Abfrage {
    Scanner abfragen = new Scanner(System.in);
    Scanner productbuy = new Scanner(System.in);
    Scanner mengenabfrage = new Scanner(System.in);
    String begruessung;
    String zuKaufenderArtikel;
    int productid;
    int menge;
    File arrayListFile = new File("C:\\Users\\Dennis\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\data.txt");
    ArrayList<Artikel> listeArtikel = new ArrayList<>();
    
    public ArrayList<Artikel> getarraylist() throws FileNotFoundException{
        double preis;
        int menge1;
        String bez;
        int id;
              
        String [] parts;
           
        Scanner scanner = new Scanner(arrayListFile);
           
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
               
            parts = line.split(",");
               
            id = Integer.parseInt(parts[0]);
            bez = parts[1];
            preis = Double.valueOf(parts[2]);
            menge1 = Integer.parseInt(parts[3]);
               
            Artikel art = new Artikel(id , bez , preis , menge1);
            listeArtikel.add(art);
        }
           return listeArtikel;
    }
       
                

    public void Gruss(String begruessung) {
        begruessung = "Guten Tag lieber Kunde was möchten sie gerne Kaufen?";
        System.out.println(begruessung);
    }
    public void Kaufen(String zuKaufenderArtikel) {
        
        rep:{
        System.out.println("wollen sie einen Artikel kaufen?");
        String antwortKundeaufFrage = abfragen.next();
        if ("y".equals(antwortKundeaufFrage)) {
            System.out.println("Welches Produkt möchten sie gerne kaufen?");
            productid = productbuy.nextInt();
            //ich muss die ids in einem extra array speicher um dieses am ende aus zu lesen
            for (Artikel art : listeArtikel ){
                // int id = art.getId();  nichtmehr benötigt :)
                String bez = art.getArtikelBez();
                int anzahlen = 0;
                System.out.println("Wie viele" + bez + "wollen sie kaufen?"); anzahlen = abfragen.nextInt(); 
                art.setanzahlKaufen(anzahlen);
                }
            /* if("10".equals(productid)){
                System.out.println("Wie viele" + "" + "wollen sie kaufen?");
                menge = mengenabfrage.nextInt();
            }
            if("11".equals(productid)){
                 
            } 
            if("12".equals(productid)){
                
            }
            if("13".equals(productid)){
                
            }
            if("14".equals(productid)){
                
            }
            if("15".equals(productid)){
                
            }
            if("16".equals(productid)){
                
            } */

        } else if("n".equals(antwortKundeaufFrage)){
            System.out.println("Danke für ihren Besuch, das Programm wird automatisch geschlossen!");
            System.exit(0);
        } else {
            //ich muss hier noch eine falscheingabe implementieren
            System.out.println("Ihre eingabe war inkorrekt, bitte geben sie y für Ja und n für Nein ein.");
            break rep;   //https://stackoverflow.com/questions/18159965/errorundefined-label-how-to-use-label-statement-in-this-code-in-java
            }
        }
    }
}
