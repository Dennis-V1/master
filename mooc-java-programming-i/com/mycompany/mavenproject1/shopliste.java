import java.util.Scanner;

public class shopliste {
    
    public static void main(String[] args) {
        
        
        Artikel NewSilvanTurbo = new Artikel(10, "New Silvan Turbo", 7.5, 20);
	Artikel AfrimundBashkim = new Artikel(11, "Afrim und Bashkim", 6, 20);
	Artikel DanielalleinzuHaus = new Artikel(12, "Daniel allein zu Haus", 4.5, 20);
	Artikel CallofDutyPhillipsWarPC = new Artikel(13, "Call of Duty - Phillips War PC", 30, 20);
	Artikel CallofDutyPhillipsWarPS4 = new Artikel(14, "Call of Duty - Phillips War PS4", 40, 20);
	Artikel Cybernico2077PC = new Artikel(15, "Cybernico 2077 PC", 40, 20);
	Artikel Cybernico2077PS4 = new Artikel(16, "Cybernico 2077 PS4", 50, 20);
        
        Abfrage1();
        Berechnung();
        Ausgabe();
    }
}
