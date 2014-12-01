/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superserial;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 *
 * @author Carlton Johnson
 */
public class SelectGraph extends javax.swing.JFrame {

    /**
     * Creates new form SelectGraph
     */
    public SelectGraph() {
        initComponents();
        BotFilter F=new BotFilter();
        jFileChooser1.addChoosableFileFilter(F);
        jFileChooser1.setFileFilter(F);
        jFileChooser1.setMultiSelectionEnabled(false);
        jFileChooser1.setCurrentDirectory(new File("saves" + File.separator));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.setFileHidingEnabled(false);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if(jFileChooser1.getSelectedFile()!=null){
            DisplayGraph G=new DisplayGraph(jFileChooser1.getSelectedFile());
            G.setVisible(true);
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}


class BotFilter extends FileFilter {
    /**
     * @param f file path to check
     * @return true if the file is of type bot or top
     */
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String s = f.getName();
        int i = s.lastIndexOf('.');
        int t=i;

        if (i > 0 && i < s.length() - 1) {
            if (s.substring(i + 1).toLowerCase().equals("bot")) {
                return true;
            }else if(s.substring(i + 1).toLowerCase().equals("top")){
                return true;
            }
        }

        return false;
    }

    public String getDescription() {
        return "Accepts '.bot' and '.top' files";
    }
}