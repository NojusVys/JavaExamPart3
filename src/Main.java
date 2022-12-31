import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        PajamuIrasas pi1 = new PajamuIrasas();
        IslaiduIrasas ii1 = new IslaiduIrasas();
        Biudzetas b1 = new Biudzetas();
        Scanner sc = new Scanner(System.in);
        boolean runProgram = true;
        int pajamosId = 1;
        int islaidosId = 1;

        komandos();
        while(runProgram){
            String command = sc.nextLine().toLowerCase();
            switch (command) {
                case "n" -> {
                    b1.pridetiIrasa(sc);
                }
//                case "pajamos" -> {
//                    System.out.println("Įveskite pajamų kiekį:");
//                    pi1.setSuma(Integer.parseInt(sc.nextLine()));
//                    System.out.println("Pajamų kategoriją:");
//                    pi1.setPajamuKategorija(sc.nextLine());
//                    System.out.println("Ar į banką (true/false)");
//                    pi1.setPozymisArIBanka(Boolean.parseBoolean(sc.nextLine()));
//                    System.out.println("Papildoma informacija:");
//                    pi1.setPapildomaInfo(sc.nextLine());
//                    pi1.setData();
//                    pi1.setId(pajamosId);
//                    b1.pridetiIrasa(pi1, command);
//                    pi1 = new PajamuIrasas();
//                    pajamosId++;
//                }
//                case "islaidos" -> {
//                    System.out.println("Įveskite išlaidų kiekį:");
//                    ii1.setSuma(Integer.parseInt(sc.nextLine()));
//                    System.out.println("Išlaidų kategorija:");
//                    ii1.setIslaiduKategorija(sc.nextLine());
//                    System.out.println("Atsiskaitymo būdas:");
//                    ii1.setAtsiskaitymoBudas(sc.nextLine());
//                    System.out.println("Papildoma informacija:");
//                    ii1.setPapildomaInfo(sc.nextLine());
//                    ii1.setData();
//                    ii1.setId(islaidosId);
//                    b1.pridetiIrasa(ii1, command);
//                    islaidosId++;
//                    ii1 = new IslaiduIrasas();
//                }
                case "isvesti pajamas" -> {
                    b1.gautiPajamuIrasa();
                }
                case "isvesti islaidas" -> {
                    b1.gautiIslaiduIrasa();
                }
//                case "balansas" -> System.out.printf("Dabartinis balansas: %.2f EUR\n", b1.balansas());
//                case "remove p" -> {
//                    System.out.println("Kurią operaciją norite pašalinti?");
//                    int i = Integer.parseInt(sc.nextLine());
//                    b1.removeP(i - 1);
//                }
//                case "remove i" -> {
//                    System.out.println("Kurią operaciją norite pašalinti?");
//                    int i = Integer.parseInt(sc.nextLine());
//                    b1.removeI(i - 1);
//                }
                case "komandos" -> komandos();
                case "stop" -> {
                    System.out.println("Programa baigiama.");
                    runProgram = false;
                }
                default -> System.out.println(Pranesimai.BLOGA_IVESTIS.pranesimas);
            }
        }
        sc.close();
    }

    static void komandos(){
        System.out.print("""
                n - sukurti naują įrašą
                isvesti pajamas
                isvesti išlaidas
                balansas - patikrinti balansą
                remove p - pašalinti pajamų operaciją iš sąrašo
                remove i - pašalinti išlaidų operaciją iš sąrašo
                komandos - komandų sąrašas
                stop - nutraukia programos veikimą
                """);
    }
}