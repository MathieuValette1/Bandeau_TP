/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.util.*;
import bandeau.Bandeau;

/**
 *
 * @author mathi
 */
public class Scenario {
    
    private List<Effet> listeEffet = new ArrayList();
    private String intitule;
    
    
    public Scenario(String intitule){
        this.intitule = intitule;
    }
    
    public void ajouterEffet(Effet e){
        listeEffet.add(e);
    }
    
    public void executerScenario(Bandeau monBandeau){
        for (Effet e: listeEffet){
           
        }
    }
    
    
    
}
