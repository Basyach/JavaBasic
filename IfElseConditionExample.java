import java.util.Scanner;

public class IfElseConditionExample {
    public static void main (String[]args){
        Scanner userinput = new Scanner (System.in);
        System.out.println("================================");
        System.out.println("   determine the pass rate     ");
        System.out.println("================================");
        System.out.println();
        System.out.print("Input Name : ");
        String name = userinput.nextLine();
        System.out.print("Input your score : ");
        int score = userinput.nextInt();
        System.out.print("Input your attendance score : ");
        int absentscore = userinput.nextInt();
        System.out.println();        
        System.out.println("================================");
        System.out.println("================================");
        if(score >=75 && absentscore >=75){
            System.out.println("Name :"+ name);
            System.out.println("Your Score : "+ score);
            System.out.println("attendance score :"+ absentscore);
            System.out.println("Congratulation");            
        }
        else{
            System.out.println("Name :"+ name);
            System.out.println("Your Score : "+ score);
            System.out.println("your attendance score :"+ absentscore);
            System.out.println("Sorry Try again next test");
        }
        System.out.println("================================");
        System.out.println("================================");
    }
}
