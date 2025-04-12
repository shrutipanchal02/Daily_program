class starPattern8 {
    public static void main(String[] args) {
       int rows = 5;

        for (int i = 0; i <rows; i++) {
        
            for (int j = 0; j <= 10; j++) {
                
                
                if (j == 5 - i || j == 5 + i) {
                    System.out.print("*");
                }

              
                //else if (i == 2 && j > 5 - i && j < 5 + i) {
               //     System.out.print("*");
             //   }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

