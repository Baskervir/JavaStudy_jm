package ch06.practiceExample.printerNonInstance;

public class PrinterExample {
    public static void main(String[] args) {
        //Printer printer = new Printer();
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
