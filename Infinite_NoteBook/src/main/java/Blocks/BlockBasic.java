/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blocks;

import static Blocks.BlockType.BLANK;
import static Blocks.BlockType.CODE;
import static Blocks.BlockType.COMMONTEXT;
import static Blocks.BlockType.FORMULA;
import static Blocks.BlockType.IMAGE;
import static Blocks.BlockType.MARKDOWN;
import static Blocks.BlockType.MEDIA;
import static Blocks.BlockType.RICHTEXT;
import static Blocks.BlockType.TABLE;
import static Blocks.BlockType.TITLE;
import static Blocks.BlockType.VIDEO;
import Blocks.CompileStrategy.CompilerFactory;
import java.lang.constant.ConstantDescs;

/**
 *
 * @author gzy
 */
public class BlockBasic {
    
    private int id = 0;
    public String caption = "";
    private int width = 1000;
    private BlockType type = BlockType.BLANK;
    private String rawInput = "";
    private String htmlContent = "";
    private String audioPath = "";
    private CompilerFactory compilerFactory = new CompilerFactory();
    private Blocks.CompileStrategy.Compiler blankCompiler = compilerFactory.getCompiler(BlockType.BLANK,rawInput);
    
    private BlankBlock masterBlankBlock;
    private CommonTextBlock masterInputBlock;
    private RichTextBlock masterRichTextBlock;
    private MediaBlock masterMediaBlock;
    private TableBlock masterTableBlock;
    
    public boolean setMasterBlankBlock(BlankBlock master){
        masterBlankBlock = master;
        return true;
    }
    
    public boolean setMasterInputBlock(CommonTextBlock master){
        masterInputBlock = master;
        return true;
    }
    
    public boolean setMasterRichTextBlock(RichTextBlock master){
        masterRichTextBlock = master;
        return true;
    }
    
    public boolean setMasterMeidaBlock(MediaBlock master){
        masterMediaBlock = master;
        return true;
    }
    
    public boolean setMasterTableBlock(TableBlock master){
        masterTableBlock = master;
        return true;
    }
    
    
    
    public BlockType getNewBlockType(int comboxIndex){
        switch(comboxIndex){
            case 0->{
                return COMMONTEXT;
            }
            case 1->{
                return CODE;
            }
            case 2->{
                return MARKDOWN;
            }
            case 3->{
                return FORMULA;
            }
            case 4->{
                return RICHTEXT;
            }
            case 5->{
                return TITLE;
            }
            case 6->{
                return MEDIA;
            }
            case 7->{
                return IMAGE;
            }
            case 8->{
                return VIDEO;
            }
            case 9->{
                return TABLE;
            }
            default->{
                return BLANK;
            }
        }
    }
    
    public boolean switchBlockType(BlockType newType){
        type = newType;
        return true;
    }
    
    public BlockType getBlockType(){
        return type;
    }
    
    public String getRawInput(){
        return rawInput;
    }
    
    public boolean Compile(){
        htmlContent = blankCompiler.Compile(rawInput);
        return true;
    }
    
    
    public boolean setID(int ID){
        id = ID;
        return true;
    }
    
    public int getID(){
        return id;
    }
    
    public boolean setCaption(String Caption){
        caption = Caption;
        return true;
    }
    
    public String getCaption(){
        return caption;
    }
    
    public void showButtonBar(){
        
    }
    
    public void hideButtonBar(){
        
    }
    
    public boolean setWidth(int newWidth){
        width = newWidth;
        return true;
    }
    
    public int getWidth(){
        return width;
    }
    
    public String getHtmlContent(){
        return "";
    }
    
    public boolean setAudio(String audioPath){
        return true;
    }
    
    public boolean destroySelf(){
        return true;
    }
}
