package Blocks;

import Start.*;
import javax.swing.*;
import javax.swing.text.StyledDocument;

public class RichTextBlock extends CommonTextBlock{

    public RichTextBlock(MainWindow parenWindow) {
        super(parenWindow,BlockType.RICHTEXT);
        inputTextPane = getMainTextPane();
    }
    
    
    public String getSelectedText(){
        return inputTextPane.getSelectedText();
    }
    
    public int getCaretPosition(){
        return inputTextPane.getCaretPosition();
    }
    
    public boolean replaceSelection(String newString){
        inputTextPane.replaceSelection(newString);
        return true;
    }
    
    public StyledDocument getStyledDocument(){
        return inputTextPane.getStyledDocument();
    }
    
    private javax.swing.JTextPane inputTextPane;
    
    private int richTextToolBoxIndex;
    private RichTextToolBox curRichTextToolBox;
}
