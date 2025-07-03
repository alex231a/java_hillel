package app;

public class ConverterFtoC {

    public static void main(String[] args) {
        int fahrenheit = 100;

        int degreesCelConverted = convertFtoC(fahrenheit);

        System.out.println(fahrenheit + "°F is " + degreesCelConverted + "℃");
    }


    public static int convertFtoC(int degrees) {
        return (degrees - 32) * 5 / 9;
    }
}