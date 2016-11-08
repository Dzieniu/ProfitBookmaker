package bookcalculates;

import java.util.ArrayList;
import matchPackages.Match;
import java.math.*;

/**
 *
 * @author Konrad
 */
public class CalculateWinChance {
    
    private double win1,winX,win2;
    
    private final int BET_COST = 2;
    private final int TOTAL_BET_COST = BET_COST*3;
    
    public CalculateWinChance(){
    }
    
    public void winChance(ArrayList<Match> matches){
        for(Match match:matches){
            win1=BET_COST*match.getCourse1();
            winX=BET_COST*match.getCourseX();
            win2=BET_COST*match.getCourse2();
            if(win1>=TOTAL_BET_COST && winX>=TOTAL_BET_COST && win2>=TOTAL_BET_COST){
            match.setWin();
            }
        }
    }
    
    public void bestBook(ArrayList<Match> matches){
        for(Match match:matches){
            if(Math.abs(match.getCourse1()-match.getCourse2())>=2){
                match.setBestBook();
            }
        }
        
    }
    
    
}
