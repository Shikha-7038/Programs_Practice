// 4. Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
//Please define static methods for all the UnitConvertor class methods. E.g. public static double convertKmToMiles(double km) => 

package Level2Methods;
public class UnitConverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Test the methods
    public static void main(String[] args) {
        System.out.println("10 km = " + convertKmToMiles(10) + " miles");
        System.out.println("5 miles = " + convertMilesToKm(5) + " km");
        System.out.println("3 meters = " + convertMetersToFeet(3) + " feet");
        System.out.println("12 feet = " + convertFeetToMeters(12) + " meters");
    }
}
