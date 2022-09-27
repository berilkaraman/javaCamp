
public class Main {

    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {

            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İYİ: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Kötü: Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");
        }

    }
}