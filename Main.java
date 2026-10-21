import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public double getAverageGrade() {
        if (grades == null)
            return 0.0;
        if (grades.isEmpty())
            return 0.0; int sum = 0;
            for (int grade : grades) {
                sum += grade;
            } return (double) sum / grades.size();
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
}
public class Main   {
    public static void removeAndPromoteStudents(Collection<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            } else { student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) System.out.println("(на этом курсе никто не учится)");
    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(Arrays.asList( new Student("Иван", "А-1", 1, Arrays.asList(4, 5, 4)),
                new Student("Андрей", "Б-2", 2, Arrays.asList(2, 2, 3)),
                new Student("Ольга", "В-1", 1, Arrays.asList(3, 3, 4)) ));
        removeAndPromoteStudents(studentList);
        Set<Student> studentSet = new HashSet<>(studentList);
        printStudents(studentSet, 2);
    }
}
 задание 2
   import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Phonebook {
    private Map<String, List<String>> book = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        book.putIfAbsent(surname, new ArrayList<>());
        book.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return book.getOrDefault(surname, new ArrayList<>());
    }
}

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7-111-111-22-33");
        phonebook.add("Петров", "+7-222-444-55-66");
        phonebook.add("Иванов", "+7-333-777-88-99");
        System.out.println("Номера для фамилии 'Иванов': " + phonebook.get("Иванов"));
        System.out.println("Номера для фамилии 'Петров': " + phonebook.get("Петров"));
        System.out.println("Номера для фамилии 'Сидоров' (нет в базе): " + phonebook.get("Сидоров"));
    
