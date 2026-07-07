package tutorial_5;

public class main {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("L100", "Dr Zeko", "OOP", "Faculty of Information Technology");
        l.displayInfo();
        l.displaySubject();
        l.displayDepartment();
    }
}