class Minimum {
    public static void main(String args[]) throws Exception {
        System.out.println("Enter 3 numbers: ");
        System.out.println("Arguments are " + args[0] + args[1]);
        int min = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (min>Integer.parseInt(args[i])) {
                min=Integer.parseInt(args[i]);
            }
        }
        System.out.println("Minimum Number is "+min);

    }
}