class Distance {
    protected double distance;
   public Distance(double distance) {
       this.distance = distance;
   }
   public void travelTime() {
       double speedInMilesPerHour = 60.0;
       double time = distance / speedInMilesPerHour;
       System.out.println("Distance: " + distance + " miles");
       System.out.println("Travel time at 60 miles per hour: " + time + " hours");
   }
}
class DistanceMKS extends Distance {
   public DistanceMKS(double distance) {
       super(distance); 
   }
   public void travelTime() {
       double speedInKilometersPerHour = 100.0;
       double time = distance / speedInKilometersPerHour;
       System.out.println("Distance: " + distance + " kilometers");
       System.out.println("Travel time at 100 kilometers per hour: " + time + " hours");
   }
}
public class DistanceTest {
   public static void main(String[] args) {
        Distance distanceInMiles = new Distance(120);
       System.out.println("Using Distance class:");
       distanceInMiles.travelTime();
       System.out.println();
       DistanceMKS distanceInKilometers = new DistanceMKS(120);
       System.out.println("Using DistanceMKS class:");
       distanceInKilometers.travelTime();
   }
}
