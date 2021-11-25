package Bars.ButtonBars;

import Blocks.*;

public class MediaButtonBar extends BlankButtonBar {

    public MediaButtonBar(MediaBlock parentBlock) {
        super(null);
        setParentMediaBlock(parentBlock);
        setTypeText("Media Block");
    }
    
}
