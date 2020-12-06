package animation;
import bandeau.Bandeau;

/**
 *
 * @author mathi
 */
public class EffetRotation extends Effet {
    
    private boolean rotaComplete = false;
    private boolean aLEnvers = false;
    private boolean rotaAngle = false;
    private double angle = 0;
    private boolean reInit = false;
    
    public EffetRotation(String message, Bandeau monBandeau, boolean rotaComplete, boolean aLEnvers, boolean rotaAngle, double angle,boolean reInit){
        
        super(message, monBandeau);
        this.rotaComplete = rotaComplete;
        this.aLEnvers = aLEnvers;
        this.rotaAngle = rotaAngle;
        this.angle = angle;
        this.reInit = reInit;
    }
    
    public void rotaProgressiveComplete(){
        if (this.rotaComplete){
            this.monBandeau.setMessage(this.getMessage());
                for (int i = 0; i <= 100; i++) {
                        this.monBandeau.setRotation(2*Math.PI*i / 100);
                        this.monBandeau.sleep(10);
                }
	}
    }
    
    public void rotaAngle(){
        if (rotaAngle){
            this.monBandeau.setRotation(angle);
            this.monBandeau.sleep(1000);
            
        }
    }
    
    public void reInit(){
        if (reInit){
            this.monBandeau.setRotation(0);
        }
    }
    
    public void aLEnvers(){
        if (this.aLEnvers){
            this.monBandeau.setMessage(this.getMessage());
            this.monBandeau.setRotation(Math.PI);
            this.monBandeau.sleep(1000);

        }
    }
    
    public void executerEffet(Bandeau monBandeau){
        this.rotaProgressiveComplete();
        this.aLEnvers();
        this.rotaAngle();
        this.reInit();
    }
    
}
