package Dependency_Inversion_Principle;

interface Printer{
    void print(String message);
}

class ConsolePrinter implements Printer{
    @Override
    public void print(String message){
        System.out.println("Printing to console: " +message);
    }
}

class FilePrinter implements Printer{
    @Override
    public void print(String message){
        System.out.println("Printing to file: "+message);
    }
}

// High-level module
class Logger {
    private final Printer printer;

    // Constructor injection
    Logger(Printer printer) {
        this.printer = printer;
    }

    void log(String message) {
        printer.print(message);
    }
}

public class DIP_Implementation {
    public static void main(String[] args) {
        // Creating instances of the Logger class with different types of printers
        Logger consoleLogger = new Logger(new ConsolePrinter());
        Logger fileLogger = new Logger(new FilePrinter());

        // Logging messages
        consoleLogger.log("Message logged to console");
        fileLogger.log("Message logged to file");
    }
}
