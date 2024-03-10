import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Gelişmiş Hesap Makinesi");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("5. Üs Alma");
            System.out.println("6. Karekök Alma");
            System.out.println("7. Dikdörtgen Alanı Hesapla");
            System.out.println("8. Dikdörtgen Çevresi Hesapla");
            System.out.println("9. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Hesap makinesi kapatılıyor...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Toplama için iki sayı girin: ");
                    result = scanner.nextDouble() + scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Çıkarma için iki sayı girin: ");
                    result = scanner.nextDouble() - scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Çarpma için iki sayı girin: ");
                    result = scanner.nextDouble() * scanner.nextDouble();
                    break;
                case 4:
                    System.out.print("Bölme için iki sayı girin: ");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Hata: Sıfıra bölme hatası!");
                        continue;
                    }
                    break;
                case 5:
                    System.out.print("Taban ve üs girin: ");
                    double base = scanner.nextDouble();
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;
                case 6:
                    System.out.print("Karekök almak için bir sayı girin: ");
                    result = Math.sqrt(scanner.nextDouble());
                    break;
                case 7:
                    System.out.print("Dikdörtgenin uzun kenarını girin: ");
                    double uzunKenar = scanner.nextDouble();
                    System.out.print("Dikdörtgenin kısa kenarını girin: ");
                    double kisaKenar = scanner.nextDouble();
                    result = dikdortgenAlanHesapla(uzunKenar, kisaKenar);
                    break;
                case 8:
                    System.out.print("Dikdörtgenin uzun kenarını girin: ");
                    double uzunKenarC = scanner.nextDouble();
                    System.out.print("Dikdörtgenin kısa kenarını girin: ");
                    double kisaKenarC = scanner.nextDouble();
                    result = dikdortgenCevreHesapla(uzunKenarC, kisaKenarC);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }

            System.out.println("Sonuç: " + result);
        }
    }

    public static double dikdortgenAlanHesapla(double uzunKenar, double kisaKenar) {
        return uzunKenar * kisaKenar;
    }

    public static double dikdortgenCevreHesapla(double uzunKenar, double kisaKenar) {
        return 2 * (uzunKenar + kisaKenar);
    }
}
