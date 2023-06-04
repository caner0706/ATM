
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        String kullaniciAdi, parola;
        
        int hak = 3;
        int bakiye = 1500;
        int secim;
        
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız: ");
            kullaniciAdi = scanner.nextLine();
            System.out.print("Parolanız: ");
            parola = scanner.nextLine();

            if (kullaniciAdi.equals("patika") && parola.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = Integer.parseInt(scanner.nextLine());

                    switch (secim) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int miktar = Integer.parseInt(scanner.nextLine());
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            miktar = Integer.parseInt(scanner.nextLine());
                            if (miktar > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= miktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz bir seçenek girdiniz.");
                            break;
                    }
                } while (secim != 4);

                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hak: " + hak);
                }
            }
        }
        
    }
}
