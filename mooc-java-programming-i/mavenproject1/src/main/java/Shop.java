import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
public class Shop{
    
    public static void main(String[] args) {
        
        //Scanner scan = new Scanner(System.in);    
        Abfrage Gruss = new Abfrage();
        //Artikel art = new Artikel();
        Berechnung Berechnen = new Berechnung();
        
        Gruss.readArticleFromFile();
      
        Gruss.Gruss();
        Gruss.Kaufen();
        
        Berechnen.KundenNettoPreisBerechnunug(Gruss.artikelListe);
        Gruss.ausgabeArtikelListe();
    }        
}
//Gruss.Kaufen();
//method Kaufen in class Abfrage cannot be applied to given types;
//  required: String
//  found:    no arguments
//  reason: actual and formal argument lists differ in length


