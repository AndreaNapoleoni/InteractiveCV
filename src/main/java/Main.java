import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.ECField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    private static String AUTHOR = "Andrea Napoleoni";
    private static String BIRTH = "12/02/1994";
    private static String pattern = "dd/MM/yyyy";
    private static String separazione = "";
    private static String benvenuto = "";
    private static String presentazione = "";

    public static void main(String[] args) throws IOException, ParseException, InterruptedException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        int YEAR = LocalDate.now().getYear() - LocalDate.parse(BIRTH, formatter).getYear();


////////////////////////////////////////////////////////////////////////////////////////////////////////////
        separazione = "***************************";
        benvenuto = String.format("Ciao! Ti do il benvenuto nel mio progetto di \"CV Interattivo\"");
        presentazione = String.format("Mi chiamo %s ed ho %d anni.\n" +
                "Sono uno sviluppatore con forte orientamento alla programmazione ad oggetti lato backend.\n" +
                "Oltre ad aver maturato esperienza con le diverse tecnologie, ho sviluppato attitudine a lavorare " +
                "in team ed alta flessibilità nel seguire più flussi contemporaneamente.\n" +
                "Sono alla ricerca di una realtà dinamica, all'interno della quale poter contribuire al massimo " +
                "delle mie capacità. Desidero mettermi in gioco ed imparare sempre più cose possibili, affinando " +
                "quindi skill e conoscenze.\nLaddove possibile sono disposto a mettermi in prima fila " +
                "per raggiungere il risultato richiesto.", AUTHOR, YEAR);
        String sviluppoTestSuBrowser = "Sviluppo di Test Automatizzati su Browser (Chrome, Edge, Firefox, IE, " +
                " etc) e su Dispositivi Mobile (Android, iOS) mediante Selenium e Appium, interagendo " +
                "con framework proprietari dei clienti, dell'azienda e con alcuni OpenSource.";
        String creazioneDB = "Creazione e gestione di Database MySQL.";
        String dashboard = "Realizzazione Dashboard mediante Node-RED per visualizzazione " +
                "dei dati prelevati dal Database.";
        String git = "Gestione di repository Git.";
        String dockerKubernetes = "Manutenzione di sistemi basati su Docker e realizzazione degli stessi " +
                "in ambiente Kubernetes.";
        String mvngradle = "Familiarità con Maven e Gradle";
        String uniLavoro = "Tra anni universitari ed esperienze lavorative ho imparato a:";
        String lavoroInTeam = "Lavorare sincronizzandomi con il team su ciascun task da svolgere.";
        String problemSolving = "Affinare le skill di Problem Solving, ricercando sempre la miglior soluzione " +
                "per far fronte al problema posto.";
        String tempo = "Individuare il giusto tempo da dedicare a ciascun progetto affidatomi, " +
                "assegnando priorità in base alle tempistiche di delivery e criticità in corso.";
        String proattivo = "Essere proattivo nei confronti di ogni sfida che mi si presenta.";
        String reply = "Reply - Concept Quality | nov 2020 - presente";
        String magistr = "Università degli Studi di Milano - Bicocca";
        String magistrDate = "Laurea magistrale | Ott 2018 - Ott 2020";
        String laureaMagistr = "Laurea magistrale in Informatica\n " +
                "\tTesi: Dashboard per visualizzazione ed analisi di dati su piattaforma IoT.";
        String trienn = "Università degli Studi di Bari - Aldo Moro";
        String triennDate = "Laurea triennale | Ott. 2014- Ott. 2018";
        String laureaTrienn = "Laurea triennale in Informatica e Tecnologie per la Produzione del Software\n " +
                "\tTesi: Analisi e Progettazione di un sistema per la prenotazione e gestione di aule universitarie.";
        ArrayList<Categoria> all = new ArrayList<Categoria>();
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Struttura esperienza1 = new Struttura("Test Automation Engeneer",
                new ArrayList<String>(Arrays.asList(reply, sviluppoTestSuBrowser, creazioneDB, dashboard, git, dockerKubernetes, mvngradle)));
        Categoria lavoro = new Categoria("Esperienze lavorative", new ArrayList<Struttura>(Collections.singleton(esperienza1)));
        all.add(lavoro);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Struttura esperienza2 = new Struttura(uniLavoro, new ArrayList<String>(Arrays.asList(lavoroInTeam, problemSolving, tempo, proattivo)));
        Categoria softSkill = new Categoria("Soft Skill", new ArrayList<Struttura>(Collections.singleton(esperienza2)));
        all.add(softSkill);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Struttura magistrale = new Struttura(magistr, magistrDate, new ArrayList<String>(Collections.singleton(laureaMagistr)));
        Struttura triennale = new Struttura(trienn, triennDate, new ArrayList<String>(Collections.singleton(laureaTrienn)));
        Categoria istruzione = new Categoria("Istruzione", new ArrayList<Struttura>(Arrays.asList(magistrale, triennale)));
        all.add(istruzione);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Struttura italiano = new Struttura("Italiano", "Madrelingua");
        Struttura inglese = new Struttura("Inglese", new ArrayList<String>(Arrays.asList("Ascolto: B2", "Parlato: B2", "Scritto: B1")));
        Categoria lingue = new Categoria("Lingue", new ArrayList<Struttura>(Arrays.asList(italiano, inglese)));
        all.add(lingue);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Struttura email = new Struttura("E-mail", "napoleoniandrea@pec.it");
        Struttura telefono = new Struttura("Telefono", "+393791756740");
        Categoria contatti = new Categoria("Contatti", new ArrayList<Struttura>(Arrays.asList(email, telefono)));
        all.add(contatti);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Categoria competenze = new Categoria("Competenze",
                new ArrayList<Struttura>(Arrays.asList(
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
                )
        );
        all.add(competenze);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Categoria ide = new Categoria("IDE", new ArrayList<Struttura>(Arrays.asList(
                new Struttura("IntelliJ"),
                new Struttura("VS Code"),
                new Struttura("Eclipse")
        )));
        all.add(ide);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(separazione);
        System.out.println(benvenuto);
        System.out.println(presentazione);
        printMenu(all);
        ArrayList<Categoria> copia = all;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean avereInfo = true;
        int scelta = 10;
        String opt = "";
        while (avereInfo) {
            try {
                if (copia.size() != 0) {
                    opt = reader.readLine().trim();
                    scelta = Integer.parseInt(opt);
                    if (scelta >= 1 && scelta <= copia.size()) {
                        System.out.println(separazione);
                        System.out.println("Hai scelto " + scelta);
                        System.out.println(separazione);

                        Categoria inAnalisi = copia.get(scelta - 1);

                        System.out.println(inAnalisi.getNomeCategoria());

                        for (Struttura struttura : inAnalisi.getStruttura()) {

                            System.out.println(struttura.getTitolo());
                            if (struttura.getSottotitolo().length() > 0) {
                                System.out.println(struttura.getSottotitolo());
                            }
                            for (String str : struttura.getElementi()) {
                                System.out.println(" - " + str);
                            }

                        }
                        copia.remove(copia.get(scelta - 1));
                    } else {
                        System.out.println("Mi dispiace ma \"" + opt + "\" non è tra le operazioni previste");
                    }
                } else {
                    System.out.println("Ora sai tutto di me. Se il mio profilo è in linea con quel che cercavi, " +
                            "scrivimi all'indirizzo <<napoleoniandrea@pec.it>>.\n" +
                            "Ciao!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Inserisci un numero, non cercare la falla ;)");
                avereInfo = true;
            }
            printMenu(all);
        }
    }

    private static void printMenu(ArrayList<Categoria> lista) {
        System.out.println(separazione);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(String.format("[%d] - %s", (i + 1), lista.get(i).getNomeCategoria()));
        }
        System.out.println(separazione);
    }
}
