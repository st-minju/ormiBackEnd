package JavaStudy0618;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    /* System.out.println(compare(0.5, 2.3));
    System.out.println(compare(5, 3));
    System.out.println(compare(2, 3));
    compare("1", "2");
    compare("1", "1");*/

    Course<Person> personCourse = new Course<>("일반인", 5);
    personCourse.add(new Person("일반인"));
    personCourse.add(new Worker("직장인"));
    personCourse.add(new Student("학생"));
    personCourse.add(new HighStudent("고등학생"));

    Course<Worker> workerCourse = new Course<>("직장인과정", 5);
    workerCourse.add(new Worker("직장인"));

    Course<Student> studentCourse = new Course<>("학생과정", 5);
    studentCourse.add(new Student("학생"));
    studentCourse.add(new HighStudent("고등학생"));

    Course<Student> highstudentCourse = new Course<>("고등학생과정", 5);
    highstudentCourse.add(new HighStudent("고등학생"));

    registerCourse(personCourse);
    registerCourse(workerCourse);
    registerCourse(studentCourse);
    registerCourse(highstudentCourse);

    System.out.println("=============");
    System.out.println("=============");
    System.out.println("=============");

    registerCourseStudent(studentCourse);
    registerCourseStudent(highstudentCourse);

    System.out.println("=============");
    System.out.println("=============");
    System.out.println("=============");

    registerCourseWorker(personCourse);
    registerCourseWorker(workerCourse);
  }

  public static <T extends Number> int compare(T t1, T t2) {
    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();
    return Double.compare(v1, v2);
  }

  public static <T extends String> void compare(T t1, T t2) {
    System.out.println(t1.equals(t2) ? "okay" : "no");
  }

  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
  }
}
