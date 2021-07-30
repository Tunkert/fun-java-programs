import java.util.Scanner;

public class SaddleHeight {
    // variables 
    double inseamLength;
    double measureSetting;
    double crankLength;

    public SaddleHeight(double i, double m, double c) {
        inseamLength = i;
        measureSetting = m;
        crankLength = c;
    }

    public double calculateHeight() {
        return inseamLength * measureSetting - crankLength;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // local main var
        double i;
        double m;
        double c;
        try {
            System.out.println("Enter your inseam length (in cm): ");
            i = Input.nextDouble();
            System.out.println("Enter your measurement setting (1.09 for crit," +
            " 1.07 for road racing, 1.05 for touring.");
            m = Input.nextDouble();
            System.out.println("Enter your crank length (in cm - important!)");
            c = Input.nextDouble();
        } finally {
            if(Input!=null){ 
                Input.close();
            }
        }

        SaddleHeight saddleHeight = new SaddleHeight(i, m, c);
        double saddleHeightMeasure = saddleHeight.calculateHeight();

        System.out.println("Set your saddle height at " +
        saddleHeightMeasure + " centimeters.");
    }
}