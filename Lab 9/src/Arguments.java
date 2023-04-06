class CheckArgument extends Exception {

    public String toString() {
        return "Number of Arguments is less than 4";
    }
}

public class Arguments {
    public static void main(String args[]) {
        int sum = 0;
        try {
            for (int i = 0; i < args.length; i++) {
                if (args.length < 4) {
                    throw new CheckArgument();
                }
                sum += Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
            }
            System.out.println("Sum of squares all arguments: " + sum);
        } catch (CheckArgument e) {
            System.out.println("Error Occured =>  " + e);
        }
    }
}
