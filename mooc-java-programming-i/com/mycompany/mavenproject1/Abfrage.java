import java.util.Scanner;

public class Abfrage {
    Scanner abfragen = new Scanner(System.in);
    String begruessung;
    String zuKaufenderArtikel;
    public void Abfrage1(String begruessung) {
        begruessung = "Guten Tag lieber Kunde was möchten sie gerne Kaufen?";
        System.out.println(begruessung);
    }
    public void Abfrage2(String zuKaufenderArtikel) {
        System.out.println("wollen sie einen Artikel kaufen?");
        String antwortKundeaufFrage = abfragen.next();
        if ("y".equals(antwortKundeaufFrage)) {
            System.out.println("Welches Produkt möchten sie gerne kaufen?");
            
        } else if("n".equals(antwortKundeaufFrage)){
            
        } else {
            //ich muss hier noch eine falscheingabe implementieren
        }
    }
}
