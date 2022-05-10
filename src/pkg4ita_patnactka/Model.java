package pkg4ita_patnactka;

import java.util.Observable;
import java.util.Random;

public class Model extends Observable{
    
    //vlastnosti
    private int[] ctverec;
    private final Random rnd = new Random();
    
    //konstruktor
    public Model() {
        ctverec = new int[16];
        for (int i = 1; i < ctverec.length; i++) {
            ctverec[i-1] = i;
        }
    }

    //getter & setter
    public int[] getCtverec() {
        return ctverec;
    }
    public void setCtverec(int[] ctverec) {
        this.ctverec = ctverec;
    }
    
    
    //metody
    public void tiskPole() {
        for (int i = 0; i < ctverec.length; i++) {
            System.out.println("index "+i+" = "+ctverec[i]);
        }
    }
    public void pohyb(int cislo) {
        //System.out.println("test");
        if(zkusNahoru(cislo)) return;
        if(zkusDolu(cislo)) return;
        if(zkusVlevo(cislo)) return;
        if(zkusVpravo(cislo)) return;
    }
    private void prohodit(int prvni, int druhy) {
        int tmp = ctverec[prvni];
        ctverec[prvni] = ctverec[druhy];
        ctverec[druhy] = tmp;
        System.out.println("Baf");
        setChanged();
        notifyObservers();
    }
    private boolean zkusNahoru(int pozice) {
        if(pozice < 4) return false;
        if(ctverec[pozice-4] != 0) return false;
        prohodit(pozice, pozice-4);
        return true;
    }
    private boolean zkusDolu(int pozice) {
        if(pozice > 11) return false;
        if(ctverec[pozice+4] != 0) return false;
        prohodit(pozice, pozice+4);
        return true;
    }
    private boolean zkusVlevo(int pozice) {
        if(pozice%4 == 0) return false;
        if(ctverec[pozice-1] != 0) return false;
        prohodit(pozice, pozice-1);
        return true;
    }
    private boolean zkusVpravo(int pozice) {
        if((pozice+1)%4 == 0) return false;
        if(ctverec[pozice+1] != 0) return false;
        prohodit(pozice, pozice+1);
        return true;
    }

    
    public void zamichej() {
        int[] sousedi = new int[4];
        int   pocetSousedu, tmp, cil, blank = 15;
        for (int i=0; i < ctverec.length; i++){
            if(ctverec[i] == 0){
                blank = i;
                break;
            }
        };
        for (int i=0; i < 200; i++) {
            pocetSousedu = najdiSousedy(blank, sousedi);
            cil = sousedi[rnd.nextInt(pocetSousedu)];
            tmp = ctverec[cil];
            ctverec[cil] = ctverec[blank];
            ctverec[blank]  = tmp;
            blank = cil;
        }
        setChanged();
        notifyObservers();
    }
    private int najdiSousedy( int blank, int[] array ) {
        int pocetSousedu = 0;
        if (blank >  3) array[pocetSousedu++] = blank - 4;
        if (blank < 12) array[pocetSousedu++] = blank + 4;
        if (blank % 4 != 0) array[pocetSousedu++] = blank - 1;
        if (blank % 4 != 3) array[pocetSousedu++] = blank + 1;
        return pocetSousedu;
    }
   
    
}
