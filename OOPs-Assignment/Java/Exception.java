class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TempCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a temperature.");
            return;
        }

        try {
            int temp = Integer.parseInt(args[0]);
            checkTemp(temp);
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    public static void checkTemp(int temp) throws TooHotException, TooColdException {
        if (temp > 35) {
            throw new TooHotException("Temperature is too hot.");
        } else if (temp < 5) {
            throw new TooColdException("Temperature is too cold.");
        } else {
            System.out.println("Normal temperature. Converting to Fahrenheit...");
            double tempF = (temp * 9.0 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + tempF);
        }
    }
}
