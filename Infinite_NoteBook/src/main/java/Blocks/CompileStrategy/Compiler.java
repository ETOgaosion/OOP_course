package Blocks.CompileStrategy;

public interface Compiler {
    public String Compile(String inpuString);
    public String getHtmlContent();
    public boolean setHtmlContent(String newHtmlContent);
}
