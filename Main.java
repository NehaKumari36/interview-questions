public class Main {
    private static void createTriangle(int n) {
        if (n <= 0) {
            System.out.println("Invalid value of n given");
            return;
        }
        int numberOfStars = 1;
        for (int i=1;i<=n;i++) {
            // For white spaces in the beginning
            for (int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            // For star
            for (int j=0;j<numberOfStars;j++) {
                System.out.print("*");
            }
            numberOfStars+=2;
            System.out.println();
        }
    }
    
    private static void createReverseTriangle(int n) {
        if (n <= 0) {
            System.out.println("Invalid value of n given");
            return;
        }
        int numberOfStars = n*2-1;
        int numberOfSpaces = 0;
        for (int i=1;i<=n;i++) {
            // For white spaces
            for (int j=0;j<numberOfSpaces;j++) {
                System.out.print(" ");
            }
            numberOfSpaces++;
            // For star
            for (int j=0;j<numberOfStars;j++) {
                System.out.print("*");
            }
            numberOfStars-=2;
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 10;
        createTriangle(n);
        createReverseTriangle(n);
    }
}
