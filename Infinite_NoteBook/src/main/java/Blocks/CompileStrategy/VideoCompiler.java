package Blocks.CompileStrategy;

public class VideoCompiler implements Compiler{
    private String htmlContent;
    private String rawInput;
    private String height;
    private String width;

    public VideoCompiler(String input) {
        rawInput = input;
    }
    
    public boolean setRawInput(String input){
        rawInput = input;
        return true;
    }
    
    public boolean setHeight(String inputHeight){
        height = inputHeight;
        return true;
    }
    
    public boolean setWidth(String inputWidth){
        width = inputWidth;
        return true;
    }
    
    @Override
    public String Compile(String inputString){
        setRawInput(inputString);
        htmlContent = "<div>\n\t<video width=\"".concat(width).concat("\";height=\"").concat(height).concat(";\" controls>\n\t")
                .concat("<source src=\"").concat(inputString).concat("\" type=\"video/mp4\">\n")
                .concat("</div>");
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
