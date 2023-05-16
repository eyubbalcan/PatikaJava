import java.util.Scanner;

public class sifreUygulamasi {
    public static void main(String[] args) {
        String id, password ,newpassword;

        String paschang;

        Scanner input= new Scanner(System.in);

        System.out.print("Kullanıcı adınız:");
        id = input.nextLine();
        System.out.print("Şifreniz:");
        password = input.nextLine();
        if(id.equals("eyubbalcan") && password.equals("java123")){
            System.out.println("Giriş başarılı");
        } else if ((!id.equals("eyubbalcan") || password.equals(password))) {
            System.out.println("id veya şifre yanlış.");
            System.out.println("Şifrenizi unutuysanız 1'e basınız.");
            paschang = input.nextLine();
            if (paschang.equals("1")){
                System.out.print("Yeni şifrenizi giriniz: ");
                newpassword = input.nextLine();
                if(newpassword.equals(password) || newpassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifreniz oluşturuldu");
                }
            }else {
                System.out.println("Şifreniz değişmemiştir.");
            }

        }

    }


}
