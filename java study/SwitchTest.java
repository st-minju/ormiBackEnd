public class SwitchTest {

  /** 2024-06-03 switch문 */
  public static void main(String[] args) {

    String date = "수요일";
    switch (date) {
      case "월요일":
        System.out.println("책읽기");
        break;
      case "화요일":
        System.out.println("쇼핑하기");
        break;
      case "수요일":
        System.out.println("노래방가기");
        break;
      case "목요일":
        System.out.println("운동가기");
        break;
      case "금요일":
        System.out.println("영화보기");
        break;
      case "토요일":
        System.out.println("공부하기");
        break;
      case "일요일":
        System.out.println("교회가기");
        break;
      default:
        System.out.println("알 수 없는 요일");
        break;
    }

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    char operator = '+';
    int num1 = 50;
    int num2 = 10;
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    String color = "red";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "blue":
        System.out.println("Sky");
        break;
      case "green":
        System.out.println("Grass");
        break;
    }

    int score = 57;
    switch (score / 10) {
      case 10, 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java");
        break;
      case "Python":
        System.out.println("Python");
        break;
      case "C++":
        System.out.println("C++");
        break;
      case "JavaScript":
        System.out.println("JavaScript");
        break;
    }
  }
}
