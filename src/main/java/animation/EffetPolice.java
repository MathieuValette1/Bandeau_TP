

package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
        
public class EffetPolice extends Effet{
    
    private Font font;
    public EffetPolice(String message, Bandeau monBandeau, Font font){
        super(message, monBandeau);
        this.font = font;
    }
    
    public void executerEffet(Bandeau monbandeau){
        monBandeau.setFont(this.font);
    }
}
