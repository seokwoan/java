package javaprototype;


class Student implements Cloneable {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Clone method for deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Student is a simple class with only primitive types, so this is sufficient
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}

//class Person implements Cloneable {
//    private String name;
//    private Student[] scores; // Array of Student objects
//
//    public Person(String name, Student[] scores) {
//        this.name = name;
//        this.scores = scores;
//    }
//    
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Person cloned = (Person) super.clone(); // ���� ���� ����
//        cloned.scores = new Student[this.scores.length]; // ���ο� �迭 ����
//        for (int i = 0; i < this.scores.length; i++) {
//            cloned.scores[i] = (Student) this.scores[i].clone(); // ���� ���� ����
//        }
//        return cloned;
//    }
//    
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', scores=" + java.util.Arrays.toString(scores) + "}";
//    }
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Student[] students = { new Student("Alice", 90), new Student("Bob", 85) };
//        Person original = new Person("John", students);
//        Person cloned = (Person) original.clone();
//
//        System.out.println("Original: " + original);
//        System.out.println("Cloned: " + cloned);
//
//        // ������ ��ü�� �����͸� ����
//        cloned.scores[0].grade = 100;
//
//        System.out.println("After modifying clone:");
//        System.out.println("Original: " + original);
//        System.out.println("Cloned: " + cloned);
//    }
//}