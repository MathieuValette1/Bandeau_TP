/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author mathi
 */
public class EffetCouleur extends Effet{
    Color couleur;
    public EffetCouleur(String message, Bandeau monBandeau, Color couleur){
        
        super(message, monBandeau);
        this.couleur = couleur;
    }
    
    public void executerEffet(Bandeau monBandeau){
        monBandeau.setMessage(this.getMessage());
        monBandeau.setForeground(this.getCouleur());
	monBandeau.sleep(1000);    
    }

    public Color getCouleur() {
        return couleur;
    }
    
}
    
    

