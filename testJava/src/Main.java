import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        /* ---- PRINT FUNCTION ----- */
        /* System.out.println(i);  */

        /* ---- PRIMITIVE DATA TYPES ----- */
        byte x = 32;
        short w = 30_000;
        int z = 2342;
        long n = 3_123_456_789L;
        float y = 14.99F;
        double q = 242424.5353;
        char letter = 'A';
        boolean isOk = false;


        /* ---- REFERENCES DATA TYPES ----- */
        Date now = new Date();

        Point point1 = new Point();
        point1.setLocation(1,1);
        Point point2 = point1;
        point1.setLocation(4,7);


        String message = "Hello";

        int[] numbers = {2,3,5,1,4};
        Arrays.sort(numbers);
       /* System.out.println(Arrays.toString(numbers)); */

        int [][] matrix = new int[2][3];
        matrix[0][0] = 32;
        matrix[0][1] = 154;
        matrix[0][2] = 56;

        matrix[1][0] = 32;
        matrix[1][1] = 154;
        matrix[1][2] = 56;

        int [][] matrixV2 = {{12 , 34, 34} , {23 , 7 ,88}};

        final float PI = 3.14F;
        
        S

    }
}

