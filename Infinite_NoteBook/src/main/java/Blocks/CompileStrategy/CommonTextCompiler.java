package Blocks.CompileStrategy;

import javax.swing.text.html.HTML;
import Blocks.*;

public class CommonTextCompiler implements Compiler{
    private String htmlContent;
    private String rawInput;
    
    public CommonTextCompiler(String input) {
        rawInput = input;
    }
    
    public boolean setRawInput(String input){
        rawInput = input;
        return true;
    }
    
    @Override
    public String Compile(String inputString){
        setRawInput(inputString);
        htmlContent = "<div style=\"width:1000px;height:auto;padding:20px;display:flex;flex-wrap:wrap;\">\n".concat(rawInput).concat("\n</div>");
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
