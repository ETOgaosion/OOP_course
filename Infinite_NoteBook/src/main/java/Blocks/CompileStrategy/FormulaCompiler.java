package Blocks.CompileStrategy;

public class FormulaCompiler implements Compiler{
    private String htmlContent;
    private String rawInput;

    public FormulaCompiler(String input) {
        rawInput = input;
    }
    
    public boolean setRawInput(String input){
        rawInput = input;
        return true;
    }
    
    @Override
    public String Compile(String inputString){
        setRawInput(inputString);
        htmlContent = "<script type=\"text/javascript\" src=\"http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML\"></script>\n"
                .concat("<script type=\"text/x-mathjax-config\">\n\t")
                .concat("MathJax.Hub.Config({\n\t\t")
                .concat("tex2jax: {inlineMath: [['$', '$']]},\n\t\t")
                .concat("messageStyle: \"none\"\n\t")
                .concat("});\n")
                .concat("</script>\n")
                .concat("<div>\n")
                .concat(inputString)
                .concat("\n</div>");
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
