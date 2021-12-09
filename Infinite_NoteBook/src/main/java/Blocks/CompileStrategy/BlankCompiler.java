/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blocks.CompileStrategy;

import Blocks.*;
import Blocks.BlockType;

/**
 *
 * @author gzy
 */
public class BlankCompiler implements Compiler{
    private String htmlContent;
    private String rawInput;

    public BlankCompiler(String input) {
        rawInput = input;
    }
    
    public boolean setRawInput(String input){
        rawInput = input;
        return true;
    }
    
    @Override
    public String Compile(String inputString){
        setRawInput(inputString);
        htmlContent = rawInput;
        return htmlContent;
    }
    @Override
    public String getHtmlContent(){
        return htmlContent;
    }
    @Override
    public boolean setHtmlContent(String newHtmlContent){
        htmlContent = newHtmlContent;
        return true;
    }
}
