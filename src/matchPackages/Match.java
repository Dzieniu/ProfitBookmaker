
package matchPackages;

/**
 *
 * @author Konrad
 */
public class Match {
    
    private String matchName;
    private double course1;
    private double courseX;
    private double course2;
    private boolean win;
    private boolean bestBook;
    
    public Match(String matchName){
        this.matchName=matchName;
        win=false;
        bestBook=false;
    }
    
    public void setCourse1(double course1){
        this.course1=course1;
    }
    public void setCourseX(double courseX){
        this.courseX=courseX;
    }
    public void setCourse2(double course2){
        this.course2=course2;
    }
    public void setWin(){
        this.win = true;
    }
    public void setBestBook(){
        this.bestBook = true;
    }
    
    
    public String getName(){
        return matchName;
    }
    public double getCourse1(){
        return course1;
    }
    public double getCourseX(){
        return courseX;
    }
    public double getCourse2(){
        return course2;
    }
    public boolean getWin(){
        return win;
    }
    public boolean getBestBook(){
        return bestBook;
    }
    
    @Override
    public String toString(){
        String match = getName()+" "+getCourse1() + " " + getCourseX()+ " " + getCourse2() + " "+getWin()+ " " + getBestBook();
    return match;
    }
    
    
}
