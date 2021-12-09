package Blocks.CompileStrategy;

public class TitleCompiler implements Compiler{
    private String htmlContent;
    private String rawInput;
    private String titleContent;
    private int titleLevel;

    public TitleCompiler(String input) {
        rawInput = input;
    }
    
    public boolean setRawInput(String input){
        rawInput = input;
        return true;
    }
    
    public boolean setTitleContent(String input){
        titleContent = input;
        return true;
    }
    
    public boolean setTitleLevel(int level){
        titleLevel = level;
        return true;
    }
    
    @Override
    public String Compile(String inputString){
        setRawInput(inputString);
        int level = Integer.valueOf(inputString.split("\\n")[0]);
        setTitleLevel(level);
        int firstIndex = inputString.indexOf("\\n");
        String title = inputString.substring(firstIndex + 1);
        setTitleContent(title);
        htmlContent = "<div>\n\t<p style=\"font-size:".concat(String.valueOf(80/titleLevel).concat("px;")).concat("\">\n")
                .concat(title)
                .concat("\n\t</p>\n<div>");
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
