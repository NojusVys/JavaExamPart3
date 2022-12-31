import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
//    ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
//    ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
    ArrayList<Irasas> irasas = new ArrayList<>();
    private int pajamosSum = 0;
    private int islaidosSum = 0;
    public static int id = 1;

//    public void pridetiPajamuIrasa(PajamuIrasas pi1){
//        pajamos.add(pi1);
//    }
//
//    public void pridetiIslaiduIrasa(IslaiduIrasas ii1){
//        islaidos.add(ii1);
//    }

    public void pridetiIrasa(Scanner sc){ 
        Irasas irasas1 = sukurtiIrasa(sc);
    }
    
    public Irasas sukurtiIrasa(Scanner sc){
        int newId = id++;
        return gautiNaujaIrasa(sc, newId);
    }

    private Irasas gautiNaujaIrasa(Scanner sc, int newId) {
        System.out.println("Pasirinkite");
        String type = showSubmenuItems(sc, "[1] - Pajamų įrašas",
                "[2] - Išlaidų įrašas");
        System.out.println(Pranesimai.SUMA.pranesimas);
        double suma = validateAndGetDouble(sc);
        System.out.println(Pranesimai.KATEGORIJA.pranesimas);
        String kategorija = validateAndGetString(sc);
        System.out.println(Pranesimai.AR_I_BANKA.pranesimas);
        boolean atsiskaitymoBudasBankas = taipNe(sc);
        System.out.println(Pranesimai.PAPILDOMA_INFO.pranesimas);
        String papildomaInfo = validateAndGetString(sc);
        if (type.equals("1")) {
            String irasoTipas = "pajamos";
            System.out.println(Pranesimai.INCOME_TYPE.message);
            String pajamuTipas = validateAndGetType(sc, type);
            return new PajamuIrasas(id, suma, LocalDate.now(), kategorija, atsiskaitymoBudasBankas, papildomaInfo, pajamuTipas, irasoTipas);
        } else if (type.equals("2")) {
            String irasoTipas = "islaidos";
            System.out.println(Messages.EXPENSE_TYPE.message);
            String islaiduTipas = validateAndGetType(sc, type);
            return new IslaiduIrasas(id, suma, LocalDateTime.now(), kategorija, atsiskaitymoBudasBankas, papildomaInfo, islaiduTipas, irasoTipas);
        } else {
            return null;
        }
    }

    public ArrayList<PajamuIrasas> gautiPajamuIrasa(){

        return null;
    }

    public ArrayList<IslaiduIrasas> gautiIslaiduIrasa(){

        return null;
    }

//    public void gautiPajamuIrasa(){
//        for(PajamuIrasas pajam : pajamos){
//            System.out.printf("""
//                Operacijos nr.: %d
//                Suma: %d
//                Kategorija: %s
//                Data: %s
//                Ar i banko saskaita: %b
//                Papildoma informacija: %s
//                """, pajam.getId(), pajam.getSuma(), pajam.getKategorija(), pajam.getData(),
//                    pajam.isPozymisArIBanka(), pajam.getPapildomaInfo());
//        }
//    }
//
//    public void gautiIslaiduIsrasa(){
//        for(IslaiduIrasas islaid : islaidos){
//            System.out.printf("""
//                Operacijos nr.: %d
//                Suma: %d
//                Kategorija: %s
//                Data ir laikas: %s
//                Atsiskaitymo budas: %s
//                Papildoma informacija: %s
//                """, islaid.getId(), islaid.getSuma(), islaid.getKategorija(), islaid.getData(),
//                    islaid.getAtsiskaitymoBudas(), islaid.getPapildomaInfo());
//        }
//
//    }

//    public void removeP(int i){
//        pajamos.remove(i);
//    }
//
//    public void removeI(int i){
//        islaidos.remove(i);
//    }
//
//    public double balansas(){
//        for (PajamuIrasas pajamo : pajamos) {
//            pajamosSum += pajamo.getSuma();
//        }
//
//        for (IslaiduIrasas islaido : islaidos) {
//            islaidosSum += islaido.getSuma();
//        }
//
//        return pajamosSum - islaidosSum;
//    }
}
