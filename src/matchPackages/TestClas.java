/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchPackages;

/**
 *
 * @author Konrad
 */
public class TestClas {
    
    public static void main(String args[]){
    
        ReadMatches rm = new ReadMatches();
        
        System.out.println(rm.getMatches().get(2).getName());
    }
    
}
