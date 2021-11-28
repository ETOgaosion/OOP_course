package Bars.ButtonBars;

import Blocks.*;
import Blocks.BlockType;

public class MediaButtonBar extends BlankButtonBar {

    public MediaButtonBar(MediaBlock parentBlock, BlockType mediaBlockType) {
        super(null,BlockType.MEDIA);
        setParentMediaBlock(parentBlock);
        switch(mediaBlockType){
            case MEDIA->{
                setTypeText("Media Block");
            }
            case VIDEO->{
                setTypeText("Video Block");
            }
            case IMAGE->{
                setTypeText("Image Block");
            }
        }
    }
    
}
