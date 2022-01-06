import stack.StackExample;

public class Main {

    public static void main(String[] args) {

        stackExample1();

    }

    private static void stackExample1(){

        StackExample stackExample = new StackExample();

        String s1 = "()({[]}())"; // true
        String s2 = "{}"; //true
        String s3 = "}{"; //false
        String s4 = ""; //true
        String s5 = "(()"; //false
        String s6 = "[(])"; //false

        System.out.println(stackExample.isBalanced(s1));
        System.out.println(stackExample.isBalanced(s2));
        System.out.println(stackExample.isBalanced(s3));
        System.out.println(stackExample.isBalanced(s4));
        System.out.println(stackExample.isBalanced(s5));
        System.out.println(stackExample.isBalanced(s6));
    }
}
