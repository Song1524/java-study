package hw.array;

public class Hw7 {

    public static void main(String[] args) {
        String[] report = {"Introduction", "Research", "Conclusion"};

        String[] copy = new String[report.length];
        for (int i = 0; i < report.length; i++) {
            copy[i] = report[i];
        }

        copy[0] = "Team Feedback";

        System.out.print("원본 보고서: ");
        for (int i = 0; i < report.length; i++) {
            System.out.print(report[i]);
            if (i != report.length - 1) System.out.print(", ");
        }

        System.out.println();

        System.out.print("복사본 보고서: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]);
            if (i != copy.length - 1) System.out.print(", ");
        }
    }
}
