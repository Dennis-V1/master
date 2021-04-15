import java.util.Scanner;

public class Abfrage {
    Scanner abfragen = new Scanner(System.in);
    Scanner product = new Scanner(System.in);
    String begruessung;
    String zuKaufenderArtikel;
    String productid;
    public void Abfrage1(String begruessung) {
        begruessung = "Guten Tag lieber Kunde was möchten sie gerne Kaufen?";
        System.out.println(begruessung);
    }
    public void Abfrage2(String zuKaufenderArtikel) {
        rep:
        System.out.println("wollen sie einen Artikel kaufen?");
        String antwortKundeaufFrage = abfragen.next();
        if ("y".equals(antwortKundeaufFrage)) {
            System.out.println("Welches Produkt möchten sie gerne kaufen?");
            productid = product.next();
            //ich muss die ids in einem extra array speicher um dieses am ende aus zu lesen
            if("10".equals(productid)|| "11".equals(productid)|| "11".equals(productid) || 12.equals(productid) || 13.equals(productid) || 14.equals(productid) || 15.equals(productid) || 16.equals(productid) || 17.equals(productid)){
                
            }
            if(productid.equals("10" || "11")){
                
               //ich will ohne viele if statements diese vergleiche ziehen
               
            }
        } else if("n".equals(antwortKundeaufFrage)){
            
        } else {
            //ich muss hier noch eine falscheingabe implementieren
            System.out.println("Ihre eingabe war inkorrekt, bitte geben sie y für Ja und n für Nein ein.");
            break rep;    //https://stackoverflow.com/questions/2545103/is-there-a-goto-statement-in-java
            
        }
    }
}
