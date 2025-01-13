package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBlockItem.class */
public final class GProBlockItem implements Serializable {
    static IPatchRedirector $redirector_;
    public String blockId;
    public String blockName;
    public int blockType;
    public ArrayList<GProItemIdInfo> itemList;
    long serialVersionUID;

    public GProBlockItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockId = "";
        this.blockName = "";
        this.itemList = new ArrayList<>();
    }

    public String getBlockId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.blockId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getBlockName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.blockName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getBlockType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.blockType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProItemIdInfo> getItemList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.itemList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public void setBlockId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.blockId = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public void setBlockName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.blockName = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setBlockType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.blockType = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setItemList(ArrayList<GProItemIdInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.itemList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 10, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProBlockItem{blockId=" + this.blockId + ",blockType=" + this.blockType + ",blockName=" + this.blockName + ",itemList=" + this.itemList + ",}";
    }

    public GProBlockItem(String str, int i, String str2, ArrayList<GProItemIdInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, Integer.valueOf(i), str2, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockId = "";
        this.blockName = "";
        this.itemList = new ArrayList<>();
        this.blockId = str;
        this.blockType = i;
        this.blockName = str2;
        this.itemList = arrayList;
    }
}
