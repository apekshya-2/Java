class Student {
    String name;
    int rollNo;
    int year;

    Student() {
        name = null;
        rollNo = 0;
        year = 0;
    }

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    Student(String n, int r, int y) {
        name = n;
        rollNo = r;
        year = y;
    }

    void display() {
        System.out.println("rollNo: " + rollNo + " name: " + name + " year: " + year);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dipika",2, 21);
        Student s2 = new Student("Apekshya",3, 22);
        s1.display();
        s2.display();
    }
}
