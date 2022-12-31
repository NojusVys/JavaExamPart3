import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IslaiduIrasas extends Irasas {
    private String islaiduKategorija;
    private String atsiskaitymoBudas;

    public IslaiduIrasas(int id, double suma, LocalDateTime now, String kategorija,
                         boolean atsiskaitymoBudasBankas, String papildomaInfo, String islaiduTipas,
                         String irasoTipas) {
        super();
    }


    public String getIslaiduKategorija() {
        return islaiduKategorija;
    }

    public void setIslaiduKategorija(String kategorija) {
        this.islaiduKategorija = kategorija;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

//    public int getId() {
//        return id;
//    }

    public void setId(int id) {
        this.id = id;
    }
}
