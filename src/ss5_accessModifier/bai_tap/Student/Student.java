package ss5_accessModifier.bai_tap.Student;

public class Student {
    private String name;
    private String classes;

    public Student(){
        this.name = "John";
        this.classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

}

