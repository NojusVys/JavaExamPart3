public enum Pranesimai {
    BLOGA_IVESTIS("Netinkama įvestis."),
    SUMA("Įveskite sumą."),
    KATEGORIJA("Įveskite kategoriją."),
    PAPILDOMA_INFO("Įveskite papildomos informacijos"),
    AR_I_BANKA("Ar pajamos pervedamos į banką? (true/false)"),
    TRINTI("Kurią operaciją norite pašalinti?"),
    REDAGUOTI("Pasirinkite operaciją, kuria norite redaguoti."),
    NETINKAMAS_ID("Operacija su tokiu id nerasta.");


    public final String pranesimas;

    Pranesimai(String pranesimas) {
        this.pranesimas = pranesimas;
    }
}
