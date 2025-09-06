import java.util.Scanner;

public class ZodiacSignFinder {
    
    public static String getZodiacSign(int day, int month) {
        switch (month) {
            case 1:  // January
                return (day < 20) ? "Capricorn ♑" : "Aquarius ♒";
            case 2:  // February
                return (day < 19) ? "Aquarius ♒" : "Pisces ♓";
            case 3:  // March
                return (day < 21) ? "Pisces ♓" : "Aries ♈";
            case 4:  // April
                return (day < 20) ? "Aries ♈" : "Taurus ♉";
            case 5:  // May
                return (day < 21) ? "Taurus ♉" : "Gemini ♊";
            case 6:  // June
                return (day < 21) ? "Gemini ♊" : "Cancer ♋";
            case 7:  // July
                return (day < 23) ? "Cancer ♋" : "Leo ♌";
            case 8:  // August
                return (day < 23) ? "Leo ♌" : "Virgo ♍";
            case 9:  // September
                return (day < 23) ? "Virgo ♍" : "Libra ♎";
            case 10: // October
                return (day < 23) ? "Libra ♎" : "Scorpio ♏";
            case 11: // November
                return (day < 22) ? "Scorpio ♏" : "Sagittarius ♐";
            case 12: // December
                return (day < 22) ? "Sagittarius ♐" : "Capricorn ♑";
            default:
                return "❌ Invalid month entered.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("✨ Zodiac Sign Predictor ✨");
        System.out.print("Enter your birth day (1-31): ");
        int day = sc.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = sc.nextInt();

        String zodiac = getZodiacSign(day, month);
        System.out.println("\nYour Zodiac Sign is: " + zodiac);

        sc.close();
    }
}
