
public class Artikel {
    
    int id;
    String bez;
    double preis;
    int menge;
    
    public Artikel(int id, String bez, double preis, int menge) {
        this.id = id;
        this.bez = bez;
        this.preis = preis;
        this.menge = menge;
    }
    
    public void setArtikelBez(String Bez){
        bez = Bez;
    }
    
    public String getArtikelBez(){
        return bez;
    }
    
    public void setPreis(double Preis){
        preis = Preis; 
    }
    
    public double getPreis(){
        return preis;
    }
    
    public void setMenge(int Menge){
        menge = Menge;
    }
    
    public int getMenge(){
        return menge;
    }
    
    
}
