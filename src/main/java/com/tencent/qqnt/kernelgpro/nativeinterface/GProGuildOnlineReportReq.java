package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildOnlineReportReq.class */
public final class GProGuildOnlineReportReq {
    static IPatchRedirector $redirector_;
    public int activeTab;
    public ArrayList<GProGuildBrowseInfo> browseInfo;
    public ArrayList<GProGuildOnlineReportExtInfo> exts;
    public int fromPageId;
    public boolean isVisiting;
    public int scene;
    public int sourceType;
    public long tinyId;

    public GProGuildOnlineReportReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.browseInfo = new ArrayList<>();
            this.exts = new ArrayList<>();
        }
    }

    public int getActiveTab() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.activeTab : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProGuildBrowseInfo> getBrowseInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.browseInfo : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProGuildOnlineReportExtInfo> getExts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.exts : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public int getFromPageId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.fromPageId : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public boolean getIsVisiting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isVisiting : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public int getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.scene : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.sourceType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setActiveTab(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.activeTab = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public void setBrowseInfo(ArrayList<GProGuildBrowseInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.browseInfo = arrayList;
        } else {
            iPatchRedirector.redirect((short) 13, this, arrayList);
        }
    }

    public void setExts(ArrayList<GProGuildOnlineReportExtInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.exts = arrayList;
        } else {
            iPatchRedirector.redirect((short) 17, this, arrayList);
        }
    }

    public void setFromPageId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.fromPageId = i;
        } else {
            iPatchRedirector.redirect((short) 18, this, i);
        }
    }

    public void setIsVisiting(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.isVisiting = z;
        } else {
            iPatchRedirector.redirect((short) 14, this, z);
        }
    }

    public void setScene(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.scene = i;
        } else {
            iPatchRedirector.redirect((short) 15, this, i);
        }
    }

    public void setSourceType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.sourceType = i;
        } else {
            iPatchRedirector.redirect((short) 16, this, i);
        }
    }

    public void setTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.tinyId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "GProGuildOnlineReportReq{tinyId=" + this.tinyId + ",activeTab=" + this.activeTab + ",browseInfo=" + this.browseInfo + ",isVisiting=" + this.isVisiting + ",scene=" + this.scene + ",sourceType=" + this.sourceType + ",exts=" + this.exts + ",fromPageId=" + this.fromPageId + ",}";
    }

    public GProGuildOnlineReportReq(long j, int i, ArrayList<GProGuildBrowseInfo> arrayList, boolean z, int i2, int i3, ArrayList<GProGuildOnlineReportExtInfo> arrayList2, int i4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), arrayList, Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), arrayList2, Integer.valueOf(i4)});
            return;
        }
        this.browseInfo = new ArrayList<>();
        this.exts = new ArrayList<>();
        this.tinyId = j;
        this.activeTab = i;
        this.browseInfo = arrayList;
        this.isVisiting = z;
        this.scene = i2;
        this.sourceType = i3;
        this.exts = arrayList2;
        this.fromPageId = i4;
    }
}
