import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name, int... initialGrades) {
        this.name = name;
        this.grades = new ArrayList<>();

        for (int grade : initialGrades) {
            addGrade(grade);
        }
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5.");
        }
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + grades;
    }
}