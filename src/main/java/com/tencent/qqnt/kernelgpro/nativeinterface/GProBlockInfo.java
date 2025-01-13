package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBlockInfo.class */
public final class GProBlockInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String blockId;
    public int blockIndex;
    public String blockName;
    public int blockType;
    public ArrayList<GProRecommendCategory> categories;
    public boolean hasMore;
    public int isWhole;
    public ArrayList<GProRecommendItem> items;
    long serialVersionUID;

    public GProBlockInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockId = "";
        this.blockName = "";
        this.items = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public String getBlockId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.blockId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getBlockIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.blockIndex : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getBlockName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.blockName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getBlockType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.blockType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProRecommendCategory> getCategories() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.categories : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public boolean getHasMore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hasMore : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public int getIsWhole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.isWhole : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public ArrayList<GProRecommendItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProBlockInfo{blockId=" + this.blockId + ",blockType=" + this.blockType + ",blockIndex=" + this.blockIndex + ",blockName=" + this.blockName + ",items=" + this.items + ",hasMore=" + this.hasMore + ",categories=" + this.categories + ",isWhole=" + this.isWhole + ",}";
    }

    public GProBlockInfo(String str, int i, int i2, String str2, ArrayList<GProRecommendItem> arrayList, boolean z, ArrayList<GProRecommendCategory> arrayList2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, Integer.valueOf(i), Integer.valueOf(i2), str2, arrayList, Boolean.valueOf(z), arrayList2, Integer.valueOf(i3));
            return;
        }
        this.serialVersionUID = 1L;
        this.blockId = "";
        this.blockName = "";
        this.items = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.blockId = str;
        this.blockType = i;
        this.blockIndex = i2;
        this.blockName = str2;
        this.items = arrayList;
        this.hasMore = z;
        this.categories = arrayList2;
        this.isWhole = i3;
    }
}
