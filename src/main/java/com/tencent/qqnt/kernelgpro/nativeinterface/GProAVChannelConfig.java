package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVChannelConfig.class */
public final class GProAVChannelConfig implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProBusinessNode> businessList;
    public long channelDataVersion;
    public long originatorTinyId;
    long serialVersionUID;
    public GProGuildThemeInfo themeInfo;
    public ArrayList<GProGuildThemeInfo> themeList;
    public GProChannelToolBar toolBar;

    public GProAVChannelConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.themeInfo = new GProGuildThemeInfo();
        this.businessList = new ArrayList<>();
        this.toolBar = new GProChannelToolBar();
        this.themeList = new ArrayList<>();
    }

    public ArrayList<GProBusinessNode> getBusinessList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.businessList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getChannelDataVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelDataVersion : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getOriginatorTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.originatorTinyId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProGuildThemeInfo getThemeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.themeInfo : (GProGuildThemeInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProGuildThemeInfo> getThemeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.themeList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public GProChannelToolBar getToolBar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.toolBar : (GProChannelToolBar) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAVChannelConfig{themeInfo=" + this.themeInfo + ",businessList=" + this.businessList + ",originatorTinyId=" + this.originatorTinyId + ",toolBar=" + this.toolBar + ",themeList=" + this.themeList + ",channelDataVersion=" + this.channelDataVersion + ",}";
    }

    public GProAVChannelConfig(GProGuildThemeInfo gProGuildThemeInfo, ArrayList<GProBusinessNode> arrayList, long j, GProChannelToolBar gProChannelToolBar, ArrayList<GProGuildThemeInfo> arrayList2, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProGuildThemeInfo, arrayList, Long.valueOf(j), gProChannelToolBar, arrayList2, Long.valueOf(j2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.themeInfo = new GProGuildThemeInfo();
        this.businessList = new ArrayList<>();
        this.toolBar = new GProChannelToolBar();
        this.themeList = new ArrayList<>();
        this.themeInfo = gProGuildThemeInfo;
        this.businessList = arrayList;
        this.originatorTinyId = j;
        this.toolBar = gProChannelToolBar;
        this.themeList = arrayList2;
        this.channelDataVersion = j2;
    }
}
