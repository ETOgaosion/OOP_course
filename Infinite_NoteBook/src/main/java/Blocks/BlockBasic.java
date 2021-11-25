/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blocks;

import Blocks.CompileStrategy.CompilerFactory;

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
    private Blocks.CompileStrategy.Compiler blankCompiler = compilerFactory.getCompiler(BlockType.BLANK);
    
    private BlankBlock masterBlankBlock;
    private CommonTextBlock masterInputBlock;
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
    
    public boolean setMasterMeidaBlock(MediaBlock master){
        masterMediaBlock = master;
        return true;
    }
    
    public boolean setMasterTableBlock(TableBlock master){
        masterTableBlock = master;
        return true;
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
