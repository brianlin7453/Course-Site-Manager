package CSG.data;

import CSG.CSGManagerApp;
import djf.components.AppDataComponent;
import java.util.ArrayList;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RecitationData implements AppDataComponent {

    CSGManagerApp app;

    Date StartingDate;
    Date EndingDate;

    public ObservableList<Recitation> recitationTable;

    public RecitationData(CSGManagerApp initapp) {
        app = initapp;
        recitationTable = FXCollections.observableArrayList();

    }

    public ObservableList<Recitation> getRecitationTable() {
        return this.recitationTable;
    }

    public void addRecitation(Recitation rec) {
        this.recitationTable.add(rec);
    }

    public void editRecitation(Recitation old, Recitation replace) {
        this.recitationTable.add(replace);
        Recitation remove = this.getRecitation(old.getSection());
        this.recitationTable.remove(remove);
    }

    public void removeRecitation(Recitation removed) {
        Recitation remove = this.getRecitation(removed.getSection());
        this.recitationTable.remove(remove);
    }

    public Recitation getRecitation(String section) {
        for (Recitation rec : this.recitationTable) {
            if (rec.getSection().equals(section)) {
                return rec;
            }
        }
        return null;
    }

    public boolean containsRec(String section) {
        for (Recitation rec : this.recitationTable) {
            if (rec.getSection().equals(section)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Recitation> taRecitations(String taName) {
        ArrayList<Recitation> result = new ArrayList<Recitation>();
        for (Recitation r : this.recitationTable) {
            if (r.getTa_1().equals(taName)) {
                result.add(r);
            }
            else if (r.getTa_2().equals(taName)){
                result.add(r);
            }
        }
        return result;
    }

    public void resetData() {

    }
}
