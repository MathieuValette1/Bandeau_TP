package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class Main{

    public static void main(String[] args){
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        
        monBandeau.setMessage("COUCOU");
	monBandeau.sleep(1000);
        
        Scenario scenario1 = new Scenario("Scenario 1");
        /**
        scenario1.ajouterEffetXFois(new EffetCouleurMessage(monBandeau.getMessage(), monBandeau, true, Color.YELLOW, false, Color.YELLOW, Color.YELLOW), 1);
        scenario1.ajouterEffetXFois(new EffetCouleurFond(monBandeau.getMessage(), monBandeau, true, Color.GRAY, false, Color.YELLOW, Color.YELLOW), 1);
        scenario1.ajouterEffetXFois(new EffetCouleurMessage(monBandeau.getMessage(), monBandeau, true, Color.BLUE, true, Color.WHITE, Color.RED), 2);
        scenario1.ajouterEffetXFois(new EffetCouleurFond(monBandeau.getMessage(), monBandeau, true, Color.YELLOW, true, Color.GREEN, Color.MAGENTA), 2);
        scenario1.ajouterEffetXFois(new EffetCouleurFond(monBandeau.getMessage(), monBandeau, true, Color.GRAY, false, Color.GREEN, Color.MAGENTA), 1);
        scenario1.ajouterEffetXFois(new EffetRotation(monBandeau.getMessage(),monBandeau,true,false,false,0, false), 1);
        
        scenario1.ajouterEffetXFois(new EffetRotation(monBandeau.getMessage(),monBandeau,false,true,true,Math.PI/2, false), 3);
        scenario1.ajouterEffetXFois(new EffetRotation(monBandeau.getMessage(),monBandeau,false,false,true,Math.PI/2, false), 1);
        scenario1.ajouterEffetXFois(new EffetRotation(monBandeau.getMessage(),monBandeau,false,false,false,Math.PI/2, true), 1);
        scenario1.ajouterEffetXFois(new EffetZoom(monBandeau.getMessage(),monBandeau,true,false), 1);
        scenario1.ajouterEffetXFois(new EffetZoom(monBandeau.getMessage(),monBandeau,false,true), 1);
        scenario1.executerScenario(monBandeau);
        */
        
        Scenario scenario2 = new Scenario("Scenario 2 ");
        
        scenario2.ajouterEffetXFois(new EffetCouleurFond(monBandeau.getMessage(), monBandeau, true, Color.GRAY, false, Color.GREEN, Color.MAGENTA), 1);
        scenario2.ajouterEffetXFois(new EffetCouleurMessage(monBandeau.getMessage(), monBandeau, true, Color.WHITE, false, Color.YELLOW, Color.YELLOW), 1);
        scenario2.ajouterEffetXFois(new EffetRotation(monBandeau.getMessage(),monBandeau,false,true,true,Math.PI/2, true), 1);
        scenario2.ajouterEffetXFois(new EffetCouleurMessage(monBandeau.getMessage(), monBandeau, true, Color.BLUE, false, Color.YELLOW, Color.YELLOW), 1);
        scenario2.ajouterEffetXFois(new EffetRotation(monBandeau.getMessage(),monBandeau,false,true,true,Math.PI/2, true), 1);
        scenario2.ajouterEffetXFois(new EffetCouleurMessage(monBandeau.getMessage(), monBandeau, true, Color.WHITE, false, Color.YELLOW, Color.YELLOW), 1);
        scenario2.ajouterEffetXFois(new EffetRotation("YOUPI",monBandeau,false,true,true,Math.PI/2, true), 1);
        scenario2.ajouterEffetXFois(new EffetCouleurMessage(monBandeau.getMessage(), monBandeau, true, Color.RED, false, Color.YELLOW, Color.YELLOW), 1);
        scenario2.ajouterEffetXFois(new EffetRotation("YOUPI",monBandeau,false,false,true,Math.PI/2, false), 1);
        scenario2.ajouterEffetXFois(new EffetZoom("Vive la France",monBandeau,true,false), 2);
        scenario2.ajouterEffetXFois(new EffetCouleurFond(monBandeau.getMessage(), monBandeau, true, Color.YELLOW, true, Color.GREEN, Color.MAGENTA), 2);
        scenario2.ajouterEffetXFois(new EffetRotation("Vive la France",monBandeau,true,false,false,Math.PI/2, true), 1);
        
        scenario2.executerScenario(monBandeau);
        monBandeau.close();
    }
}
