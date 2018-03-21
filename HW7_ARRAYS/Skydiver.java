import java.util.*; 
/**
 * This is the class Skydiver that inputs information about the skydiver. 
 * 
 * @author Navdeep Kaur 
 * @version Due May 27th 2016 
 */
public class Skydiver
{
    private Skydive a;
    private double mass;
    private double area; //cross sectional area
    private double drag; //drag coefficient 
    private double airDensity = 1.14; //density of air (rho) 
    private double gravity = 9.81; //acceleration due to gravity (g)
    public void skydiverData(double dc, double m, double a) {
        drag = dc; 
        mass = m; 
        area = a; 
    } 
    
    public double calcVelocity(double v) {
        v =  Math.sqrt((2*mass*gravity*v)/(airDensity*drag*area)); 
        return v; 
    }
}