package unittestjava;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            printUsageAndExit();
        }

        int a;
        int b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            printUsageAndExit();
            return;
        }

        String operation = args[2];
        int result;
        if ("add".equals(operation)) {
            result = Compute.myadd(a, b);
        } else if ("mult".equals(operation)) {
            result = Compute.mymult(a, b);
        } else {
            printUsageAndExit();
            return;
        }

        System.out.println(a + " " + b + " " + operation);
        System.out.println(result);
    }

    private static void printUsageAndExit() {
        System.err.println("Usage: java Main <arg1:int> <arg2:int> <add|mult>");
        System.exit(1);
    }
}
