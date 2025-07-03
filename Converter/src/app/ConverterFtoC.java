package app;

public class ConverterFtoC {

    public static void main(String[] args) {

        System.out.println("Application for converting degrees from celsius to fahrenheit and back");

        int fahrenheit = 100;

        int degreesCelConverted = convertFtoC(fahrenheit);

        System.out.println(fahrenheit + "°F is " + degreesCelConverted + "℃");
    }


    public static int convertFtoC(int degrees) {
        return (degrees - 32) * 5 / 9;
    }
}