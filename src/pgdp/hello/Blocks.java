package pgdp.hello;

public class Blocks {

    /*
    TODO: 1.0 - Run the class and check the console output.
    TODO: 1.1 - Uncomment the 11. line & comment out the 10. line and run the class again.
     */
    public static void main(String[] args) {
        //boolean shouldGoIntoBlock = false;
        boolean shouldGoIntoBlock = true;
        if (shouldGoIntoBlock) {
            System.out.println("I'm now in the block.");
        }
        System.out.println("I'm now out of the block.");
    }
}
