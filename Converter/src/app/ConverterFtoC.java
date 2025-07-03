package app;

public class ConverterFtoC {

    public static void main(String[] args) {

        System.out.println("Application for converting degrees from celsius to fahrenheit and back");

        int celsius = 30;
        int fahrenheit = 100;

        int degreesFarConverted = convertCtoF(celsius);
        int degreesCelConverted = convertFtoC(fahrenheit);

        System.out.println(celsius + "℃ is " + degreesFarConverted + "°F");
        System.out.println(fahrenheit + "°F is " + degreesCelConverted + "℃");
    }


    public static int convertFtoC(int degrees) {
        return (degrees - 32) * 5 / 9;
    }

    public static int convertCtoF(int degrees) {
        return (degrees * 9 / 5) + 32;
    }
}