
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
    
    ArrayList<Match> matches = new ArrayList<>();
    
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
                if (count%4 == 3) {
                       matches.get(i).setCourse1(Double.parseDouble(line)); 
                   } else if (count%4 == 2) {
                       matches.get(i).setCourse2(Double.parseDouble(line));  
                   } else if (count%4 == 1) {
                       matches.get(i).setCourseX(Double.parseDouble(line));  
                   } else {
                       
                       matches.add(new Match(line));
                   }
                   count++;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "");
        }
        return matches;
    }
    
    
}
