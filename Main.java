import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to charity area");
    System.out.println("how much money would you like to donate?");
    int dollar = scan.nextInt();
    saydollar(dollar);
  }

  public static void saydollar(int q) {
    if (q == 0) {
      

    } else {
      System.out.println("dollar");
      q--;
      saydollar(q);
    }
  }
}