public class Main {

    public static void main(String[] args) {
    String ogrenci1="Derin";
    String ogrenci2="Aysun";
    String ogrenci3="Salih";

    System.out.println(ogrenci1);
    System.out.println(ogrenci2);
    System.out.println(ogrenci3);

    System.out.println("---------------------------------");

    String[] ogrenciler = new String[3];
    ogrenciler[0] ="Derin";
    ogrenciler[1] ="Aysun";
    ogrenciler[2] ="Salih";

    for (int i=0;i<ogrenciler.length;i++){
        System.out.println(ogrenciler[i]);
    }
        System.out.println("---------------------------------");

        for (String ogrenci:ogrenciler){
        System.out.println(ogrenci);
    }

    }
}