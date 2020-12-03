package animation;
import bandeau.Bandeau;

/**
 *
 * @author mathi
 */
public class EffetRotation extends Effet {
    
     public EffetRotation(String message, Bandeau monBandeau){
        
        super(message, monBandeau);
    }
    
    public void executerEffet(Bandeau monBandeau){
        monBandeau.setMessage(this.getMessage());
        for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
	}  
    }
    
}
