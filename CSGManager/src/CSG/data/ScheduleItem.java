package CSG.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.util.Date;

/**
 * This class represents a Teaching Assistant for the table of TAs.
 *
 * @co-author Brian Lin
 * @author Richard McKenna
 */
public class ScheduleItem<E extends Comparable<E>> implements Comparable<E> {

    // THE TABLE WILL STORE TA NAMES AND EMAILS
    private StringProperty type;

    private String date;
    private StringProperty title;
    private StringProperty topic;
    private StringProperty time;
    private StringProperty link;
    private StringProperty criteria;

    public ScheduleItem(String type, Date data, String title, String topic, String time, String link, String criteria) {
        this.type = new SimpleStringProperty(type);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String reportDate = df.format(data);
        date = reportDate;
        this.title = new SimpleStringProperty(title);
        this.topic = new SimpleStringProperty(topic);
        this.time = new SimpleStringProperty(time);
        this.link = new SimpleStringProperty(link);
        this.criteria = new SimpleStringProperty(criteria);
    }

    public ScheduleItem(String type, String date, String title, String topic, String time, String link, String criteria) {
        this.type = new SimpleStringProperty(type);
        this.date = date;
        this.title = new SimpleStringProperty(title);
        this.topic = new SimpleStringProperty(topic);
        this.time = new SimpleStringProperty(time);
        this.link = new SimpleStringProperty(link);
        this.criteria = new SimpleStringProperty(criteria);
    }

    public String getType() {
        return this.type.get();
    }

    public String getDate() {
        return this.date;
    }

    public String getTitle() {
        return this.title.get();
    }

    public String getTopic() {
        return this.topic.get();
    }

    public String getTime() {
        return this.time.get();
    }

    public String getLink() {
        return this.link.get();
    }

    public String getCriteria() {
        return this.criteria.get();
    }

    public void setType(String str) {
        this.type.set(str);
    }

    public void setTitle(String str) {
        this.title.set(str);
    }

    public void setTopic(String str) {
        this.topic.set(str);
    }

    public void setTime(String str) {
        this.time.set(str);
    }

    public void setLink(String str) {
        this.link.setValue(str);
    }

    public void setCriteria(String str) {
        this.criteria.set(str);
    }

    public String getMonth() {
        return date.substring(0, 2);
    }

    public String getDay() {
        return date.substring(3, 5);
    }
    
    public String breakTopic(){
        String[]parts = this.topic.getValue().split(" ");
        String result = "";
        for (String s:parts){
            result += (s+"<br />");
        }
        return result;
    }
    // ACCESSORS AND MUTATORS FOR THE PROPERTIES

    @Override
    public int compareTo(E otherTA) {
        return 0;
    }

    @Override
    public String toString() {
        return this.title.get();
    }
}
