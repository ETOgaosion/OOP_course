/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Bars.ButtonBars;

import Blocks.*;
import Blocks.BlockType;
import static Blocks.BlockType.BLANK;
import static Blocks.BlockType.COMMONTEXT;
import static Blocks.BlockType.CODE;
import static Blocks.BlockType.FORMULA;
import static Blocks.BlockType.HYPERTEXT;
import static Blocks.BlockType.IMAGE;
import static Blocks.BlockType.MARKDOWN;
import static Blocks.BlockType.RICHTEXT;
import static Blocks.BlockType.TITLE;
import static Blocks.BlockType.MEDIA;
import static Blocks.BlockType.IMAGE;
import static Blocks.BlockType.VIDEO;
import static Blocks.BlockType.TABLE;

/**
 *
 * @author gzy
 */
public class BlankButtonBar extends javax.swing.JPanel {

    /**
     * Creates new form BlankButtonBar
     */
    public BlankButtonBar(BlankBlock parentBlock,BlockType thisType) {
        initComponents();
        parentBlankBlock = parentBlock;
        type = thisType;
    }
    
    protected void constructSons(){
        initComponents();
    }
    
    public boolean setTypeText(String newType){
        typeLabel.setText(newType);
        return true;
    }
    
    public boolean setParentMediaBlock(MediaBlock parentBlock){
        parentMediaBlock = parentBlock;
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeButton = new javax.swing.JButton();
        blockTypeComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        importButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setOpaque(false);

        changeButton.setText("Change");
        changeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeButtonMouseClicked(evt);
            }
        });
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        blockTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Common Text Block", "Code Block", "HyperText Block", "Markdown Block", "Formula Block", "Rich Text Block", "Infinite Title Block", "Media Block", "Image Block", "Video Block", "Table Block" }));

        deleteButton.setText("Delete");

        typeLabel.setText("Blank Block");

        importButton.setText("Import");

        exportButton.setText("Export");

        jButton12.setText("Compile & Run");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(importButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blockTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(changeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blockTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeButton)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importButton)
                    .addComponent(exportButton)
                    .addComponent(jButton12)
                    .addComponent(deleteButton))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeButtonMouseClicked
        // TODO add your handling code here:
        BlockType targetBlockType;
        switch(type){
            case BLANK->{
                targetBlockType = parentBlankBlock.getNewBlockType(blockTypeComboBox.getSelectedIndex());
                parentBlankBlock.changeBlock(targetBlockType);
            }
            case MEDIA,IMAGE,VIDEO->{
                targetBlockType = parentMediaBlock.getNewBlockType(blockTypeComboBox.getSelectedIndex());
                parentMediaBlock.changeBlock(targetBlockType);
            }
        }
        
    }//GEN-LAST:event_changeButtonMouseClicked

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        // TODO add your handling code here:
        BlockType targetBlockType;
        switch(type){
            case BLANK->{
                targetBlockType = parentBlankBlock.getNewBlockType(blockTypeComboBox.getSelectedIndex());
                parentBlankBlock.changeBlock(targetBlockType);
            }
            case MEDIA,IMAGE,VIDEO->{
                targetBlockType = parentMediaBlock.getNewBlockType(blockTypeComboBox.getSelectedIndex());
                parentMediaBlock.changeBlock(targetBlockType);
            }
        }
    }//GEN-LAST:event_changeButtonActionPerformed


    private BlankBlock parentBlankBlock;
    private MediaBlock parentMediaBlock;
    private BlockType type;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> blockTypeComboBox;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JButton importButton;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
