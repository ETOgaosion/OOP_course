package Blocks.CompileStrategy;

import Blocks.*;
import javax.swing.table.*;

public class TableCompiler implements Compiler{
    private String htmlContent;
    private TableBlock parentTableBlock;
    
    public boolean setTableBlock(TableBlock parBlock){
        parentTableBlock = parBlock;
        return true;
    }
    
    @Override
    public String Compile(String inputString){
        TableModel model = parentTableBlock.getMainTable().getModel();
        htmlContent = "<div>\n\t".concat("<table>\n\t\t");
        for(int r=0;r<model.getRowCount();++r) {
            htmlContent.concat("<tr>\n\t\t\t");
            for(int c=0;c<model.getColumnCount();++c) {
                htmlContent.concat("<td>\n\t\t\t\t");
                htmlContent.concat(model.getValueAt(r,c).toString());
                htmlContent.concat("\n\t\t\t</td>");
            }
            htmlContent.concat("\n\t\t</tr>");
        }
        htmlContent.concat("\n\t</table>\n</div>");
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
