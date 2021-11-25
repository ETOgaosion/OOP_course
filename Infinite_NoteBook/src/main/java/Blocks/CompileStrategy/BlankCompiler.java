/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blocks.CompileStrategy;

/**
 *
 * @author gzy
 */
public class BlankCompiler implements Compiler{
    private String htmlContent;
    
    @Override
    public String Compile(String inputString){
        return "";
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
