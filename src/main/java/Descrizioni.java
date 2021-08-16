import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Descrizioni {
    private static String AUTHOR = "Andrea Napoleoni";
    private static String BIRTH = "12/02/1994";
    private static String pattern = "dd/MM/yyyy";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    private static int YEAR = LocalDate.now().getYear() - LocalDate.parse(BIRTH, formatter).getYear();
    private static String separazione = "***************************";
    private static String benvenuto = String.format("Ciao! Ti do il benvenuto nel mio progetto di \"CV Interattivo\"");
    private static String presentazione = String.format("Mi chiamo %s ed ho %d anni.\n" +
            "Sono uno sviluppatore con forte orientamento alla programmazione ad oggetti lato backend.\n" +
            "Oltre ad aver maturato esperienza con le diverse tecnologie, ho sviluppato attitudine a lavorare " +
            "in team ed alta flessibilità nel seguire più flussi contemporaneamente.\n" +
            "Sono alla ricerca di una realtà dinamica, all'interno della quale poter contribuire al massimo " +
            "delle mie capacità. Desidero mettermi in gioco ed imparare sempre più cose possibili, affinando " +
            "quindi skill e conoscenze.\nLaddove possibile sono disposto a mettermi in prima fila " +
            "per raggiungere il risultato richiesto.", AUTHOR, YEAR);
    private static String sviluppoTestSuBrowser = "Sviluppo di Test Automatizzati su Browser (Chrome, Edge, Firefox, IE, " +
            " etc) e su Dispositivi Mobile (Android, iOS) mediante Selenium e Appium, interagendo " +
            "con framework proprietari dei clienti, dell'azienda e con alcuni OpenSource.";
    private static String creazioneDB = "Creazione e gestione di Database MySQL.";
    private static String dashboard = "Realizzazione Dashboard mediante Node-RED per visualizzazione " +
            "dei dati prelevati dal Database.";
    private static String git = "Gestione di repository Git.";
    private static String dockerKubernetes = "Manutenzione di sistemi basati su Docker e realizzazione degli stessi " +
            "in ambiente Kubernetes.";
    private static String mvngradle = "Familiarità con Maven e Gradle";
    private static String uniLavoro = "Tra anni universitari ed esperienze lavorative ho imparato a:";
    private static String lavoroInTeam = "Lavorare sincronizzandomi con il team su ciascun task da svolgere.";
    private static String problemSolving = "Affinare le skill di Problem Solving, ricercando sempre la miglior soluzione " +
            "per far fronte al problema posto.";
    private static String tempo = "Individuare il giusto tempo da dedicare a ciascun progetto affidatomi, " +
            "assegnando priorità in base alle tempistiche di delivery e criticità in corso.";
    private static String proattivo = "Essere proattivo nei confronti di ogni sfida che mi si presenta.";
    private static String reply = "Reply - Concept Quality | nov 2020 - presente";
    private static String magistr = "Università degli Studi di Milano - Bicocca";
    private static String magistrDate = "Laurea magistrale | Ott 2018 - Ott 2020";
    private static String laureaMagistr = "Laurea magistrale in Informatica\n " +
            "\tTesi: Dashboard per visualizzazione ed analisi di dati su piattaforma IoT.";
    private static String trienn = "Università degli Studi di Bari - Aldo Moro";
    private static String triennDate = "Laurea triennale | Ott. 2014- Ott. 2018";
    private static String laureaTrienn = "Laurea triennale in Informatica e Tecnologie per la Produzione del Software\n " +
            "\tTesi: Analisi e Progettazione di un sistema per la prenotazione e gestione di aule universitarie.";

    public static String getBIRTH() {
        return BIRTH;
    }

    public static String getPattern() {
        return pattern;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public int getYEAR() {
        return YEAR;
    }

    public static String getSeparazione() {
        return separazione;
    }

    public static String getBenvenuto() {
        return benvenuto;
    }

    public static String getPresentazione() {
        return presentazione;
    }

    public static String getSviluppoTestSuBrowser() {
        return sviluppoTestSuBrowser;
    }

    public static String getCreazioneDB() {
        return creazioneDB;
    }

    public static String getDashboard() {
        return dashboard;
    }

    public static String getGit() {
        return git;
    }

    public static String getDockerKubernetes() {
        return dockerKubernetes;
    }

    public static String getMvngradle() {
        return mvngradle;
    }

    public static String getUniLavoro() {
        return uniLavoro;
    }

    public static String getLavoroInTeam() {
        return lavoroInTeam;
    }

    public static String getProblemSolving() {
        return problemSolving;
    }

    public static String getTempo() {
        return tempo;
    }

    public static String getProattivo() {
        return proattivo;
    }

    public static String getReply() {
        return reply;
    }

    public static String getMagistr() {
        return magistr;
    }

    public static String getMagistrDate() {
        return magistrDate;
    }

    public static String getLaureaMagistr() {
        return laureaMagistr;
    }

    public static String getTrienn() {
        return trienn;
    }

    public static String getTriennDate() {
        return triennDate;
    }

    public static String getLaureaTrienn() {
        return laureaTrienn;
    }

    public static ArrayList<Struttura> getEsperienze1() {
        Struttura esperienza1 = new Struttura("Test Automation Engeneer",
                new ArrayList<String>(Arrays.asList(reply,
                sviluppoTestSuBrowser,
                creazioneDB,
                dashboard,
                git,
                dockerKubernetes,
                mvngradle)
                )
        );
        return new ArrayList<Struttura>(Collections.singleton(esperienza1));
    }

    public static ArrayList<Struttura> getEsperienze2() {
        Struttura esperienza2 = new Struttura(uniLavoro, new ArrayList<String>(Arrays.asList(reply,
                lavoroInTeam, problemSolving, tempo, proattivo)));
        return new ArrayList<Struttura>(Collections.singleton(esperienza2));

    }

    public static ArrayList<Struttura> getUniversità() {
        return new ArrayList<Struttura>(Arrays.asList(
                new Struttura(magistr, magistrDate,
                        new ArrayList<String>(Collections.singleton(laureaMagistr))),
                new Struttura(trienn, triennDate,
                        new ArrayList<String>(Collections.singleton(laureaTrienn))
                )
        ));

    }

    public static ArrayList<Struttura> getLingue() {
        return new ArrayList<Struttura>(Arrays.asList(
                new Struttura("Italiano", "Madrelingua"),
                new Struttura("Inglese", new ArrayList<String>(Arrays.asList("Ascolto: B2", "Parlato: B2", "Scritto: B1"))
                ))
        );
    }

    public static ArrayList<Struttura> getContatti(){
        return new ArrayList<Struttura>(Arrays.asList(
                new Struttura("E-mail", "napoleoniandrea@pec.it"),
                new Struttura("Telefono", "+393791756740")
        ));
    }

    public static ArrayList<Struttura> getCompetenze(){
        return new ArrayList<Struttura>(Arrays.asList(
                new Struttura("Java", "9/10"),
                new Struttura("Git", "7/10"),
                new Struttura("MySQL", "7/10"),
                new Struttura("Docker", "6/10"),
                new Struttura("Kubernetes", "4/10"),
                new Struttura("Selenium", "8/10"),
                new Struttura("Appium", "8/10"),
                new Struttura("Maven", "7/10"),
                new Struttura("Gradle", "5/10"),
                new Struttura("HTML & CSS", "6/10"),
                new Struttura("Node-RED", "9/10"),
                new Struttura("Sistemi Unix", "7/10"),
                new Struttura("Office", "7/10"),
                new Struttura("SSH", "8/10"))
        );
    }
}
