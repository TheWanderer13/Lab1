// THE PROGRAM IS PRODUCING WRONG OUTPUT FOR TOTAL SALES
public class DivSales {

    double qtr[] = new double[4];
    private static double total;

    public DivSales(double inp1, double inp2, double inp3, double inp4) {

        this.qtr[0] = inp1;
        this.qtr[1] = inp2;
        this.qtr[2] = inp3;
        this.qtr[3] = inp4;

	
        // total += qtr[0] + qtr[1] + qtr[2] + qtr[3];
        total = qtr[0] + qtr[1] + qtr[2] + qtr[3];

    }

    public double val(int index) {

        double num = 0.00;

        if (index == 0) {
            num = qtr[0];
        } else if (index == 1) {
            num = qtr[1];
        } else if (index == 2) {
            num = qtr[2];
        } else if (index == 3) {
            num = qtr[3];
        }

        return num;

    }

    public double getTotal() {

        return total;
    
    }

}
