

public class java_06_operator {
    public static void main(String[] args) {
        // Arithmetic, Assignment, Logical, Relational / Conditional, bitwise

        /* Note :
        * Arithmetic operator can not work boolean
        * %(modulo) operator can work with float and double
        *
        * Arithmetic : +,-,*,/,++,--
        * Assignment : +=
        * logical : &&, ||, !
        * Bitwise : &, |

        */
        int a = 1;
        a += 10;

        System.out.println(a);

        System.out.println(1 > 2);
        System.out.println(5 > 2 && 2 > 1);

        a *= 2;
        System.out.println(a);

        // Bitwise operator works on bits.
        System.out.println(2 & 3);

         // System.out.print(true + true);
        // Give error


        /*
        * Operator Precedence and Associativity
        */
        int op1 = 2+3*4;
        System.out.println("op1 = " + op1);

        // In maths we use BODMAS
        // but in programming we use Associatiity and precedence

        // Operator with higher precedence evaluate first
        // when we get operator with same predence then we check associativity. Order of execution. it can be either 'left to right' or 'right to left'.
        int op2 = 2*6/5-3*2;



        // as per BODMAS we should devide first but in programming * and / both have same precedence and it's associativity is left to right.
        /*
        * = 12/5-3*2
        * = 2-3*2
        * = 2-6
        * = -4
        * */
        System.out.println(op2);

        // reference : https://community.codenewbie.org/images/k8FTgzQh7KSvfQIsrGfINIrWbLOiBy-U7QRT9C7mMuQ/w:880/mb:500000/ar:1/aHR0cHM6Ly9kZXYt/dG8tdXBsb2Fkcy5z/My5hbWF6b25hd3Mu/Y29tL3VwbG9hZHMv/YXJ0aWNsZXMvYXAx/cTgwM2htdzhyNW9u/bThwNG8uZ2lm
        // Use parentheses to be on safe side also it help to understand expressiona. decrease confusion.

        // Operators : =,++ have associativity right to left.
        int j;
        int i = j = 9;

        // First b is assigned as 9. then a is assigned as b(i.e. 9)
        System.out.println(i+ " "+j);

    }
}