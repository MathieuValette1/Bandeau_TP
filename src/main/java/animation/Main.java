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
        
        monBandeau.setMessage("Helloworld!");
	monBandeau.sleep(1000);
        
        EffetZoom zoom = new EffetZoom("Hello World!1", monBandeau);
        zoom.executerEffet(monBandeau);
        
        EffetCouleur couleur = new EffetCouleur("Hello world!2", monBandeau, Color.YELLOW);
        couleur.executerEffet(monBandeau);
        
        EffetRotation rota = new EffetRotation("Hello world!3", monBandeau);
        rota.executerEffet(monBandeau);
    }
}
