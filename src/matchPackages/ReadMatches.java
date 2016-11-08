
package matchPackages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Konrad
 */
public class ReadMatches {
    
    private ArrayList<Match> matches = new ArrayList<>();
    
    public ReadMatches(){
    }
    
    /*
    method, that can read data from txt file. Its temporary. Need special data in txt file 
    */
    public ArrayList<Match> getMatches(){
        try{
            File file = new File("matches.txt");
            FileReader readerF = new FileReader(file);
            BufferedReader reader = new BufferedReader(readerF);
            
            String line = null;
            int count = 0;
            int i = 0;
            
            while((line = reader.readLine()) !=null){
                if (line.contains(":")) {
                       String r[] = line.split("\t", 2);
                       matches.add(new Match(r[0]+ " "+ r[1]));
                       count=1;
                   }else if(line.contains("Statystyki")){
                   }
                    else if (count==1) {
                       matches.get(i).setCourse1(Double.parseDouble(line));  
                       count =2;
                   } else if (count==2) {
                       matches.get(i).setCourseX(Double.parseDouble(line));
                       count = 3;
                   } else if (count==3) {
                       matches.get(i).setCourse2(Double.parseDouble(line));
                       i++;
                       count=4;
                   }else if (count==4) {
                       count = 5;
                   }else if (count==5) {
                       count = 6;
                   }else if (count==6) {
                       count = 0;
                   }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Coś nie tak z plikiem");
        }
        return matches;
    }
    
    
}
