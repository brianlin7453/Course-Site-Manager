package CSG.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * This class represents a Teaching Assistant for the table of TAs.
 * @co-author Brian Lin
 * @author Richard McKenna
 */
public class Student<E extends Comparable<E>> implements Comparable<E>  {
    // THE TABLE WILL STORE TA NAMES AND EMAILS
    private StringProperty FN;
    private StringProperty LN;
    private StringProperty Team;
    private StringProperty Role;
    
    public Student(String FN, String LN,String Team, String Role) {
        this.FN = new SimpleStringProperty(FN);
        this.LN = new SimpleStringProperty(LN);
        this.Team = new SimpleStringProperty(Team);
        this.Role = new SimpleStringProperty(Role);
    }
    

    public String getFN(){
        return this.FN.get();
    }
    public String getLN(){
        return this.LN.get();
    }
    public String getTeam(){
        return this.Team.get();
    }
    public String getRole(){
        return this.Role.get();
    }
    
    public void setFN(String str){
        this.FN.set(str);
    }
    public void setLN(String str){
       this.LN.set(str);
    }
    public void setTeam(String str){
        this.Team.set(str);
    }
    public void setRole(String str){
        this.Role.set(str);
    }
    // ACCESSORS AND MUTATORS FOR THE PROPERTIES

    @Override
    public int compareTo(E otherTA) {
        return 0;
    }
    
    @Override
    public String toString() {
        return this.FN.get();
    }
}