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
    public Compiler getCompiler(Blocks.BlockType compilerType){
        if(compilerType == null){
            return null;
        }
        else{
            switch (compilerType){
                case BLANK:
                    return new CommonTextCompiler();
                case COMMONTEXT:
                    return new CommonTextCompiler();
                case CODE:
                    return new CodeCompiler();
                case HYPERTEXT:
                    return new BlankCompiler();
                case FORMULA:
                    return new FormulaCompiler();
                case IMAGE:
                    return new ImageCompiler();
                case MARKDOWN:
                    return new MarkdownCompiler();
                case TABLE:
                    return new TableCompiler();
                case TITLE:
                    return new TitleCompiler();
                case VIDEO:
                    return new VideoCompiler();
                default:
                    return null;
            }
        }
    }
}
