public class pattern7 {
        public static void main(String[] args) {
            int size = 5;
            
            if (size < 3) {
                System.out.println("Size must be at least 3");
                return;
            }
            
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
    
