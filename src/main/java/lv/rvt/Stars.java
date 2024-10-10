package lv.rvt;

public class Stars {
    public  static void printStars(int stars){
        for(int i = 0; i < stars; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public  static void printSquare(int stars){
        for(int i = 0; i < stars; i++){
            System.out.print("****");
            System.out.println();
        }
        System.out.println();
    }

    public  static void printRectangle(int stars, int count){
        for(int j = 0; j < count; j++){
            for(int i = 0; i < stars; i++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStar(i);
            System.out.println(); 
        }
    }

    public static void printStar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
}
