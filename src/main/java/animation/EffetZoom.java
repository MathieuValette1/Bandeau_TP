package animation;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author mathi
 */

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
        

public class EffetZoom extends Effet{
    
    private boolean zoomAvant = false;
    private boolean zoomArriere = false;
    
    
    public EffetZoom(String message, Bandeau monBandeau, boolean zoomAvant, boolean zoomArriere){
        
        super(message, monBandeau);
        this.zoomAvant = zoomAvant;
        this.zoomArriere = zoomArriere;
    }
    
    public void zoomAvant(){
        if (zoomAvant){
            for (int i = 5; i < 60 ; i+=5) {
                    monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
                    monBandeau.sleep(100);
            }
        }
    }
    
     public void zoomArriere(){
        if (zoomAvant){
            for (int i = 60; i < 60 ; i-=5) {
                    monBandeau.setFont(new Font("Dialog", Font.BOLD, 60-i));
                    monBandeau.sleep(100);
            }
        }
    }
     
    public void executerEffet(Bandeau monBandeau){
        this.zoomAvant();
        this.zoomArriere();              
        }
}

    
