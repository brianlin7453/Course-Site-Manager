package CSG.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Recitation<E extends Comparable<E>> implements Comparable<E>  {
    private StringProperty section;
    private StringProperty instructor;
    private StringProperty dayTime;
    private StringProperty location;
    private StringProperty ta_1;
    private StringProperty ta_2;
    
    
    public Recitation(String section,String instructor,String dayTime,String location,String TA1, String TA2) {
        this.section = new SimpleStringProperty(section);
        this.instructor = new SimpleStringProperty(instructor);
        this.dayTime = new SimpleStringProperty(dayTime);
        this.location = new SimpleStringProperty(location);
        this.ta_1 = new SimpleStringProperty(TA1);
        this.ta_2= new SimpleStringProperty(TA2);
        
    }
    


    // ACCESSORS AND MUTATORS FOR THE PROPERTIES

    public String getSection() {
        return this.section.get();
    }
    public String getInstructor() {
        return this.instructor.get();
    }
    public String getDayTime() {
        return this.dayTime.get();
    }
    public String getLocation() {
        return this.location.get();
    }
    public String getTa_1() {
        return this.ta_1.get();
    }
    public String getTa_2() {
        return this.ta_2.get();
    }
    
    public void setSection(String str) {
        this.section.set(str);
    }
    public void setInstructor(String str) {
        this.instructor.set(str);
    }
    public void setDayTime(String str) {
        this.dayTime.set(str);
    }
    public void setLocation(String str) {
        this.location.set(str);
    }
    public void setTa_1(String str) {
        this.ta_1.set(str);
    }
    public void setTa_2(String str) {
        this.ta_2.set(str);
    }
    
    
    @Override
    public int compareTo(E otherTA) {
        return 0;
    }
    
    @Override
    public String toString() {
        return section.getValue();
    }
}