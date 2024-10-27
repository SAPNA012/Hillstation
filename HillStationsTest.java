package basicJava.org.com;
/*Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses 
 * extend the superclass and override its location() and famousFor() method. i.call the location() 
 * and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base 
 * class object and the base class method overrides the superclass method; the base class method is 
 * invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print 
 * accordingly.
*///Superclass
class HillStations {
 
 // Method to be overridden by subclasses
 public void location() {
     System.out.println("Location: Unknown");
 }

 public void famousFor() {
     System.out.println("Famous for: Unknown");
 }
}

//Subclass Manali
class Manali extends HillStations {
 
 @Override
 public void location() {
     System.out.println("Location: Manali, Himachal Pradesh");
 }

 @Override
 public void famousFor() {
     System.out.println("Famous for: Snow-capped mountains and adventure sports");
 }
}

//Subclass Mussoorie
class Mussoorie extends HillStations {
 //Override the method of super class
 @Override
 public void location() {
     System.out.println("Location: Mussoorie, Uttarakhand");
 }
//Override the method of super class
 @Override
 public void famousFor() {
     System.out.println("Famous for: Scenic views and colonial architecture");
 }
}

//Subclass Gulmarg
class Gulmarg extends HillStations {
	//Override the method of super class
 @Override
 public void location() {
     System.out.println("Location: Gulmarg, Jammu and Kashmir");
 }
//Override the method of super class
 @Override
 public void famousFor() {
     System.out.println("Famous for: Skiing and beautiful meadows");
 }
}

//Main class to test the functionality
public class HillStationsTest {
 
 public static void main(String[] args) {
     // Using superclass reference
     HillStations hillStation;

     // Creating objects of subclasses
     hillStation = new Manali();
     hillStation.location();  // Calls Manali's location()
     hillStation.famousFor(); // Calls Manali's famousFor()

     System.out.println(); // For better readability

     hillStation = new Mussoorie();
     hillStation.location();  // Calls Mussoorie's location()
     hillStation.famousFor(); // Calls Mussoorie's famousFor()

     System.out.println(); // For better readability

     hillStation = new Gulmarg();
     hillStation.location();  // Calls Gulmarg's location()
     hillStation.famousFor(); // Calls Gulmarg's famousFor()

     System.out.println(); // For better readability

     // Directly calling methods from subclasses
     Manali manali = new Manali();
     manali.location();
     manali.famousFor();

     System.out.println(); // For better readability

     Mussoorie mussoorie = new Mussoorie();
     mussoorie.location();
     mussoorie.famousFor();

     System.out.println(); // For better readability

     Gulmarg gulmarg = new Gulmarg();
     gulmarg.location();
     gulmarg.famousFor();
 }
}
