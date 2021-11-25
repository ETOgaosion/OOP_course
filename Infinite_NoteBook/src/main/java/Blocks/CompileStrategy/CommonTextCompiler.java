package Blocks.CompileStrategy;

import javax.swing.text.html.HTML;

public class CommonTextCompiler implements Compiler{
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
