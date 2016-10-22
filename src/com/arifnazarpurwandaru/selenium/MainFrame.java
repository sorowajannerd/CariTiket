/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arifnazarpurwandaru.selenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ASUS
 */
public class MainFrame extends javax.swing.JFrame {
public Locale id = new Locale("in", "ID");
public SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy", id);
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initStasiun(comboStBerangkat);
        initStasiun(comboStTujuan);
        initTanggal(comboTanggal);
        
        initStasiun(comboStBerangkatBiasa);
        initStasiun(comboStTujuanBiasa);
        initTanggal(comboTanggalBiasa);
        initLink(comboLink);
        
        pnlProxySetting.setVisible(false);
        initKereta(comboKereta);
        
//        System.setOut(new PrintStream(new OutputStream() {
//            @Override
//            public void write(int b) throws IOException {
//               konsol.append(String.valueOf((char)b));
//            }
//          }
//        ));
    }
    
    private void initLink(JComboBox c){
        c.addItem(new ComboItem("http://tiket.kereta-api.co.id/","http://tiket.kereta-api.co.id/"));
        c.addItem(new ComboItem("http://tiket1.kereta-api.co.id/","http://tiket1.kereta-api.co.id/"));
        c.addItem(new ComboItem("http://tiket2.kereta-api.co.id/","http://tiket2.kereta-api.co.id/"));
        c.addItem(new ComboItem("http://tiket3.kereta-api.co.id/","http://tiket3.kereta-api.co.id/"));
        c.addItem(new ComboItem("http://tiket4.kereta-api.co.id/","http://tiket4.kereta-api.co.id/"));
    }
    private void initStasiun(JComboBox c){
        c.addItem(new ComboItem("...", ""));
        c.addItem(new ComboItem("BANDUNG", "BD#BANDUNG"));
        c.addItem(new ComboItem("CICALENGKA", "CCL#CICALENGKA"));
        c.addItem(new ComboItem("CIKADONGDONG", "CD#CIKADONGDONG"));
        c.addItem(new ComboItem("CIMAHI", "CMI#CIMAHI"));
        c.addItem(new ComboItem("GEDEBAGE", "GDB#GEDEBAGE"));
        c.addItem(new ComboItem("HAURPUGUR", "HRP#HAURPUGUR"));
        c.addItem(new ComboItem("KIARACONDONG", "KAC#KIARACONDONG"));
        c.addItem(new ComboItem("PADALARANG", "PDL#PADALARANG"));
        c.addItem(new ComboItem("RANCAEKEK", "RCK#RANCAEKEK"));
        c.addItem(new ComboItem("RENDEH", "RH#RENDEH"));
        c.addItem(new ComboItem("BANJAR", "BJR#BANJAR"));
        c.addItem(new ComboItem("LANGEN", "LN#LANGEN"));
        c.addItem(new ComboItem("KARANGSARI", "KRR#KARANGSARI"));
        c.addItem(new ComboItem("KEBASEN", "KBS#KEBASEN"));
        c.addItem(new ComboItem("KEMRANJEN", "KJ#KEMRANJEN"));
        c.addItem(new ComboItem("NOTOG", "NTG#NOTOG"));
        c.addItem(new ComboItem("SUMPIUH", "SPH#SUMPIUH"));
        c.addItem(new ComboItem("TAMBAK", "TBK#TAMBAK"));
        c.addItem(new ComboItem("BANYUWANGIBARU", "BW#BANYUWANGIBARU"));
        c.addItem(new ComboItem("GLENMORE", "GLM#GLENMORE"));
        c.addItem(new ComboItem("KALIBARU", "KBR#KALIBARU"));
        c.addItem(new ComboItem("KALISETAIL", "KSL#KALISETAIL"));
        c.addItem(new ComboItem("KARANGASEM", "KNE#KARANGASEM"));
        c.addItem(new ComboItem("ROGOJAMPI", "RGP#ROGOJAMPI"));
        c.addItem(new ComboItem("SUMBERWADUNG", "SWD#SUMBERWADUNG"));
        c.addItem(new ComboItem("TEMUGURUH", "TGR#TEMUGURUH"));
        c.addItem(new ComboItem("BATANG", "BTG#BATANG"));
        c.addItem(new ComboItem("UJUNGNEGORO", "UJN#UJUNGNEGORO"));
        c.addItem(new ComboItem("BATURAJA", "BTA#BATURAJA"));
        c.addItem(new ComboItem("PANINJAWAN", "PNW#PANINJAWAN"));
        c.addItem(new ComboItem("BEKASI", "BKS#BEKASI"));
        c.addItem(new ComboItem("BINJAI", "BIJ#BINJAI"));
        c.addItem(new ComboItem("BLITAR", "BL#BLITAR"));
        c.addItem(new ComboItem("GARUM", "GRM#GARUM"));
        c.addItem(new ComboItem("KESAMBEN", "KSB#KESAMBEN"));
        c.addItem(new ComboItem("TALUN", "TAL#TALUN"));
        c.addItem(new ComboItem("WLINGI", "WG#WLINGI"));
        c.addItem(new ComboItem("CEPU", "CU#CEPU"));
        c.addItem(new ComboItem("DOPLANG", "DPL#DOPLANG"));
        c.addItem(new ComboItem("RANDUBLATUNG", "RBG#RANDUBLATUNG"));
        c.addItem(new ComboItem("BATU TULIS", "BTT#BATU TULIS"));
        c.addItem(new ComboItem("BOGOR", "BOO#BOGOR"));
        c.addItem(new ComboItem("CIGOMBONG", "CGB#CIGOMBONG"));
        c.addItem(new ComboItem("MASENG", "MSG#MASENG"));
        c.addItem(new ComboItem("PARUNGPANJANG", "PRP#PARUNGPANJANG"));
        c.addItem(new ComboItem("BOJONEGORO", "BJ#BOJONEGORO"));
        c.addItem(new ComboItem("KALITIDU", "KIT#KALITIDU"));
        c.addItem(new ComboItem("SUMBERREJO", "SRJ#SUMBERREJO"));
        c.addItem(new ComboItem("TELAWA", "TW#TELAWA"));
        c.addItem(new ComboItem("BREBES", "BB#BREBES"));
        c.addItem(new ComboItem("BULAKAMBA", "BKA#BULAKAMBA"));
        c.addItem(new ComboItem("BUMIAYU", "BMA#BUMIAYU"));
        c.addItem(new ComboItem("KETANGGUNGAN", "KGG#KETANGGUNGAN"));
        c.addItem(new ComboItem("KETANGGUNGAN BARAT", "KGB#KETANGGUNGAN BARAT"));
        c.addItem(new ComboItem("KRETEK", "KRT#KRETEK"));
        c.addItem(new ComboItem("LARANGAN", "LRA#LARANGAN"));
        c.addItem(new ComboItem("LARANGAN", "LR#LARANGAN"));
        c.addItem(new ComboItem("LINGGAPURA", "LG#LINGGAPURA"));
        c.addItem(new ComboItem("PATUGURAN", "PAT#PATUGURAN"));
        c.addItem(new ComboItem("SONGGOM", "SGG#SONGGOM"));
        c.addItem(new ComboItem("TANJUNG", "TGN#TANJUNG"));
        c.addItem(new ComboItem("BANJARSARI", "BJI#BANJARSARI"));
        c.addItem(new ComboItem("CIAMIS", "CI#CIAMIS"));
        c.addItem(new ComboItem("CIANJUR", "CJ#CIANJUR"));
        c.addItem(new ComboItem("CIBEBER", "CBB#CIBEBER"));
        c.addItem(new ComboItem("CILAKU", "CLK#CILAKU"));
        c.addItem(new ComboItem("LAMPEGAN", "LP#LAMPEGAN"));
        c.addItem(new ComboItem("CIKAMPEK", "CKP#CIKAMPEK"));
        c.addItem(new ComboItem("CILACAP", "CP#CILACAP"));
        c.addItem(new ComboItem("CIPARI", "CPI#CIPARI"));
        c.addItem(new ComboItem("GANDRUNGMANGUN", "GDM#GANDRUNGMANGUN"));
        c.addItem(new ComboItem("GUMILIR", "GM#GUMILIR"));
        c.addItem(new ComboItem("JERUKLEGI", "JRL#JERUKLEGI"));
        c.addItem(new ComboItem("KAWUNGANTEN", "KWG#KAWUNGANTEN"));
        c.addItem(new ComboItem("KROYA", "KYA#KROYA"));
        c.addItem(new ComboItem("LEBENG", "LBG#LEBENG"));
        c.addItem(new ComboItem("MAOS", "MA#MAOS"));
        c.addItem(new ComboItem("MELUWUNG", "MLW#MELUWUNG"));
        c.addItem(new ComboItem("SIDAREJA", "SDR#SIDAREJA"));
        c.addItem(new ComboItem("SIKAMPUH", "SKP#SIKAMPUH"));
        c.addItem(new ComboItem("CILEGON", "CLG#CILEGON"));
        c.addItem(new ComboItem("MERAK", "MER#MERAK"));
        c.addItem(new ComboItem("ARJAWINANGUN", "AWN#ARJAWINANGUN"));
        c.addItem(new ComboItem("BABAKAN", "BBK#BABAKAN"));
        c.addItem(new ComboItem("CILEDUG", "CLD#CILEDUG"));
        c.addItem(new ComboItem("CIREBON", "CN#CIREBON"));
        c.addItem(new ComboItem("CIREBONPRUJAKAN", "CNP#CIREBONPRUJAKAN"));
        c.addItem(new ComboItem("KARANGSUWUNG", "KRW#KARANGSUWUNG"));
        c.addItem(new ComboItem("LOSARI", "LOS#LOSARI"));
        c.addItem(new ComboItem("LUWUNG", "LWG#LUWUNG"));
        c.addItem(new ComboItem("SINDANGLAUT", "SDU#SINDANGLAUT"));
        c.addItem(new ComboItem("WARUDUWUR", "WDW#WARUDUWUR"));
        c.addItem(new ComboItem("LUBUKPAKAM", "LBP#LUBUKPAKAM"));
        c.addItem(new ComboItem("BRUMBUNG", "BBG#BRUMBUNG"));
        c.addItem(new ComboItem("DENPASAR", "DEN#DENPASAR"));
        c.addItem(new ComboItem("CIBATU", "CB#CIBATU"));
        c.addItem(new ComboItem("CIPEUNDEUY", "CPD#CIPEUNDEUY"));
        c.addItem(new ComboItem("LEBAKJERO", "LBJ#LEBAKJERO"));
        c.addItem(new ComboItem("LELES", "LL#LELES"));
        c.addItem(new ComboItem("NAGREG", "NG#NAGREG"));
        c.addItem(new ComboItem("WARUNG BANDREK", "WB#WARUNG BANDREK"));
        c.addItem(new ComboItem("GOMBONG", "GB#GOMBONG"));
        c.addItem(new ComboItem("IJO", "IJ#IJO"));
        c.addItem(new ComboItem("GUNDIH", "GD#GUNDIH"));
        c.addItem(new ComboItem("KARANGJATI", "KGT#KARANGJATI"));
        c.addItem(new ComboItem("KEDUNGJATI", "KEJ#KEDUNGJATI"));
        c.addItem(new ComboItem("NGROMBO", "NBO#NGROMBO"));
        c.addItem(new ComboItem("CILEGEH", "CLH#CILEGEH"));
        c.addItem(new ComboItem("HAURGEULIS", "HGL#HAURGEULIS"));
        c.addItem(new ComboItem("JATIBARANG", "JTB#JATIBARANG"));
        c.addItem(new ComboItem("KADOKANGANGABUS", "KAB#KADOKANGANGABUS"));
        c.addItem(new ComboItem("KERTASEMAYA", "KTM#KERTASEMAYA"));
        c.addItem(new ComboItem("TERISI", "TIS#TERISI"));
        c.addItem(new ComboItem("GAMBIR", "GMR#GAMBIR"));
        c.addItem(new ComboItem("JAKARTA KOTA", "JAKK#JAKARTA KOTA"));
        c.addItem(new ComboItem("JATINEGARA", "JNG#JATINEGARA"));
        c.addItem(new ComboItem("MANGGARAI", "MRI#MANGGARAI"));
        c.addItem(new ComboItem("PASAR SENEN", "PSE#PASAR SENEN"));
        c.addItem(new ComboItem("TANAH ABANG", "THB#TANAH ABANG"));
        c.addItem(new ComboItem("TANJUNG PRIUK", "TPK#TANJUNG PRIUK"));
        c.addItem(new ComboItem("BANGODUWA", "BDW#BANGODUWA"));
        c.addItem(new ComboItem("JATIROTO", "JTR#JATIROTO"));
        c.addItem(new ComboItem("JEMBER", "JR#JEMBER"));
        c.addItem(new ComboItem("KALISAT", "KLT#KALISAT"));
        c.addItem(new ComboItem("RAMBIPUJI", "RBP#RAMBIPUJI"));
        c.addItem(new ComboItem("TANGGUL", "TGL#TANGGUL"));
        c.addItem(new ComboItem("JOMBANG", "JG#JOMBANG"));
        c.addItem(new ComboItem("SEMBUNG", "SMB#SEMBUNG"));
        c.addItem(new ComboItem("KARANGANYAR", "KA#KARANGANYAR"));
        c.addItem(new ComboItem("KEBUMEN", "KM#KEBUMEN"));
        c.addItem(new ComboItem("KUTOWINANGUN", "KWN#KUTOWINANGUN"));
        c.addItem(new ComboItem("PREMBUN", "PRB#PREMBUN"));
        c.addItem(new ComboItem("SRUWENG", "SRW#SRUWENG"));
        c.addItem(new ComboItem("WONOSARI", "WNS#WONOSARI"));
        c.addItem(new ComboItem("KEDIRI", "KD#KEDIRI"));
        c.addItem(new ComboItem("PAPAR", "PPR#PAPAR"));
        c.addItem(new ComboItem("KALIBODRI", "KBD#KALIBODRI"));
        c.addItem(new ComboItem("KALIWUNGU", "KLN#KALIWUNGU"));
        c.addItem(new ComboItem("WELERI", "WLR#WELERI"));
        c.addItem(new ComboItem("KISARAN", "KIS#KISARAN"));
        c.addItem(new ComboItem("KLATEN", "KT#KLATEN"));
        c.addItem(new ComboItem("SROWOT", "SWT#SROWOT"));
        c.addItem(new ComboItem("MARTAPURA", "MP#MARTAPURA"));
        c.addItem(new ComboItem("KUTOARJO", "KTA#KUTOARJO"));
        c.addItem(new ComboItem("BUNGAMAS", "BGM#BUNGAMAS"));
        c.addItem(new ComboItem("LAHAT", "LT#LAHAT"));
        c.addItem(new ComboItem("SAUNGNAGA", "SNA#SAUNGNAGA"));
        c.addItem(new ComboItem("TEBINGTINGGI", "TI#TEBINGTINGGI"));
        c.addItem(new ComboItem("BABAT", "BBT#BABAT"));
        c.addItem(new ComboItem("LAMONGAN", "LMG#LAMONGAN"));
        c.addItem(new ComboItem("BEKRI", "BKI#BEKRI"));
        c.addItem(new ComboItem("BLAMBANGANUMPU", "BBU#BLAMBANGANUMPU"));
        c.addItem(new ComboItem("GIHAM", "GHM#GIHAM"));
        c.addItem(new ComboItem("KOTABUMI", "KB#KOTABUMI"));
        c.addItem(new ComboItem("TANJUNGKARANG", "TNK#TANJUNGKARANG"));
        c.addItem(new ComboItem("TULUNGBUYUT", "TLY#TULUNGBUYUT"));
        c.addItem(new ComboItem("RANGKAS BITUNG", "RK#RANGKAS BITUNG"));
        c.addItem(new ComboItem("KOTAPADANG", "KOP#KOTAPADANG"));
        c.addItem(new ComboItem("LUBUK LINGGAU", "LLG#LUBUK LINGGAU"));
        c.addItem(new ComboItem("MUARASALING", "MSL#MUARASALING"));
        c.addItem(new ComboItem("KLAKAH", "KK#KLAKAH"));
        c.addItem(new ComboItem("CARUBAN", "CRB#CARUBAN"));
        c.addItem(new ComboItem("MADIUN", "MN#MADIUN"));
        c.addItem(new ComboItem("PARON", "PA#PARON"));
        c.addItem(new ComboItem("SARADAN", "SRD#SARADAN"));
        c.addItem(new ComboItem("BARAT", "BAT#BARAT"));
        c.addItem(new ComboItem("BLIMBING", "BMG#BLIMBING"));
        c.addItem(new ComboItem("KEPANJEN", "KPN#KEPANJEN"));
        c.addItem(new ComboItem("LAWANG", "LW#LAWANG"));
        c.addItem(new ComboItem("MALANG", "ML#MALANG"));
        c.addItem(new ComboItem("MALANG KOTA LAMA", "MLK#MALANG KOTA LAMA"));
        c.addItem(new ComboItem("SUMBERPUCUNG", "SBP#SUMBERPUCUNG"));
        c.addItem(new ComboItem("AEKLOBA", "AKB#AEKLOBA"));
        c.addItem(new ComboItem("BAJALINGGEI", "BJL#BAJALINGGEI"));
        c.addItem(new ComboItem("BANDARKALIPAH", "BAP#BANDARKALIPAH"));
        c.addItem(new ComboItem("BANDARTINGGI", "BDT#BANDARTINGGI"));
        c.addItem(new ComboItem("BATANGKUIS", "BTK#BATANGKUIS"));
        c.addItem(new ComboItem("DOLOKMERANGIR", "DMR#DOLOKMERANGIR"));
        c.addItem(new ComboItem("HENGELO", "HL#HENGELO"));
        c.addItem(new ComboItem("LIMAPULUH", "LMP#LIMAPULUH"));
        c.addItem(new ComboItem("MEDAN", "MDN#MEDAN"));
        c.addItem(new ComboItem("MEMBANGMUDA", "MBM#MEMBANGMUDA"));
        c.addItem(new ComboItem("PADANGHALABAN", "PHA#PADANGHALABAN"));
        c.addItem(new ComboItem("PAMINGKE", "PME#PAMINGKE"));
        c.addItem(new ComboItem("PERBAUNGAN", "PBA#PERBAUNGAN"));
        c.addItem(new ComboItem("PERLANAAN", "PRA#PERLANAAN"));
        c.addItem(new ComboItem("PULURAJA", "PUR#PULURAJA"));
        c.addItem(new ComboItem("SEI BEJANGKAR", "SBJ#SEI BEJANGKAR"));
        c.addItem(new ComboItem("TEBING TINGGI", "TBI#TEBING TINGGI"));
        c.addItem(new ComboItem("MOJOKERTO", "MR#MOJOKERTO"));
        c.addItem(new ComboItem("MUARA ENIM", "ME#MUARA ENIM"));
        c.addItem(new ComboItem("UJANMAS", "UJM#UJANMAS"));
        c.addItem(new ComboItem("BAGOR", "BGR#BAGOR"));
        c.addItem(new ComboItem("BARON", "BRN#BARON"));
        c.addItem(new ComboItem("KERTOSONO", "KTS#KERTOSONO"));
        c.addItem(new ComboItem("NGANJUK", "NJ#NGANJUK"));
        c.addItem(new ComboItem("WILANGAN", "WIL#WILANGAN"));
        c.addItem(new ComboItem("GENENG", "GG#GENENG"));
        c.addItem(new ComboItem("KEDUNGGALAR", "KG#KEDUNGGALAR"));
        c.addItem(new ComboItem("WALIKUKUN", "WK#WALIKUKUN"));
        c.addItem(new ComboItem("KERTAPATI", "KPT#KERTAPATI"));
        c.addItem(new ComboItem("BANGIL", "BG#BANGIL"));
        c.addItem(new ComboItem("GRATI", "GI#GRATI"));
        c.addItem(new ComboItem("PASURUAN", "PS#PASURUAN"));
        c.addItem(new ComboItem("BOJONG", "BJG#BOJONG"));
        c.addItem(new ComboItem("KRENGSENG", "KNS#KRENGSENG"));
        c.addItem(new ComboItem("PEKALONGAN", "PK#PEKALONGAN"));
        c.addItem(new ComboItem("PLABUAN", "PLB#PLABUAN"));
        c.addItem(new ComboItem("SRAGI", "SRI#SRAGI"));
        c.addItem(new ComboItem("COMAL", "CO#COMAL"));
        c.addItem(new ComboItem("PEMALANG", "PML#PEMALANG"));
        c.addItem(new ComboItem("PETARUKAN", "PTA#PETARUKAN"));
        c.addItem(new ComboItem("SIANTAR", "SIR#SIANTAR"));
        c.addItem(new ComboItem("BABADAN", "BBD#BABADAN"));
        c.addItem(new ComboItem("BLIMBINGPENDOPO", "BIB#BLIMBINGPENDOPO"));
        c.addItem(new ComboItem("GUNUNGMEGANG", "GNM#GUNUNGMEGANG"));
        c.addItem(new ComboItem("PRABUMULIH", "PBM#PRABUMULIH"));
        c.addItem(new ComboItem("PROBOLINGGO", "PB#PROBOLINGGO"));
        c.addItem(new ComboItem("PLERED", "PLD#PLERED"));
        c.addItem(new ComboItem("PURWAKARTA", "PWK#PURWAKARTA"));
        c.addItem(new ComboItem("PURWOKERTO", "PWT#PURWOKERTO"));
        c.addItem(new ComboItem("JENAR", "JN#JENAR"));
        c.addItem(new ComboItem("MERBAU", "MBU#MERBAU"));
        c.addItem(new ComboItem("RANTAU PRAPAT", "RAP#RANTAU PRAPAT"));
        c.addItem(new ComboItem("SEMARANGPONCOL", "SMC#SEMARANGPONCOL"));
        c.addItem(new ComboItem("SEMARANGTAWANG", "SMT#SEMARANGTAWANG"));
        c.addItem(new ComboItem("SERANG", "SG#SERANG"));
        c.addItem(new ComboItem("RAMPAH", "RPH#RAMPAH"));
        c.addItem(new ComboItem("GEDANGAN", "GDG#GEDANGAN"));
        c.addItem(new ComboItem("KRIAN", "KRN#KRIAN"));
        c.addItem(new ComboItem("SEPANJANG", "SPJ#SEPANJANG"));
        c.addItem(new ComboItem("SIDOARJO", "SDA#SIDOARJO"));
        c.addItem(new ComboItem("WARU", "WR#WARU"));
        c.addItem(new ComboItem("PURWOSARI", "PWS#PURWOSARI"));
        c.addItem(new ComboItem("SOLOBALAPAN", "SLO#SOLOBALAPAN"));
        c.addItem(new ComboItem("SOLOJEBRES", "SK#SOLOJEBRES"));
        c.addItem(new ComboItem("KEBONROMO", "KRO#KEBONROMO"));
        c.addItem(new ComboItem("KEDUNGBANTENG", "KDB#KEDUNGBANTENG"));
        c.addItem(new ComboItem("MASARAN", "MSR#MASARAN"));
        c.addItem(new ComboItem("SRAGEN", "SR#SRAGEN"));
        c.addItem(new ComboItem("CIPUNEGARA", "CRA#CIPUNEGARA"));
        c.addItem(new ComboItem("PEGADENBARU", "PGB#PEGADENBARU"));
        c.addItem(new ComboItem("TANJUNGRASA", "TJS#TANJUNGRASA"));
        c.addItem(new ComboItem("CIBADAK", "CBD#CIBADAK"));
        c.addItem(new ComboItem("CICURUG", "CCR#CICURUG"));
        c.addItem(new ComboItem("CIREUNGAS", "CRG#CIREUNGAS"));
        c.addItem(new ComboItem("CISAAT", "CSA#CISAAT"));
        c.addItem(new ComboItem("GANDASOLI", "GDS#GANDASOLI"));
        c.addItem(new ComboItem("KARANG TENGAH", "KE#KARANG TENGAH"));
        c.addItem(new ComboItem("PARUNGKUDA", "PRK#PARUNGKUDA"));
        c.addItem(new ComboItem("SUKABUMI", "SI#SUKABUMI"));
        c.addItem(new ComboItem("SURABAYA GUBENG", "SGU#SURABAYA GUBENG"));
        c.addItem(new ComboItem("SURABAYA PASAR TURI", "SBI#SURABAYA PASAR TURI"));
        c.addItem(new ComboItem("WONOKROMO", "WO#WONOKROMO"));
        c.addItem(new ComboItem("TANGERANG", "TNG#TANGERANG"));
        c.addItem(new ComboItem("TANJUNGBALAI", "TNB#TANJUNGBALAI"));
        c.addItem(new ComboItem("AWIPARI", "AW#AWIPARI"));
        c.addItem(new ComboItem("CIAWI", "CAW#CIAWI"));
        c.addItem(new ComboItem("MANONJAYA", "MNJ#MANONJAYA"));
        c.addItem(new ComboItem("RAJAPOLAH", "RJP#RAJAPOLAH"));
        c.addItem(new ComboItem("TASIKMALAYA", "TSM#TASIKMALAYA"));
        c.addItem(new ComboItem("PRUPUK", "PPK#PRUPUK"));
        c.addItem(new ComboItem("SLAWI", "SLW#SLAWI"));
        c.addItem(new ComboItem("TEGAL", "TG#TEGAL"));
        c.addItem(new ComboItem("NGUNUT", "NT#NGUNUT"));
        c.addItem(new ComboItem("TULUNGAGUNG", "TA#TULUNGAGUNG"));
        c.addItem(new ComboItem("BRAMBANAN", "BBN#BRAMBANAN"));
        c.addItem(new ComboItem("LEMPUYANGAN", "LPN#LEMPUYANGAN"));
        c.addItem(new ComboItem("SENTOLO", "STL#SENTOLO"));
        c.addItem(new ComboItem("WATES", "WT#WATES"));
        c.addItem(new ComboItem("YOGYAKARTA", "YK#YOGYAKARTA"));
    }
    private void initTanggal(JComboBox c){
        Calendar cal = Calendar.getInstance();
        c.addItem(sdf.format(cal.getTime()));        
        for(int i=0;i<90;i++){
            cal.add(Calendar.DAY_OF_MONTH, 1);
            c.addItem(sdf.format(cal.getTime()));
          
        }
    }
    private void initKereta(JComboBox c){
        c.addItem(new ComboItem("BOGOWONTO","BOGOWONTO"));
        c.addItem(new ComboItem("KRAKATAU","KRAKATAU"));
        c.addItem(new ComboItem("PROGO","PROGO"));
        c.addItem(new ComboItem("BENGAWAN","BENGAWAN"));
        c.addItem(new ComboItem("JAKA TINGKIR","JAKA TINGKIR"));
        c.addItem(new ComboItem("GAYA BARU MALAM","GAYA BARU MALAM"));
        c.addItem(new ComboItem("GAJAHWONG","GAJAHWONG"));
        c.addItem(new ComboItem("SENJA UTAMA SOLO","SENJA UTAMA SOLO"));
        c.addItem(new ComboItem("ARGO DWI PANGGA","ARGO DWI PANGGA"));
        c.addItem(new ComboItem("TAKSAKA PAGI","TAKSAKA PAGI"));
        c.addItem(new ComboItem("BIMA","BIMA"));
        c.addItem(new ComboItem("GAJAYANA","GAJAYANA"));
        c.addItem(new ComboItem("ARGO LAWU","ARGO LAWU"));
        c.addItem(new ComboItem("TAKSAKA MALAM","TAKSAKA MALAM"));
        c.addItem(new ComboItem("BRANTAS","BRANTAS"));
        c.addItem(new ComboItem("MATARMAJA","MATARMAJA"));
        c.addItem(new ComboItem("MAJAPAHIT","MAJAPAHIT"));
        c.addItem(new ComboItem("TAWANG JAYA","TAWANG JAYA"));
        c.addItem(new ComboItem("JAYABAYA","JAYABAYA"));
        c.addItem(new ComboItem("LODAYA PAGI","LODAYA PAGI"));
        c.addItem(new ComboItem("ARGO WILIS","ARGO WILIS"));
        c.addItem(new ComboItem("MALABAR ","MALABAR "));
        c.addItem(new ComboItem("MUTIARA SELATAN","MUTIARA SELATAN"));
        c.addItem(new ComboItem("LODAYA MALAM ","LODAYA MALAM "));
        c.addItem(new ComboItem("TURANGGA","TURANGGA"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupConnection = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelSearch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboStBerangkat = new javax.swing.JComboBox();
        comboStTujuan = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboTanggal = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboKereta = new javax.swing.JComboBox();
        txtNamaPenumpang = new javax.swing.JTextField();
        txtNoKTP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboLink = new javax.swing.JComboBox();
        jPanelProxySetting = new javax.swing.JPanel();
        radioNoProxy = new javax.swing.JRadioButton();
        radioUseProxy = new javax.swing.JRadioButton();
        pnlProxySetting = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hostProxy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        portProxy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordProxy = new javax.swing.JPasswordField();
        usernameProxy = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comboStBerangkatBiasa = new javax.swing.JComboBox();
        comboStTujuanBiasa = new javax.swing.JComboBox();
        comboTanggalBiasa = new javax.swing.JComboBox();
        btnSearchBiasa = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cari Tiket by member of PJKA");
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        jLabel1.setText("St. Keberangkatan");

        jLabel2.setText("St. Tujuan");

        comboStBerangkat.setActionCommand("");

        jLabel3.setText("Tgl Berangkat");

        comboTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTanggalActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setText("Kereta");

        jLabel9.setText("Nama Penumpang");

        jLabel10.setText("No KTP");

        jLabel11.setText("No Telp");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Sebelum menekan tombol SEARCH Mohon lengkapi semua data (jangan ada yang kosong) agar tidak error :D");

        jLabel13.setText("Email");

        jLabel14.setText("Alamat");

        jLabel18.setText("Link");

        comboLink.setActionCommand("");

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSearchLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboLink, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelSearchLayout.createSequentialGroup()
                                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboStBerangkat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboStTujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNoTelp)
                            .addComponent(comboKereta, 0, 257, Short.MAX_VALUE)
                            .addComponent(txtNamaPenumpang)
                            .addComponent(txtNoKTP))))
                .addContainerGap())
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(comboLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNamaPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNoKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboStBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboStTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pencarian & Booking otomatis", jPanelSearch);

        buttonGroupConnection.add(radioNoProxy);
        radioNoProxy.setSelected(true);
        radioNoProxy.setText("No Proxy (Akses langsung)");
        radioNoProxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoProxyActionPerformed(evt);
            }
        });

        buttonGroupConnection.add(radioUseProxy);
        radioUseProxy.setText("Use Proxy (Akses menggunakan proxy)");
        radioUseProxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUseProxyActionPerformed(evt);
            }
        });

        jLabel4.setText("Host");

        jLabel5.setText("Port");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        javax.swing.GroupLayout pnlProxySettingLayout = new javax.swing.GroupLayout(pnlProxySetting);
        pnlProxySetting.setLayout(pnlProxySettingLayout);
        pnlProxySettingLayout.setHorizontalGroup(
            pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProxySettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProxySettingLayout.createSequentialGroup()
                        .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addComponent(hostProxy)))
        );
        pnlProxySettingLayout.setVerticalGroup(
            pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProxySettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hostProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(portProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(usernameProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordProxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProxySettingLayout = new javax.swing.GroupLayout(jPanelProxySetting);
        jPanelProxySetting.setLayout(jPanelProxySettingLayout);
        jPanelProxySettingLayout.setHorizontalGroup(
            jPanelProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProxySettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProxySetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNoProxy)
                    .addComponent(radioUseProxy))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanelProxySettingLayout.setVerticalGroup(
            jPanelProxySettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProxySettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioNoProxy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioUseProxy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProxySetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Proxy Setting", jPanelProxySetting);

        jLabel15.setText("St Keberangkatan");

        jLabel16.setText("St. Tujuan");

        jLabel17.setText("Tgl Berangkat");

        btnSearchBiasa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchBiasa.setText("SEARCH");
        btnSearchBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBiasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTanggalBiasa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboStTujuanBiasa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboStBerangkatBiasa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSearchBiasa))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboStBerangkatBiasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(comboStTujuanBiasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(comboTanggalBiasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearchBiasa)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pencarian Biasa (Tanpa Booking otomatis)", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTanggalActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
	
        try{
//            MarionetteDriverManager.getInstance().setup();
                System.out.println("Mulai Pencarian...");
//		Runtime.getRuntime().exec("TASKKILL /F /IM Firefox.exe");
//		Runtime.getRuntime().exec("TASKKILL /F /IM iexplore.exe");
//		Runtime.getRuntime().exec("TASKKILL /F /IM iexplore.exe");
		
                WebDriver driver = null;
                String kereta = ((ComboItem) comboKereta.getSelectedItem()).getValue();
                        
                //use proxy
                if(radioUseProxy.isSelected()){
                    String proxyHost = hostProxy.getText()+":"+portProxy.getText();
                    Proxy proxy = new Proxy();
                    proxy.setHttpProxy(proxyHost);
                    proxy.setSslProxy(proxyHost);
                    proxy.setFtpProxy(proxyHost);
                    proxy.setSocksUsername(usernameProxy.getText());
                    proxy.setSocksPassword(new String(passwordProxy.getPassword()));
                    
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setCapability(CapabilityType.PROXY, proxy);
                    
                    driver = new ChromeDriver(cap);
                }else{
                  
//                    driver = new MarionetteDriver();
                      driver = new ChromeDriver();
                }
//		 hmin = Integer.valueOf(args[0]).intValue();
		 ComboItem link = (ComboItem) comboLink.getSelectedItem();
		 driver.get(link.getValue());
		 List<WebElement> list = null;
		 int counter=1;
                 boolean keeploop = true;
		 while(/**list==null || list.size() == 0**/keeploop){
			 
			 try{
			 Select selectTgl = new Select(driver.findElement(By.name("tanggal")));
			 selectTgl.selectByIndex(comboTanggal.getSelectedIndex());
			 
                         ComboItem stFrom = (ComboItem) comboStBerangkat.getSelectedItem();
			 Select selectFrom = new Select(driver.findElement(By.name("origination")));
			 selectFrom.selectByValue(stFrom.getValue());
			 
                         ComboItem stTo = (ComboItem) comboStTujuan.getSelectedItem();
			 Select selectTo = new Select(driver.findElement(By.name("destination")));
			 selectTo.selectByValue(stTo.getValue());
			 
			 Select selectAdult = new Select(driver.findElement(By.name("adult")));
			 selectAdult.selectByValue("1");
			 
			 WebElement element = driver.findElement(By.name("Submit"));
			 element.click();
//			 Thread.sleep(1000);
                         //tunggu sampe page ready, nandainnya kalo element div dengan css class "itReservationContent" muncul
                         WebElement elementForWait = 
                                 (new WebDriverWait(driver, 1)).until(ExpectedConditions.visibilityOfElementLocated(By.className("itReservationContent")));
                         //end wait
                         
			 list = driver.findElements(By.className("itButton"));
                         if(list!=null && list.size()>0){
                                List<WebElement> listForm = driver.findElements(By.tagName("form"));
                                   for(WebElement form:listForm){
                                       List<WebElement> listInput = form.findElements(By.tagName("input"));
                                       for(WebElement input:listInput){
                                           if(input.getAttribute("value").equalsIgnoreCase(kereta)){
                                               WebElement btn = form.findElement(By.className("itButton"));
                                               btn.click();
                                               System.out.println("========================>KLIK BOOKING");
                                               keeploop = false;
                                               throw new KlikException("BerhasilKlik");
                                           }
                                       }
                                   }
                         }
			 System.out.println("==========================> looping ke: "+counter);
			 counter++;
			 }catch(KlikException ke){
                             System.out.println("================> Masuk Klik Exception");
                             keeploop = false;
                             break;
                         }catch(Exception e){
                                 e.printStackTrace();
                            System.out.println("===================> Reconecting..."+link.getValue());
                            driver.get(link.getValue());
			 }
		 }
                 
                 
//		 System.out.println("ada keretaaaaaa: "+list.size());
                 List<WebElement> listInput = driver.findElements(By.tagName("input"));
                 for(WebElement input:listInput){
                     if(input.getAttribute("type").equals("checkbox")){
                         input.click();
                         break;
                     }
                 }
                 WebElement lanjut = driver.findElement(By.cssSelector("input[type='submit'][name='booking']"));
                 lanjut.click();
                 
                 //Ngisi Tikete 
                 //Nunggu disit
                 //tunggu sampe page ready, nandainnya kalo element div dengan css class "txt_first_name_adult_1" muncul
                         WebElement elementForWait = 
                                 (new WebDriverWait(driver, 3)).until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_first_name_adult_1")));
                         //end wait
                    WebElement namaPenumpang = driver.findElement(By.id("txt_first_name_adult_1"));
                    WebElement ktp = driver.findElement(By.id("txt_passport_1"));
                    
                    WebElement contactName = driver.findElement(By.id("txt_contact_first_name"));
                    WebElement contactEmail = driver.findElement(By.id("txt_contact_email"));
                    WebElement contactPhone = driver.findElement(By.id("txt_contact_phone"));
                    WebElement contactAddress = driver.findElement(By.id("txt_contact_home_address"));
                    
                    namaPenumpang.sendKeys(txtNamaPenumpang.getText());
                    ktp.sendKeys(txtNoKTP.getText());
                    contactName.sendKeys(txtNamaPenumpang.getText());
                    contactEmail.sendKeys(txtEmail.getText());
                    contactPhone.sendKeys(txtNoTelp.getText());
                    contactAddress.sendKeys(txtAlamat.getText());
                    
                     playSound();
                  
                     JOptionPane.showMessageDialog(rootPane, "Booking sudah tersedia, Silakan inputkan Captcha!! Dan lanjutkan secara manual", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                     this.setAlwaysOnTop(true);
                  
                 
                  System.out.println("DONE");
		}catch(Exception e){
                    e.printStackTrace();
		}
	
    }//GEN-LAST:event_btnSearchActionPerformed
private void playSound(){
     try{
        for(int i=0;i<30;i++){
            java.awt.Toolkit.getDefaultToolkit().beep();
            System.out.println("Booking sudah tersedia, Silakan inputkan Captcha!!!!!! dan lanjut sampai pembayaran");
            Thread.sleep(200);
        }
        java.awt.Toolkit.getDefaultToolkit().beep();
        }catch(Exception e){
            e.printStackTrace();
        }
}

    private void radioUseProxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUseProxyActionPerformed
        pnlProxySetting.setVisible(true);
        
    }//GEN-LAST:event_radioUseProxyActionPerformed

    private void radioNoProxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoProxyActionPerformed
        pnlProxySetting.setVisible(false);
    }//GEN-LAST:event_radioNoProxyActionPerformed

    private void btnSearchBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBiasaActionPerformed
        
		try{
		Runtime.getRuntime().exec("TASKKILL /F /IM Firefox.exe");
		Runtime.getRuntime().exec("TASKKILL /F /IM iexplore.exe");
		
	
		 
                WebDriver driver = null;
                        
                //use proxy
                if(radioUseProxy.isSelected()){
                    String proxyHost = hostProxy.getText()+":"+portProxy.getText();
                    Proxy proxy = new Proxy();
                    proxy.setHttpProxy(proxyHost);
                    proxy.setSslProxy(proxyHost);
                    proxy.setFtpProxy(proxyHost);
                    proxy.setSocksUsername(usernameProxy.getText());
                    proxy.setSocksPassword(new String(passwordProxy.getPassword()));
                    
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setCapability(CapabilityType.PROXY, proxy);
                    
                    driver = new ChromeDriver(cap);
                }else{
                    driver = new ChromeDriver();
                }
		 
                 ComboItem link = (ComboItem) comboLink.getSelectedItem();
		 driver.get(link.getValue());
		 List<WebElement> list = null;
		 int counter=1;
		 
		 while(list==null || list.size() == 0){
			 
			 try{
			 Select selectTgl = new Select(driver.findElement(By.name("tanggal")));
			 selectTgl.selectByIndex(comboTanggalBiasa.getSelectedIndex());
			 
                         ComboItem ck = (ComboItem) comboStBerangkatBiasa.getSelectedItem();
			 Select selectFrom = new Select(driver.findElement(By.name("origination")));
			 selectFrom.selectByValue(ck.getValue());
			 
                         ComboItem ct = (ComboItem) comboStTujuanBiasa.getSelectedItem();
			 Select selectTo = new Select(driver.findElement(By.name("destination")));
			 selectTo.selectByValue(ct.getValue());
			 
			 Select selectAdult = new Select(driver.findElement(By.name("adult")));
			 selectAdult.selectByValue("1");
			 
			 WebElement element = driver.findElement(By.name("Submit"));
			 element.click();
                         
                         //tunggu sampe page ready, nandainnya kalo element div dengan css class "itReservationContent" muncul
                         WebElement elementForWait = 
                                 (new WebDriverWait(driver, 1)).until(ExpectedConditions.visibilityOfElementLocated(By.className("itReservationContent")));
                         //end wait
                         
			 list = driver.findElements(By.className("itButton"));
			 System.out.println("==========================> looping ke: "+counter);
			 counter++;
			 }catch(Exception e){
				 System.out.println("===================> Reconecting..."+link.getValue());
				 driver.get(link.getValue());
			 }
		 }
		 System.out.println("ada keretaaaaaa: "+list.size());
		 System.out.println("DONE");
		}catch(Exception e){
			e.printStackTrace();
		}
	
    }//GEN-LAST:event_btnSearchBiasaActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
		Runtime.getRuntime().exec("TASKKILL /F /IM chromedriver.exe");
        }catch(Exception e){}    
                
                
            ChromeDriverManager.getInstance().setup();
                
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.JToggleButton btnSearchBiasa;
    private javax.swing.ButtonGroup buttonGroupConnection;
    private javax.swing.JComboBox comboKereta;
    private javax.swing.JComboBox comboLink;
    private javax.swing.JComboBox comboStBerangkat;
    private javax.swing.JComboBox comboStBerangkatBiasa;
    private javax.swing.JComboBox comboStTujuan;
    private javax.swing.JComboBox comboStTujuanBiasa;
    private javax.swing.JComboBox comboTanggal;
    private javax.swing.JComboBox comboTanggalBiasa;
    private javax.swing.JTextField hostProxy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelProxySetting;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField passwordProxy;
    private javax.swing.JPanel pnlProxySetting;
    private javax.swing.JTextField portProxy;
    private javax.swing.JRadioButton radioNoProxy;
    private javax.swing.JRadioButton radioUseProxy;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNamaPenumpang;
    private javax.swing.JTextField txtNoKTP;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField usernameProxy;
    // End of variables declaration//GEN-END:variables
}
