package animation;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author mathi
 */


public class EffetZoom extends Effet{
    
    public EffetZoom(String message, Bandeau monBandeau){
        
        super(message, monBandeau);
    }
    public void executerEffet(Bandeau monBandeau){
        monBandeau.setMessage(this.getMessage());
        for (int i = 5; i < 60 ; i+=5) {
		monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
		monBandeau.sleep(100);
        }
    }
}
    
