/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Bars.ButtonBars;

/**
 *
 * @author gzy
 */
public class MainWindowButtonBar extends javax.swing.JPanel {

    /**
     * Creates new form MainWindowButtonBar
     */
    public MainWindowButtonBar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appendBlockButton = new javax.swing.JButton();
        deleteBlockButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        previewButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        doSearchButton = new javax.swing.JButton();
        doReplaceButton = new javax.swing.JButton();
        replaceAllButton = new javax.swing.JButton();

        setOpaque(false);

        appendBlockButton.setText("Append Block (+)");

        deleteBlockButton.setText("Delete Block (-)");

        importButton.setText("Import");

        exportButton.setLabel("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        previewButton.setLabel("Preview");

        doSearchButton.setText("Search");

        doReplaceButton.setText("Replace");
        doReplaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doReplaceButtonActionPerformed(evt);
            }
        });

        replaceAllButton.setText("Replace All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(appendBlockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBlockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importButton)
                .addGap(18, 18, 18)
                .addComponent(exportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doSearchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doReplaceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(replaceAllButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(previewButton)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appendBlockButton)
                    .addComponent(deleteBlockButton)
                    .addComponent(importButton)
                    .addComponent(exportButton)
                    .addComponent(previewButton)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doSearchButton)
                    .addComponent(doReplaceButton)
                    .addComponent(replaceAllButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportButtonActionPerformed

    private void doReplaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doReplaceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doReplaceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appendBlockButton;
    private javax.swing.JButton deleteBlockButton;
    private javax.swing.JButton doReplaceButton;
    private javax.swing.JButton doSearchButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JButton importButton;
    private javax.swing.JButton previewButton;
    private javax.swing.JButton replaceAllButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}