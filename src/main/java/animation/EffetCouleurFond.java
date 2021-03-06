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
public class EffetCouleurFond extends Effet{
    
    Color couleurPrincipale;
    private boolean chgtCouleurPrincipale = false;
    boolean cligTroisCouleur = false;
    Color couleur2;
    Color couleur3;
    
    public EffetCouleurFond(String message, Bandeau monBandeau,boolean chgtCouleurPrincipale, Color couleurPrincipale, boolean cligTroisCouleur, Color couleur2, Color couleur3){
        
        super(message, monBandeau);
        this.couleurPrincipale = couleurPrincipale;
        this.chgtCouleurPrincipale = chgtCouleurPrincipale;
        this.cligTroisCouleur = cligTroisCouleur;
        this.couleur2 = couleur2;
        this.couleur3 = couleur3;
    }
    
    public void chgtCouleurPrincipale(){
        
        if(this.chgtCouleurPrincipale){
            monBandeau.setMessage(this.getMessage());
            monBandeau.setBackground(couleurPrincipale);
            monBandeau.sleep(1000);    
            }
    }
    
    public void cligTroisCouleur(){
        if (this.cligTroisCouleur){
            monBandeau.setBackground(couleurPrincipale);
            monBandeau.sleep(1000);
            monBandeau.setBackground(couleur2);
            monBandeau.sleep(1000);
            monBandeau.setBackground(couleur3);
            monBandeau.sleep(1000);
        }
        
    }
    
    public void executerEffet(Bandeau monBandeau){
        this.chgtCouleurPrincipale();
        this.cligTroisCouleur();
    }
}
    

    
    

