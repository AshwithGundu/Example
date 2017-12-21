/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S530462
 */
public class Youth extends Exhibitor{

    private static final int PTS_NEEDED = 250;
private static final int NUMBER_OF_EVENTS= 2;
private int numEvents;

    public Youth() {
    }

    public Youth(int numEvents, String lastName, String firstName, int yearOfBirth, int points,int numEventsIn) {
        super(lastName, firstName, yearOfBirth, points);
        numEvents = numEventsIn;
    }

    public int getNumEvents() {
        return numEvents;
    }

    public void setNumEvents(int numEvents) {
        this.numEvents = numEvents;
    }

    
    @Override
    public boolean worldShowQualified() {
      if(getPoints()>PTS_NEEDED&&getNumEvents()>numEvents)
      {
          return true;
      }
      return false;
    }

    @Override
    public String toString() {
        return super.toString() +  "Youth{" + "numEvents=" + numEvents + '}';
    }
    
    
}
