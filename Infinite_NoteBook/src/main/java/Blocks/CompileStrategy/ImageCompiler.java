package Blocks.CompileStrategy;

public class ImageCompiler implements Compiler{
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
