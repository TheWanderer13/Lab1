import java.util.*;

public class Program {
    
    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);

        DivSales[] divObjects = new DivSales[3];

        for (int i = 0; i < 3; i++) {

            String input = "";

            System.out.println("Please enter four quarterly salesfor Div " + i + " seperated by space: ");

            input = scanObj.nextLine();
            String[] temp1 = input.split(" ");
            double[] temp2 = new double[4];

            for (int x = 0; x < 4; x++) {

                temp2[x] = Double.parseDouble(temp1[x]);

            }

            divObjects[i] = new DivSales(temp2[0], temp2[1], temp2[2], temp2[3]);

        }

        scanObj.close();

        System.out.println("div    q1    q2    q3    q4");

        for (int i = 0; i < 3; i++) {
            System.out.println("       " + divObjects[i].val(0) + "   " + divObjects[i].val(1) + "   " + divObjects[i].val(2) + "   " + divObjects[i].val(3));
        }

        System.out.println("The total sales of the corporate in the year is: " + (divObjects[0].getTotal() + divObjects[1].getTotal() + divObjects[2].getTotal()));

    }

}
