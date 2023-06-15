import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3Students {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Николай", 25));
    students.add(new Student("Виктория", 45));
    students.add(new Student("Виктория", 5));
    students.add(new Student("Антон", 25));
    students.add(new Student("Борис", 15));

    System.out.print("Введите минимальный проходной балл: ");
    Scanner scanner = new Scanner(System.in);
    int passingScore = scanner.nextInt();

    List<Student> filteredStudents = students.stream()
        .filter(student -> student.getScore() > passingScore)
        .sorted(Comparator.comparingInt(Student::getScore).reversed())
        .limit(10)
        .collect(Collectors.toList());

    filteredStudents.forEach(System.out::println);
  }
}

