/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Blocks;
import Blocks.CompileStrategy.*;
import Blocks.BlockType;
import Bars.ButtonBars.BlankButtonBar;
import Start.*;

/**
 *
 * @author gzy
 */
public class BlankBlock extends javax.swing.JPanel {

    /**
     * Creates new form BlankBlock
     */
    
    
    
    public BlankBlock(MainWindow parentWindow) {
        initComponents();
        initComponentsManually();
        parentMainWindow = parentWindow;
    }
    
    public boolean setID(int ID){
        return blankBlockBasic.setID(ID);
    }
    
    public int getID(){
        return blankBlockBasic.getID();
    }
    
    public boolean changeBlock(BlockType newBlockType){
        return parentMainWindow.changeBlock(blankBlockBasic.getID(), newBlockType);
    }
    
    public BlockType getNewBlockType(int comboxIndex){
        return blankBlockBasic.getNewBlockType(comboxIndex);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void initComponentsManually(){
        blankButtonBar = new Bars.ButtonBars.BlankButtonBar(this,BlockType.BLANK);
        blankButtonBar.setBounds(0, 0, 650, 70);
        add(blankButtonBar);
    }
    
    private BlankButtonBar blankButtonBar;
    private MainWindow parentMainWindow;
    private BlockBasic blankBlockBasic = new BlockBasic();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
