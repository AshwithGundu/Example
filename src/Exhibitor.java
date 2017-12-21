/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S530462
 */
public abstract class Exhibitor {
  private String lastName;
private String firstName;
private int yearOfBirth;
private int points;

    public Exhibitor() {
        this.lastName = "null";
        this.firstName = "null";
        this.yearOfBirth = 0;
        this.points = 0;
    }

    public Exhibitor(String lastName, String firstName, int yearOfBirth, int points) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.points = points;
    }
    

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Exhibitor{" + "lastName=" + lastName + ", firstName=" + firstName + ", yearOfBirth=" + yearOfBirth + ", points=" + points + '}';
    }
  
    public abstract boolean worldShowQualified();
    
}
