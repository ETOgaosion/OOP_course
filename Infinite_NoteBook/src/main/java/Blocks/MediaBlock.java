/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Blocks;

import Start.*;
import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.*;

/**
 *
 * @author gzy
 */
public class MediaBlock extends javax.swing.JPanel {

    /**
     * Creates new form MediaBlock
     */
    public MediaBlock(MainWindow parentWindow, BlockType blockType) {
        initComponents();
        parentMainWindow = parentWindow;
        mediaBlockBasic.setMasterMeidaBlock(this);
        curBlockType = blockType;
    }
    
    
    public boolean setID(int ID){
        return mediaBlockBasic.setID(ID);
    }
    
    public int getID(){
        return mediaBlockBasic.getID();
    }
    
    public boolean changeBlock(BlockType newBlockType){
        return parentMainWindow.changeBlock(mediaBlockBasic.getID(), newBlockType);
    }
    
    public BlockType getNewBlockType(int comboxIndex){
        return mediaBlockBasic.getNewBlockType(comboxIndex);
    }
    
    private void showFileOpenDialog(Component parent, BlockType filterArg) {
        // 创建一个默认的文件选取器
        JFileChooser fileChooser = new JFileChooser();

        // 设置默认显示的文件夹为当前文件夹
        fileChooser.setCurrentDirectory(new File("."));

        // 设置文件选择的模式（只选文件、只选文件夹、文件和文件均可选）
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        // 设置是否允许多选
        fileChooser.setMultiSelectionEnabled(true);

        // 添加可用的文件过滤器（FileNameExtensionFilter 的第一个参数是描述, 后面是需要过滤的文件扩展名 可变参数）
        if(filterArg == BlockType.IMAGE){
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif"));
        }
        else if(filterArg == BlockType.VIDEO){
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("video(*.mp4)","mp4"));
        }

        // 打开文件选择框（线程将被阻塞, 直到选择框被关闭）
        int result = fileChooser.showOpenDialog(parent);

        if (result == JFileChooser.APPROVE_OPTION) {
            // 如果点击了"确定", 则获取选择的文件路径
            File file = fileChooser.getSelectedFile();

            // 如果允许选择多个文件, 则通过下面方法获取选择的所有文件
            // File[] files = fileChooser.getSelectedFiles();

            mediaList.setModel(dlm);
            dlm.addElement(file.getAbsolutePath());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mediaList = new javax.swing.JList<>();
        choosePathComboBox = new javax.swing.JComboBox<>();
        choosePathButton = new javax.swing.JButton();
        appendListButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 200));

        mediaList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mediaList.setOpaque(false);
        jScrollPane1.setViewportView(mediaList);

        choosePathComboBox.setOpaque(true);

        choosePathButton.setText("Select Path");
        choosePathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePathButtonActionPerformed(evt);
            }
        });

        appendListButton.setText("Append");

        deleteButton.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(appendListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(choosePathButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(choosePathComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choosePathComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(choosePathButton)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(appendListButton)
                        .addGap(27, 27, 27)
                        .addComponent(deleteButton)
                        .addGap(31, 31, 31))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void choosePathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePathButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choosePathButtonActionPerformed

    private MainWindow parentMainWindow;
    private BlockBasic mediaBlockBasic = new BlockBasic();
    DefaultListModel<String> dlm = new DefaultListModel<>();
    BlockType curBlockType = BlockType.IMAGE;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appendListButton;
    private javax.swing.JButton choosePathButton;
    private javax.swing.JComboBox<String> choosePathComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> mediaList;
    // End of variables declaration//GEN-END:variables
}
