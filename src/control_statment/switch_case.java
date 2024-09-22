package control_statment;

import java.util.Scanner;

public class switch_case {

    public static  void main(String [] args){

        Scanner santo = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int Number = santo.nextInt();
        User_input_switch userInputSwitch = new User_input_switch();
        userInputSwitch.gpa(Number);

        int number = 3;

        switch (number){

            case 1 : System.out.println("This number one");
            break;
            case 2 : System.out.println("This number Two");
                break;
            case 3 : System.out.println("This number Three");
                break;
            case 4 : System.out.println("This number Four");
                break;
            case 5 : System.out.println("This number Five");
                break;

            default: System.out.println("This number invalid");
        }
    }
}

  class User_input_switch {

      void gpa (int number){
          switch (number ){

              case 80 : System.out.print(" Your mark : A+ ");
                  break;

              case 70 : System.out.print(" Your mark : A- ");
                  break;
              case 60 : System.out.print(" Your mark : A ");
                  break;
              case 50 : System.out.print(" Your mark : B ");
                  break;
              case 40 : System.out.print(" Your mark : c ");
                  break;
              default: System.out.print(" Your mark : Fail ");
          }
      }
}
