import java.util.Scanner;
public class SwitchCaseExample {
    public static void main (String []args){
        String score;
        Scanner userinput= new Scanner (System.in);
        System.out.println("=====================");
        System.out.println("      Pass check     ");
        System.out.println("=====================");
        System.out.println();
        System.out.print("Input your name:  ");
        String name = userinput.nextLine();
        System.out.print("Input your class:  ");
        String clas= userinput.nextLine();
        System.out.print("enter your score :  ");
        score = userinput.nextLine();
        System.out.println();

        switch (score){
            case "A":
            System.out.println(name);
            System.out.println(clas);
            System.out.println("wow you are the best graduate");            
            break;
            case "B":
            System.out.println(name);
            System.out.println(clas);
            System.out.println("congratulations");   
            break;
            case "C":
            case "D":
            System.out.println(name);
            System.out.println(clas);
            System.out.println("nice try");
            break;
            default:
            System.out.println("Try again");

        }

        
    }
    
}
