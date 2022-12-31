import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PajamuIrasas extends Irasas {
    private String pajamuKategorija;
    private boolean pozymisArIBanka;

    public PajamuIrasas(int id, double suma, LocalDate now, String kategorija,
                        boolean atsiskaitymoBudasBankas, String papildomaInfo,
                        String pajamuTipas, String irasoTipas) {
        super();
    }


    public String getPajamuKategorija() {
        return pajamuKategorija;
    }

    public void setPajamuKategorija(String kategorija) {
        this.pajamuKategorija = kategorija;
    }

    public boolean isPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(boolean pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

//    public int getId() {
//        return id;
//    }

    public void setId(int id) {
        this.id = id;
    }
}
