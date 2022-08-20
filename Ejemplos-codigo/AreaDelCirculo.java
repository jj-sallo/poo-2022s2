public class AreaDelCirculo {
  public static void main(String[] args) {
      final Double pi = 3.1416;
      Scanner scanner = new Scanner(System.in);
      Integer radio = scanner.nextLine();
      //radio = String.toInteger(args[1]);
      Double area = pi * (radio * radio);
      System.out.println(area);
  }
}
