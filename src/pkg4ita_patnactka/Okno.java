package pkg4ita_patnactka;

import java.awt.Color;

public class Okno extends javax.swing.JFrame {
    Model m;

    public Okno(Model m) {
        this.m = m;
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        puzzleTlacitko1 = new pkg4ita_patnactka.PuzzleTlacitko(0, m);
        jButton1 = new javax.swing.JButton();
        puzzleTlacitko2 = new pkg4ita_patnactka.PuzzleTlacitko(1, m);
        puzzleTlacitko3 = new pkg4ita_patnactka.PuzzleTlacitko(2, m);
        puzzleTlacitko4 = new pkg4ita_patnactka.PuzzleTlacitko(3, m);
        puzzleTlacitko5 = new pkg4ita_patnactka.PuzzleTlacitko(4, m);
        puzzleTlacitko6 = new pkg4ita_patnactka.PuzzleTlacitko(5, m);
        puzzleTlacitko7 = new pkg4ita_patnactka.PuzzleTlacitko(6, m);
        puzzleTlacitko8 = new pkg4ita_patnactka.PuzzleTlacitko(7, m);
        puzzleTlacitko9 = new pkg4ita_patnactka.PuzzleTlacitko(8, m);
        puzzleTlacitko10 = new pkg4ita_patnactka.PuzzleTlacitko(9, m);
        puzzleTlacitko11 = new pkg4ita_patnactka.PuzzleTlacitko(10, m);
        puzzleTlacitko12 = new pkg4ita_patnactka.PuzzleTlacitko(11, m);
        puzzleTlacitko13 = new pkg4ita_patnactka.PuzzleTlacitko(12, m);
        puzzleTlacitko14 = new pkg4ita_patnactka.PuzzleTlacitko(13, m);
        puzzleTlacitko15 = new pkg4ita_patnactka.PuzzleTlacitko(14, m);
        puzzleTlacitko16 = new pkg4ita_patnactka.PuzzleTlacitko(15, m);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patnáctka");
        setLocationByPlatform(true);
        setResizable(false);

        puzzleTlacitko1.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hraj(evt);
            }
        });

        jButton1.setBackground(java.awt.Color.yellow);
        jButton1.setText("Nová hra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        puzzleTlacitko2.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko2ActionPerformed(evt);
            }
        });

        puzzleTlacitko3.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko3ActionPerformed(evt);
            }
        });

        puzzleTlacitko4.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko4ActionPerformed(evt);
            }
        });

        puzzleTlacitko5.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko5ActionPerformed(evt);
            }
        });

        puzzleTlacitko6.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko6ActionPerformed(evt);
            }
        });

        puzzleTlacitko7.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko7ActionPerformed(evt);
            }
        });

        puzzleTlacitko8.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko8ActionPerformed(evt);
            }
        });

        puzzleTlacitko9.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko9ActionPerformed(evt);
            }
        });

        puzzleTlacitko10.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko10ActionPerformed(evt);
            }
        });

        puzzleTlacitko11.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko11ActionPerformed(evt);
            }
        });

        puzzleTlacitko12.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko12ActionPerformed(evt);
            }
        });

        puzzleTlacitko13.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko13ActionPerformed(evt);
            }
        });

        puzzleTlacitko14.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko14ActionPerformed(evt);
            }
        });

        puzzleTlacitko15.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko15ActionPerformed(evt);
            }
        });

        puzzleTlacitko16.setPreferredSize(new java.awt.Dimension(50, 50));
        puzzleTlacitko16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzleTlacitko16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(puzzleTlacitko5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(puzzleTlacitko6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(puzzleTlacitko7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(puzzleTlacitko8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(puzzleTlacitko1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(puzzleTlacitko2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(puzzleTlacitko3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(puzzleTlacitko4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(puzzleTlacitko13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(puzzleTlacitko14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(puzzleTlacitko9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(puzzleTlacitko10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(puzzleTlacitko15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(puzzleTlacitko16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(puzzleTlacitko11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(puzzleTlacitko12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puzzleTlacitko2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puzzleTlacitko6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puzzleTlacitko10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puzzleTlacitko16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzleTlacitko15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        m.zamichej();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hraj(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hraj
        int indexPole = ((PuzzleTlacitko)(evt.getSource())).getIndexPole();
        m.pohyb(indexPole);
    }//GEN-LAST:event_hraj

    private void puzzleTlacitko2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko2ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko2ActionPerformed

    private void puzzleTlacitko3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko3ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko3ActionPerformed

    private void puzzleTlacitko4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko4ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko4ActionPerformed

    private void puzzleTlacitko5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko5ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko5ActionPerformed

    private void puzzleTlacitko6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko6ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko6ActionPerformed

    private void puzzleTlacitko7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko7ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko7ActionPerformed

    private void puzzleTlacitko8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko8ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko8ActionPerformed

    private void puzzleTlacitko9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko9ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko9ActionPerformed

    private void puzzleTlacitko10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko10ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko10ActionPerformed

    private void puzzleTlacitko11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko11ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko11ActionPerformed

    private void puzzleTlacitko12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko12ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko12ActionPerformed

    private void puzzleTlacitko13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko13ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko13ActionPerformed

    private void puzzleTlacitko14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko14ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko14ActionPerformed

    private void puzzleTlacitko15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko15ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko15ActionPerformed

    private void puzzleTlacitko16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzleTlacitko16ActionPerformed
        hraj(evt);
    }//GEN-LAST:event_puzzleTlacitko16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko1;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko10;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko11;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko12;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko13;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko14;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko15;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko16;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko2;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko3;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko4;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko5;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko6;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko7;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko8;
    private pkg4ita_patnactka.PuzzleTlacitko puzzleTlacitko9;
    // End of variables declaration//GEN-END:variables
}
