import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Irasas {
    int suma;
    String data;
    String papildomaInfo;
    int id;

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public String getData(){
        return data;
    }

    public void setData(){
        LocalDate t = LocalDate.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.data = t.format(timeFormatter);
    }

    public int getId() {
        return id;
    }
}
