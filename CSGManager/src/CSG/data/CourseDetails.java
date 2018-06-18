package CSG.data;

import CSG.CSGManagerApp;
import CSG.workspace.CourseDetailsWorkspace;
import djf.components.AppDataComponent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CourseDetails implements AppDataComponent {

    CSGManagerApp app;
    CourseDetailsWorkspace workspace;
    private String subject;
    private String semester;
    private String number;
    private String year;
    private String title;
    private String instructorName;
    private String instructorHome;
    private String exportDir;
    private String templateDir;
    private String banner;
    private String leftFooter;
    private String rightFooter;
    private String stylesheetDir;
    public String bannerName;
    public String leftName;
    public String  rightName;



    ObservableList<Template> templates;
    Template home = new Template(true, "Home", "index.html", "HomeBuilder.js");

    Template project = new Template(true, "Projects", "projects.html", "ProjectsBuilder.js");

    Template syllabus = new Template(true, "Syllabus", "syllabus.html", "SyllabusBuilder.js");

    Template schedule = new Template(true, "Schedule", "index.html", "HomeBuilder.js");

    Template hw = new Template(true, "HWs", "hws.html", "HwsBuilder.js");

    public CourseDetails(CSGManagerApp init) {
        app = init;
        home = new Template(true, "Home", "index.html", "HomeBuilder.js");

        project = new Template(true, "Projects", "projects.html", "ProjectsBuilder.js");

        syllabus = new Template(true, "Syllabus", "syllabus.html", "SyllabusBuilder.js");

        schedule = new Template(true, "Schedule", "schedule.html", "ScheduleBuilder.js");

        hw = new Template(true, "HWs", "hws.html", "HwsBuilder.js");
        templates = FXCollections.observableArrayList();
        templates.addAll(home, syllabus, schedule, hw, project);
    }
    public String getSemesterAndYear(){
        return this.semester + " " + this.year;
    }
    public String getSubject(){
        return this.subject;
    }
    public String getSemester(){
        return this.semester;
    }
    public String getNumber(){
        return this.number;
    }
    public String getYear(){
        return this.year;
    }
    public String getTitle(){
        return this.title;
    }
    public String getIN(){
        return this.instructorName;
    }
    public String getIH(){
        return this.instructorHome;
    }
    public String getExportDir(){
        return this.exportDir;
    }
    public String getTemplateDir(){
        return this.templateDir;
    }
    public String getBanner(){
        return this.banner;
    }
    public String getLeft(){
        return this.leftFooter;
    }
    public String getRight(){
        return this.rightFooter;
    }
    public String getStylesheetDir(){
        return this.stylesheetDir;
    }
    
    public void setSubject(String str){
        this.subject = str;
    }
    public void setSemester(String str){
        this.semester = str;
    }
    public void setNumber(String str){
        this.number = str;
    }
    public void setYear(String str){
        this.year = str;
    }
    public void setTitle(String str){
        this.title = str;
    }
    public void setIN(String str){
        this.instructorName = str;
    }
    public void setIH(String str){
        this.instructorHome = str;
    }
    public void setExportDir(String str){
        this.exportDir = str;
    }
    public void setTemplateDir(String str){
        this.templateDir = str;
    }
    public void setBanner(String str){
        this.banner = str;
    }
    public void setLeft(String str){
        this.leftFooter = str;
    }
    public void setRight(String str){
        this.rightFooter = str;
    }
    public void setStylesheetDir(String str){
        this.stylesheetDir = str;
    }
    public ObservableList<Template> getTemplateTable() {
        return this.templates;
    }
    public void setBannerName(String str){
        this.bannerName = str;
    }
    public void setLeftName(String str){
        this.leftName = str;
    }
    
    public void setRightName(String str){
        this.rightName = str;
    }
    public void resetData() {

    }
}
