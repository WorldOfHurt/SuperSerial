/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superserial;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author Carlton Johnson
 */
public class SelectGraph extends javax.swing.JFrame {
    int GraphType;
    /**
     * Creates new form SelectGraph
     * @param graphType type of graph to display
     */
    public SelectGraph(int graphType) {
        initComponents();
        FileFilter f;
        GraphType=graphType;
        switch(graphType){
            case 0:
                f=new TopFilter();
                break;
            case 1:
                f=new TopFilter();
                break;
            case 2:
                f=new TopFilter();
                break;
            case 3:
                f=new TopFilter();
                break;
            case 4:
                f=new TopFilter();
                break;
            case 5:
                f=new TopFilter();
                break;
            case 6:
            default:
                f=new TopFilter();
        }
        
        jFileChooser1.addChoosableFileFilter(f);
        jFileChooser1.setFileFilter(f);
        jFileChooser1.setMultiSelectionEnabled(false);
        jFileChooser1.setCurrentDirectory(new File("saves" + File.separator));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if(jFileChooser1.getSelectedFile()!=null){
            DisplayGraph G=new DisplayGraph(jFileChooser1.getSelectedFile(), GraphType);
            G.setVisible(true);
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed
    
    public File getSelectedFile(){
        return jFileChooser1.getSelectedFile();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}

