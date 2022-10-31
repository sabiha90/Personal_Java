import java.util.Scanner;

public class Combination {
    int n;
    int k;
    int result = 0; //The variable to store the combination result

    /**
     * Constructor for initializing data members*
     */
    public Combination() {
        this.n = 0; //this is used to call class variables
        this.k = 0;
    }

    /**
     * Read method without using Scanner
     * This will let users enter the values using
     * main method like a unit test* *
     */
    /*void read (int n, int k) {
        this.n = n;
        this.k = k;

    }*/

    /**
     * Read using Scanner
     * This will ask users to enter input
     * via the console
     */
    public void read() {
        Scanner scObject = new Scanner(System.in);
        System.out.println("Enter number, n");
        int n  = scObject.nextInt();
        this.n = n;

        System.out.println("\nEnter number, k");
        int k  = scObject.nextInt();
        this.k = k;
    }

    /**
     * The fact method will calculate the factorial of a number
     * This is a private method since will be utilized only by
     * compute and users do not have to know how it is used
     * This will maintain the privacy of the class
     * @param n
     * @return factorial
     */
    int fact(int n) {
        if (n <= 2) {
            return n;
        }
        return n * fact(n - 1);
    }

    /**
     * The compute method will calculate
     * the combinations of the numbers using the formula
     * Since users don't have to know how the combination is calculated,
     * this method is private too
     */
    public void compute() {
        this.result = fact(this.n) / (fact(this.k) * fact(this.n - this.k));
    }

    /**
     * The display method will be used by users to
     * display the result* *
     */
    public void display() {
        compute();
        System.out.println("Result is " + this.result);
    }

    /** Main method to initialize the object
     * @param args
     */
    public static void main(String[] args) {
        Combination comb = new Combination();
        comb.read();
        comb.display();
    }
}
