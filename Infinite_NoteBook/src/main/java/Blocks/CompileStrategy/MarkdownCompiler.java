package Blocks.CompileStrategy;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MarkdownCompiler implements Compiler{
    private String htmlContent;
    private String rawInput;

    public MarkdownCompiler(String input) {
        rawInput = input;
    }

    public boolean setRawInput(String input){
        rawInput = input;
        return true;
    }

    public static String convertMarkdownToHTML(String markdown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer htmlRenderer = HtmlRenderer.builder().build();
        return htmlRenderer.render(document);
    }
    
    @Override
    public String Compile(String inputString){
        htmlContent = convertMarkdownToHTML(rawInput);
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
