package az.softwarevillage.hackerrank.day1;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Əvvəlcədən verilmiş dəyişənlər
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Scanner obyektini yaradın
        Scanner scan = new Scanner(System.in);

        // Yeni dəyişənləri elan edin
        int myInt;
        double myDouble;
        String myString;

        // Girişləri oxuyun
        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        scan.nextLine(); // Yeni xətt simvolunu təmizləyin
        myString = scan.nextLine();

        // Əməliyyatlar və nəticə
        System.out.println(i + myInt); // Integer cəmi
        System.out.println(d + myDouble); // Double cəmi
        System.out.println(s + myString); // String birləşməsi

        scan.close();
    }
}
