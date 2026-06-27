class Student {
    String name;
    int age;
    double gpa;

    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // first method
    public void displayInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

    }

    // another metheds
    public void study() {
        System.out.println(name + "is studying.");
    }

    // yet another methods
    public void takeExam() {
        System.out.println(name + "is taking an exam.");
    }
}