package Level1String;
public class NullPointerDemo {

    static void generateException() {
        String text = null; 
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    static void handleException() {
        String text = null; 
        try {
            // Try to access a method on null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
        System.out.println("Program continues after handling exception.");
    }

    public static void main(String[] args) {
        // Case 1: Generate exception (uncomment to see crash)
        // generateException();

        // Case 2: Handle exception safely
        handleException();
    }
}
