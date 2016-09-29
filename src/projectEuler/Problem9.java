package projectEuler;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Answer:  31875000
 */
public class Problem9 {

    public static void main(String[] args) {
        int maxNum = 1000;
        int a = 1;
        int b = 1;
        int c = 1;
        int product = 1;
        boolean found = false;
        while(!found && a < maxNum){
            while(!found && b < maxNum){
                while(c < maxNum){
                    if(a+b+c == maxNum && (a*a)+(b*b)==(c*c)){
                        found = true;
                        product = (a*b*c);
                        break;
                    }
                    c++;
                }
                c = 1;
                b++;
            }
            b = 1;
            a++;
        }
        System.out.println(product);
    }
}
