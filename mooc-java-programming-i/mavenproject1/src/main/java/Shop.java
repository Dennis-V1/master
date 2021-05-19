import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
public class Shop{
    
    public static void main(String[] args) {
        
        //Scanner scan = new Scanner(System.in);    
        Abfrage Gruss = new Abfrage(); 
        Berechnung Berechnen = new Berechnung();
        
        Gruss.readArticleFromFile();
      
        Gruss.Gruss("");
        Gruss.Kaufen("");
        
        Berechnen.KundenNettoPreisBerechnunug();
                
    }        
}

