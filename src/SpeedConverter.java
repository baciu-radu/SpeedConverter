public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(58.89);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long convertedValue = 0;
        if (kilometersPerHour < 0) {
            return -1;
        }else {
            convertedValue = Math.round(kilometersPerHour/1.609);
        }
        return convertedValue;

    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}