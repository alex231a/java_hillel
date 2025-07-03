package app;

public class ConverterMiles {
    private static final double CONV_KM = 0.621371;
    private static final double CONV_ML = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter Ml to KM and KM to ML App. ");
        System.out.println("Version 1.0.");
        double ml = 100;
        double km = 100;
        double miles = convKmToMl(km);
        double kilometers = convMlToKm(ml);
        System.out.println("Result is " + km + " kilometers is "+ miles + " miles.");
        System.out.println("Result is " + ml + " miles is "+ kilometers + " kilometers.");
    }
    private static double convKmToMl(double km) {
        return km * CONV_KM;
    }

    private static double convMlToKm(double ml) {
        return ml * CONV_ML;
    }
}