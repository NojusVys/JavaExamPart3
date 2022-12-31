import java.util.ArrayList;

public class Biudzetas {
    ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();
    private int pajamosSum = 0;
    private int islaidosSum = 0;

    public void pridetiPajamuIrasa(PajamuIrasas pi1){
        pajamos.add(pi1);
    }

    public void pridetiIslaiduIrasa(IslaiduIrasas ii1){
        islaidos.add(ii1);
    }

    public void gautiPajamuIrasa(){
        int count = 1;
        for(PajamuIrasas pajam : pajamos){
            System.out.printf("""
                Operacijos nr.: %d
                Suma: %d
                Kategorija: %s
                Data: %s
                Ar i banko saskaita: %b
                Papildoma informacija: %s
                """, count, pajam.getSuma(), pajam.getKategorija(), pajam.getData(),
                    pajam.isPozymisArIBanka(), pajam.getPapildomaInfo());
            count++;
        }
    }

    public void gautiIslaiduIsrasa(){
        int count = 1;
        for(IslaiduIrasas islaid : islaidos){
            System.out.printf("""
                Operacijos nr.: %d
                Suma: %d
                Kategorija: %s
                Data ir laikas: %s
                Atsiskaitymo budas: %s
                Papildoma informacija: %s
                """, count, islaid.getSuma(), islaid.getKategorija(), islaid.getDataSuLaiku(),
                    islaid.getAtsiskaitymoBudas(), islaid.getPapildomaInfo());
            count++;
        }

    }

    public void removeP(int i){
        pajamos.remove(i);
    }

    public void removeI(int i){
        islaidos.remove(i);
    }

    public double balansas(){
        for (PajamuIrasas pajamo : pajamos) {
            pajamosSum += pajamo.getSuma();
        }

        for (IslaiduIrasas islaido : islaidos) {
            islaidosSum += islaido.getSuma();
        }

        return pajamosSum - islaidosSum;
    }
}
