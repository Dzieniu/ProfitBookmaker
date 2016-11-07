
package matchPackages;

/**
 *
 * @author Konrad
 */
public class Match {
    
    private String matchName;
    private double course1;
    private double courseX;
    private double courseY;
    
    public Match(String matchName){
        this.matchName=matchName;
    }
    
    public void setCourse1(double course1){
        this.course1=course1;
    }
    public void setCourseX(double courseX){
        this.courseX=courseX;
    }
    public void setCourse2(double course2){
        this.courseY=courseY;
    }
    
    public String getName(){
        return matchName;
    }
    
    
}
