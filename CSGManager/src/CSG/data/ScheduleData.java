package CSG.data;

import CSG.CSGManagerApp;
import djf.components.AppDataComponent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ScheduleData implements AppDataComponent {

    CSGManagerApp app;

    ObservableList<ScheduleItem> scheduleTable;
    String startingMonday;
    String endingFriday;

    public ScheduleData(CSGManagerApp init) {
        startingMonday = "01/01/1500";
        endingFriday = "01/01/1500";
        app = init;
        scheduleTable = FXCollections.observableArrayList();

    }

    public String getMondayMonth() {
        return startingMonday.substring(0, 2);
    }

    public String getMondayDay() {
        return startingMonday.substring(3, 5);
    }

    public String getFridayMonth() {
        return endingFriday.substring(0, 2);
    }

    public String getFridayDay() {
        return endingFriday.substring(3, 5);
    }

    public ObservableList<ScheduleItem> getScheduleTable() {
        return this.scheduleTable;
    }

    public String getStartingMonday() {
        return this.startingMonday;
    }

    public String getEndingFriday() {
        return this.endingFriday;
    }

    public void setStartingMonday(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dateStr = sdf.format(date);
        this.startingMonday = dateStr;
    }

    public void setEndingFriday(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dateStr = sdf.format(date);
        this.endingFriday = dateStr;
    }

    public void setStartingMonday(String date) {
        this.startingMonday = date;
    }

    public void setEndingFriday(String date) {
        this.endingFriday = date;
    }

    public Date convertStringtoDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date2 = sdf.parse(str);
        return date2;
    }

    public void addSchedule(ScheduleItem s) {

        this.scheduleTable.add(s);
    }

    public void editSchedule(ScheduleItem old, ScheduleItem add) {

        ScheduleItem p = this.getItem(old);
        this.scheduleTable.remove(p);
        this.scheduleTable.add(add);
    }

    public void removeSchedule(ScheduleItem r) {
        ScheduleItem p = this.getItem(r);
        this.scheduleTable.remove(p);
    }

    public ScheduleItem getItem(ScheduleItem compare) {
        String type = compare.getType();
        String date = compare.getDate();
        String time = compare.getTime();
        String title = compare.getTitle();
        String topic = compare.getTopic();
        String link = compare.getLink();
        String criteria = compare.getCriteria();
        for (ScheduleItem s : this.scheduleTable) {
            if (s.getType().equals(type) && s.getDate().equals(date) && s.getTime().equals(time) && s.getTitle().equals(title) && s.getTopic().equals(topic) && s.getLink().equals(link) && s.getCriteria().equals(criteria)) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<ScheduleItem> getHolidays() {
        ArrayList<ScheduleItem> items = new ArrayList();
        for (ScheduleItem s : this.scheduleTable) {
            if (s.getType().equals("Holiday")) {
                items.add(s);
            }
        }
        return items;
    }

    public ArrayList<ScheduleItem> getLectures() {
        ArrayList<ScheduleItem> items = new ArrayList();
        for (ScheduleItem s : this.scheduleTable) {
            if (s.getType().equals("Lecture")) {
                items.add(s);
            }
        }
        return items;

    }

    public ArrayList<ScheduleItem> getRef() {
        ArrayList<ScheduleItem> items = new ArrayList();
        for (ScheduleItem s : this.scheduleTable) {
            if (s.getType().equals("Reference")) {
                items.add(s);
            }
        }
        return items;

    }

    public ArrayList<ScheduleItem> getRec() {
        ArrayList<ScheduleItem> items = new ArrayList();
        for (ScheduleItem s : this.scheduleTable) {
            if (s.getType().equals("Recitation")) {
                items.add(s);
            }
        }
        return items;

    }

    public ArrayList<ScheduleItem> getHw() {
        ArrayList<ScheduleItem> items = new ArrayList();
        for (ScheduleItem s : this.scheduleTable) {
            if (s.getType().equals("Hw")) {
                items.add(s);
            }
        }
        return items;

    }
    
    

    public void resetData() {

    }
}
