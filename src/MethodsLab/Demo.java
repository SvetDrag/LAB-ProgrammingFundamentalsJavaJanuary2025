package MethodsLab;

public class Demo {
    public static void main(String[] args) {

        printHello();
        printHello();
        printHello();

        char a = 'v';
        char b = 'a';
        char maxNum = ' ';

        if (a > b) {
            System.out.println(a);
            maxNum = a;
        }
        else {
            System.out.println(b);
            maxNum = b;
        }

       // maxNum = a;




    }

    public static void printHello() {
        System.out.println("Hello");
    }


}
