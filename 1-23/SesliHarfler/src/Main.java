public class Main {
    public static void main(String[] args) {

        char harf = 'A';

     /*  if (harf=='A'){
           System.out.println("Bu harf sesli harftir.");
       }else {
           System.out.println("Bu harf Sesli harf değildir.");
       }*/

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }

    }
}