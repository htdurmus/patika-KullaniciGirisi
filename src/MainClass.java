import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("*** Kullanıcı Girişi Uygulaması ***\n");

        String kadi="Talha";
        String sifre="1234567";

        System.out.print("Kullanıcı Adı > ");
        String giris=s.nextLine();

        if(giris.equals(kadi)) {

            System.out.print("Şifre > ");
            giris=s.nextLine();

            if(giris.equals(sifre)) System.out.println("Kullanıcı girişi yapıldı. Hoşgeldiniz "+kadi);

            else{
                System.out.print("Şifreyi yanlış girdiniz. Şifrenizi sıfırlamak ister misiniz? (Y/N) > ");
                String cevap=s.nextLine();
                if(cevap.equals("N")) System.out.print("Çıkış yapıldı.");
                else{
                    System.out.print("Kullanıcı adı giriniz > ");
                    giris=s.nextLine();
                    if(giris.equals(kadi)) {
                        System.out.print(giris+" kullanıcısı için yeni bir şifre giriniz > ");
                        String yeniSifre=s.nextLine();
                        System.out.print("Şifreyi yeniden giriniz > ");
                        String yeniSifre2=s.nextLine();

                        if(yeniSifre.equals(yeniSifre2) && !yeniSifre.equals(sifre)){
                            sifre=yeniSifre;
                            System.out.print("Şifreniz başarıyla değiştirildi.");
                        }
                        else System.out.println("Girdiğiniz şifreler eşleşmiyor veya eski şifreyle aynı olamaz.");

                    }
                    else System.out.println("Girdiğiniz kullanıcı bulunamadı. Bilgileri gözden geçirip tekrar deneyiniz.");
                }
            }
        }

        else System.out.println("Girdiğiniz kullanıcı bulunamadı. Bilgileri gözden geçirip tekrar deneyiniz.");

    }
}
