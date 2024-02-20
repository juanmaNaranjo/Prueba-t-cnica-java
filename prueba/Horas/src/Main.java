import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (1-12): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        String result = convertHoursAndMinutesToWords(hours, minutes);

        System.out.println("Time in words: " + result);
        scanner.close();
    }

    public static String convertHoursAndMinutesToWords(int hours, int minutes) {
        if (hours < 1 || hours > 12) {
            throw new IllegalArgumentException("Hours must be between 1 and 12 (inclusive).");
        }

        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59 (inclusive).");
        }

        String[] hoursInWords = {"seis", "siete", "ocho", "nueve", "diez", "once", "doce", "un", "dos", "tres", "cuatro", "cinco"};
        String[] minutesInWords = {"cero", "diez", "veinte", "treinta", "cuarenta", "cincuenta"};

        StringBuilder sb = new StringBuilder();

        sb.append(hoursInWords[hours - 1]);

        if (minutes > 0) {
            if (minutes == 1) {
                if (hours == 12) {
                    sb.append(" en punto");
                } else {
                    sb.append(" y un minuto");
                }
            } else if (minutes == 59) {
                sb.append(" y cincuenta y nueve minutos");
            } else if (minutes % 10 == 0) {
                sb.append(" y ").append(minutesInWords[minutes / 10 - 1]).append(" minutos");
            } else if (minutes < 30) {
                sb.append(" y ").append(minutesInWords[minutes / 10 - 1]).append(" minutos");
            } else {
                sb.append(" y ").append(minutesInWords[60 - minutes]).append(" minutos");
            }
        } else {
            sb.append(" en punto");
        }

        return sb.toString();

    }
}


