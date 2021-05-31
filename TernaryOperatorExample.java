import java.util.Scanner;
public class TernaryOperatorExample {
    public static void main (String []args){
        String sayings;
        Scanner userinput = new Scanner (System.in);
        System.out.println("================================");
        System.out.println("   determine the pass rate     ");
        System.out.println("================================");
        System.out.println();
        System.out.print("Input Name : ");
        String name = userinput.nextLine();
        System.out.print("Input your score : ");
        int score = userinput.nextInt();               
        System.out.println();        
        System.out.println("================================");
        System.out.println("================================");
        
        sayings= score>=78? "Congratulation" : "Try Again";
        System.out.println(sayings);

    }
    
}
