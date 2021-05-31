public class BooleanExample {
    public static void main (String [] args){
        boolean a,b,c;
        System.out.println("========== And && ========== ");
        a=true;
        b=true;
        c= (a && b);
        System.out.println(a + " && " + b + " = " +c);

        a=true;
        b=false;
        c= (a && b);
        System.out.println(a + " && " + b + " = " +c);

        a=false;
        b=false;
        c= (a && b);
        System.out.println(a + " && " + b + " = " +c);

        a=false;
        b=true;
        c= (a && b);
        System.out.println(a + " && " + b + " = " +c);

        System.out.println("=============================");
        System.out.println();
        System.out.println("========== OR || ========== ");
        a=true;
        b=true;
        c= (a || b);
        System.out.println(a + " || " + b + " = " +c);

        a=true;
        b=false;
        c= (a || b);
        System.out.println(a + " || " + b + " = " +c);

        a=false;
        b=false;
        c= (a || b);
        System.out.println(a + " || " + b + " = " +c);

        a=false;
        b=true;
        c= (a || b);
        System.out.println(a + " || " + b + " = " +c);

        System.out.println("=============================");
    }
}
