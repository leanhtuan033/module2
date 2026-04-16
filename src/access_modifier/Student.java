package access_modifier;

public class Student {
    private String name = "Tuan";
    private String classes = "JV105";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + classes);
    }
}
