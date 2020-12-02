package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;


public abstract class Effet {
   
    Bandeau monBandeau;
    String message;
    
    public Effet(String message, Bandeau monBandeau){
        this.message = message;
        this.monBandeau = monBandeau;
    }
    
    public void setMessage(String message) {
        
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public void executerEffet() {
   }
}
