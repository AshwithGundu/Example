/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S530462
 */
public class Amatuer extends Exhibitor {

   
    private static final int PTS_NEEDED = 150;

    public Amatuer() {
    }
    
        public Amatuer(String fN,String lN,int y,int p) {
            super(fN,lN,y,p);
    }
    
     @Override
    public boolean worldShowQualified() {
        if(getPoints()>PTS_NEEDED)
        {
            return true;
        }
        return false;
       
    }     
    
    
}
