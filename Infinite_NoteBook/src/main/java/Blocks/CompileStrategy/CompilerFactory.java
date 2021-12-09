/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blocks.CompileStrategy;

/**
 *
 * @author gzy
 */
public class CompilerFactory {
    public Compiler getCompiler(Blocks.BlockType compilerType, String input){
        if(compilerType == null){
            return null;
        }
        else{
            switch (compilerType){
                case BLANK:
                    return new BlankCompiler(input);
                case COMMONTEXT:
                    return new CommonTextCompiler(input);
                case CODE:
                    return new CodeCompiler(input);
                case HYPERTEXT:
                    return new BlankCompiler(input);
                case FORMULA:
                    return new FormulaCompiler(input);
                case IMAGE:
                    return new ImageCompiler(input);
                case MARKDOWN:
                    return new MarkdownCompiler(input);
                case TABLE:
                    return new TableCompiler();
                case TITLE:
                    return new TitleCompiler(input);
                case VIDEO:
                    return new VideoCompiler(input);
                default:
                    return null;
            }
        }
    }
}
