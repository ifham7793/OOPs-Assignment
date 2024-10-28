// Custom Exception
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinderWithoutMapping {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a country name as a command-line argument.");
            return;
        }

        String country = args[0].trim();

        try {
            // Find the capital using a method
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to find the capital of a country
    public static String findCapital(String country) throws NoMatchFoundException {
        // Using if-else to match countries and their capitals
        if (country.equalsIgnoreCase("India")) {
            return "New Delhi";
        } else if (country.equalsIgnoreCase("USA")) {
            return "Washington, D.C.";
        } else if (country.equalsIgnoreCase("France")) {
            return "Paris";
        } else if (country.equalsIgnoreCase("Germany")) {
            return "Berlin";
        } else if (country.equalsIgnoreCase("Japan")) {
            return "Tokyo";
        } else {
            throw new NoMatchFoundException("No capital found for the country: " + country);
        }
    }
}

