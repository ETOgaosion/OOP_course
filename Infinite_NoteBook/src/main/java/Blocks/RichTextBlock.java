/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Blocks;

import Bars.ButtonBars.RichTextButtonBar;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.*;
import javax.swing.text.StyleConstants;
import javax.swing.text.Utilities;
import javax.swing.text.BadLocationException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Font;
import java.awt.Color;
import Start.*;
import javax.swing.JTextPane;

/**
 *
 * @author gzy
 */
public class RichTextBlock extends javax.swing.JPanel {

    /**
     * Creates new form RichTextBlock
     */
    public RichTextBlock(MainWindow parMainWindow) {
        initComponents();
        parentMainWindow = parMainWindow;
        initComponentsManually();
        mainInputTextPane.setBackground(new Color(255,255,255,0));
    }
    
    
    public boolean setID(int ID){
        return richTextBlockBasic.setID(ID);
    }
    
    public int getID(){
        return richTextBlockBasic.getID();
    }
    
    public boolean changeBlock(BlockType newBlockType){
        return parentMainWindow.changeBlock(richTextBlockBasic.getID(), newBlockType);
    }
    
    public String getSelectedText(){
        return mainInputTextPane.getSelectedText();
    }
    
    public int getCaretPosition(){
        return mainInputTextPane.getCaretPosition();
    }
    
    public boolean replaceSelection(String newString){
        mainInputTextPane.replaceSelection(newString);
        return true;
    }
    
    public StyledDocument getStyledDocument(){
        return mainInputTextPane.getStyledDocument();
    }
    
    private void initComponentsManually(){
        lineNumTextPane.setContentType("text/html");
        richTextButtonBar = new RichTextButtonBar(this);
        richTextButtonBar.setBounds(0, 0, 1200, 62);
        add(richTextButtonBar);
        richTextToolBox = new RichTextToolBox(this);
        richTextToolBox.setBounds(0, 62, 200, 238);
        add(richTextToolBox);
        richTextBlockBasic = new BlockBasic();
        richTextBlockBasic.setMasterRichTextBlock(this);
        editorKit = new StyledEditorKit();
        mainInputTextPane.setEditorKit(editorKit);
        DocumentListener repaintDocumentListener = new RepaintDocumentListener(this);
        mainInputTextPane.getDocument().addDocumentListener(repaintDocumentListener);
        revalidate();
        repaint();
    }
    
    public StyledEditorKit getEditorKit(){
        editorKit = new StyledEditorKit();
        return editorKit;
    }
    
    public StyledEditorKit.AlignmentAction getAlignmentAction(int alignType){
        alignAction = new StyledEditorKit.AlignmentAction("Alignment",alignType);
        return alignAction;
    }
    
    public StyledEditorKit.BoldAction getBoldAction(){
        boldAction = new StyledEditorKit.BoldAction();
        return boldAction;
    }
    
    public StyledEditorKit.CopyAction getCpyAction(){
        cpyAction = new StyledEditorKit.CopyAction();
        return cpyAction;
    }
    
    public StyledEditorKit.CutAction getCutAction(){
        cutAction = new StyledEditorKit.CutAction();
        return cutAction;
    }
    
    public StyledEditorKit.PasteAction getPasteAction(){
        pasteAction = new StyledEditorKit.PasteAction();
        return pasteAction;
    }
    
    public StyledEditorKit.FontFamilyAction getFontFamilyAction(String fontFamily){
        fontFamilyAction = new StyledEditorKit.FontFamilyAction("font",fontFamily);
        return fontFamilyAction;
    }
    
    public StyledEditorKit.FontSizeAction getFontSizeAction(int size){
        fontSizeAction = new StyledEditorKit.FontSizeAction("size",size);
        return fontSizeAction;
    }
    
    public StyledEditorKit.ForegroundAction getForegroundAction(Color color){
        fontColorAction = new StyledEditorKit.ForegroundAction("color",color);
        return fontColorAction;
    }
    
    public StyledEditorKit.ItalicAction getItalicAction(){
        italicAction = new StyledEditorKit.ItalicAction();
        return italicAction;
    }
    
    public StyledEditorKit.UnderlineAction getUnderlineAction(){
        underlineAction = new StyledEditorKit.UnderlineAction();
        return underlineAction;
    }
    
    public BlockBasic getBlockBasic(){
        return richTextBlockBasic;
    }
    
    public int getLineCount(JTextPane textPane){
        int totalCharacters = textPane.getText().length(); 
        int lineCount = (totalCharacters == 0) ? 1 : 0;

        try {
           int offset = totalCharacters; 
           while (offset > 0) {
              offset = Utilities.getRowStart(textPane, offset) - 1;
              lineCount++;
           }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        return lineCount;
    }
    
    public void checkLineNumUpdate(){
        int curLineNum = getLineCount(mainInputTextPane);
        int displayLineNum = getLineCount(lineNumTextPane);
        StringBuilder sb = new StringBuilder();
        if(curLineNum != displayLineNum){
            for(int i = 0; i < curLineNum; i++){
                sb.append(Integer.toString(i).concat("<br>"));
            }
        }
        lineNumTextPane.setText(sb.toString());
    }
    
    public void repaintMainPane(){
        mainInputTextPane.setBackground(new Color(255,255,255,0));
        mainInputTextPane.revalidate();
        mainInputTextPane.repaint();
        lineNumTextPane.setBackground(new Color(255,255,255,0));
        lineNumTextPane.revalidate();
        lineNumTextPane.repaint();
        revalidate();
        repaint();
        parentMainWindow.repaintMainPane();
        checkLineNumUpdate();
    }
    
    public class RepaintDocumentListener implements DocumentListener{
        public RepaintDocumentListener(RichTextBlock par) {
            super();
            parRichTextBlock = par;
        }
        
        public void removeUpdate(DocumentEvent evt){
            parRichTextBlock.repaintMainPane();
        }
        
         public void insertUpdate(DocumentEvent e) {
            parRichTextBlock.repaintMainPane();
        }
        public void changedUpdate(DocumentEvent evt){
            parRichTextBlock.repaintMainPane();
        }
        
        private RichTextBlock parRichTextBlock;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainInputScrollPane = new javax.swing.JScrollPane();
        mainInputTextPane = new javax.swing.JTextPane();
        lineNumScrollPane = new javax.swing.JScrollPane();
        lineNumTextPane = new javax.swing.JTextPane();

        setOpaque(false);
        setSize(new java.awt.Dimension(1200, 300));

        mainInputScrollPane.setOpaque(false);

        mainInputTextPane.setBackground(new Color(255,255,255,0)
        );
        mainInputTextPane.setForeground(new java.awt.Color(255, 255, 255));
        mainInputTextPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mainInputTextPaneKeyTyped(evt);
            }
        });
        mainInputScrollPane.setViewportView(mainInputTextPane);

        lineNumScrollPane.setOpaque(false);

        lineNumTextPane.setBackground(new Color(255,255,255,0)
        );
        lineNumTextPane.setForeground(new java.awt.Color(255, 255, 255));
        lineNumScrollPane.setViewportView(lineNumTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(lineNumScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainInputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lineNumScrollPane)
                    .addComponent(mainInputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mainInputTextPaneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainInputTextPaneKeyTyped
        // TODO add your handling code here:
        mainInputTextPane.setBackground(new Color(255,255,255,0));
        mainInputTextPane.revalidate();
        mainInputScrollPane.repaint();
    }//GEN-LAST:event_mainInputTextPaneKeyTyped

    private RichTextToolBox richTextToolBox;
    private RichTextButtonBar richTextButtonBar;
    private MainWindow parentMainWindow;
    private BlockBasic richTextBlockBasic = new BlockBasic();
    private StyledEditorKit editorKit;
    private StyledEditorKit.AlignmentAction alignAction;
    private StyledEditorKit.BoldAction boldAction;
    private StyledEditorKit.CopyAction cpyAction;
    private StyledEditorKit.CutAction cutAction;
    private StyledEditorKit.PasteAction pasteAction;
    private StyledEditorKit.FontFamilyAction fontFamilyAction;
    private StyledEditorKit.FontSizeAction fontSizeAction;
    private StyledEditorKit.ForegroundAction fontColorAction;
    private StyledEditorKit.ItalicAction italicAction;
    private StyledEditorKit.UnderlineAction underlineAction;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane lineNumScrollPane;
    private javax.swing.JTextPane lineNumTextPane;
    private javax.swing.JScrollPane mainInputScrollPane;
    private javax.swing.JTextPane mainInputTextPane;
    // End of variables declaration//GEN-END:variables
}
