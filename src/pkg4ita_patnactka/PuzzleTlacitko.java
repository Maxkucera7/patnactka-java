package pkg4ita_patnactka;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

public class PuzzleTlacitko extends JButton implements Observer{
   
    //vlastnosti
    Model m;
    final int indexPole;
    
    //konstruktor    
    public PuzzleTlacitko() {
        indexPole = 0;
    }
    
    public PuzzleTlacitko(int indexPole, Model m) {
        this.m = m;
        this.indexPole = indexPole;
        this.setText(String.valueOf(m.getCtverec()[indexPole]));
        this.setSize(50, 50);
        this.setFont(new java.awt.Font("Tahoma", 1, 10));
        m.addObserver(this);
        this.setBackground(Color.ORANGE);
        if(indexPole == 15){
            this.setBackground(Color.white);
            this.setText("");
        }
    }
    
    public int getIndexPole() {
        return indexPole;
    }
    
    @Override
    public void update(Observable o, Object o1) {
        int[] pole = m.getCtverec();
        int hodnotaPole = pole[indexPole];
        this.setText(String.valueOf(hodnotaPole));
        if(hodnotaPole == 0){
            this.setBackground(Color.white);
            this.setText("");
        } else 
            this.setBackground(Color.ORANGE);
    }
    
    
}
