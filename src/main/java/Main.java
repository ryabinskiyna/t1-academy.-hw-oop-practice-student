public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Алина", 5, 4, 3);

        student1.addGrade(2);

        System.out.println(student1);

        System.out.println("Оценки: " + student1.getGrades());
    }
}
