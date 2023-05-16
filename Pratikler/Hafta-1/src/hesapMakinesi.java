import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        double a,b,result;
        int process;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz:");
        a= input.nextDouble();
        System.out.print("2. Sayıyı giriniz:");
        b= input.nextDouble();
        System.out.print("Hangi işlemi yapmak istiyorsunuz?\n "  +
                "Toplama için:1\n" +
                "Çıkarma için:2\n" +
                "Bölme için:3\n" +
                "Çarpma için:4\n" +
                "Basınız:");
        process = input.nextInt();

        switch (process){
            case 1:
                result = a + b;
                System.out.println("Sonuç"+a+"+"+b+"="+result);
                break;
            case 2:
                result = a - b;
                System.out.println("Sonuç"+a+"-"+b+"="+result);
                break;
            case 3:
                result = a / b;
                System.out.println("Sonuç"+a+"/"+b+"="+result);
                break;
            case 4:
                result = a * b;
                System.out.println("Sonuç"+a+"*"+b+"="+result);
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
        }


       /* if(process==1){
            result = a + b;
            System.out.println("Sonuç"+a+"+"+b+"="+result);
        }else if(process==2){
            result = a - b;
            System.out.println("Sonuç"+a+"-"+b+"="+result);

        } else if (process==3) {
            result = a / b;
            System.out.println("Sonuç"+a+"/"+b+"="+result);


        }else if (process==4){
            result = a * b;
            System.out.println("Sonuç"+a+"*"+b+"="+result);


    }else {
            System.out.println("Yanlış tuşlama yaptınız.");*/

        }
    }

