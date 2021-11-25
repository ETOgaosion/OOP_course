package Bars.ButtonBars;

import Blocks.*;

public class TableButtonBar extends CommonTextButtonBar{

    public TableButtonBar(TableBlock parentBlock) {
        super(null);
        parentTableBlock = parentBlock;
        setTypeText("Table Block");
    }
    
    private TableBlock parentTableBlock;
    
}
