
    public class NumberPattern {
        public static void main(String[] args) {
            int n = 7; // Size of the pattern (7x7)
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                    int value = 4 - min;
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }

