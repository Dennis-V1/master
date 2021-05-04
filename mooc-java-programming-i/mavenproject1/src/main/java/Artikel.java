import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Artikel {
    
    int id;
    String bez;
    double preis;
    int menge;
    int anzahlKaufen;
    
    public Artikel(int id, String bez, double preis, int menge) {
        this.id = id;
        this.bez = bez;
        this.preis = preis;
        this.menge = menge;
    }
    
    public void setanzahlKaufen(int gekauft){
        this.anzahlKaufen = gekauft;
    } 
    
    public int getanzahlKaufen() {
        return this.anzahlKaufen;
    }
             
    
    public void setId(int Id){
        id = Id;
    }
    
    public int getId(){
        return this.id;
    }
    public void setArtikelBez(String Bez){
        bez = Bez;
    }
    
    public String getArtikelBez(){
        return this.bez;
    }
    
    public void setPreis(double Preis){
        preis = Preis; 
    }
    
    public double getPreis(){
        return this.preis;
    }
    
    public void setMenge(int Menge){
        menge = Menge;
    }
    
    public int getMenge(){
        return this.menge;
    }
    
    
}
