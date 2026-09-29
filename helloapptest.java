public class helloapptest {
 
    public static void main(String[] args) {
        String expected = "Hello from my Jenkins application!";
        String actual = "Hii this is swaroop!";
 
        if (expected.equals(actual)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
