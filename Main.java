import java.util.Scanner;

import javax.sound.midi.ShortMessage;

class Main {
  public static void main(String[] args) {
    count = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to shoe stone");
    System.out.println("how much shoes would you like to buy by the way every shoe is 20$?");
    int dollar = scan.nextInt();
    saydollar(dollar);
  }

  public static void saydollar(int q) {
    if (q == 0) {
   System.out.println("how much money do you have?");    
   double money = scan.nextDouble();
   if(money < 20.0){
    System.out.println("sorry but you cannot afford any of these shoes");
   } else {
    System.out.println("you can now afford one shoe, would you like to purchase");
    shoes(100);
    if ( <20)
    count = count + 1;
   }
  
   
    } else {
      System.out.println("dollar");
      q--;
      saydollar(q);
    }
  }
}