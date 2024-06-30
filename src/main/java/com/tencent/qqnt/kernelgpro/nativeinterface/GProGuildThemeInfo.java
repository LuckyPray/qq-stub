package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildThemeInfo.class */
public final class GProGuildThemeInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<Integer> oldThemeTypeList;
    long serialVersionUID;
    public String sessionId;
    public String themeBgImg;
    public byte[] themeColor;
    public String themeIcon;
    public String themeName;
    public int themeType;

    public GProGuildThemeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.oldThemeTypeList = new ArrayList<>();
        this.themeName = "";
        this.themeIcon = "";
        this.themeColor = new byte[0];
        this.themeBgImg = "";
        this.sessionId = "";
    }

    public ArrayList<Integer> getOldThemeTypeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.oldThemeTypeList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getThemeBgImg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.themeBgImg : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public byte[] getThemeColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.themeColor : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public String getThemeIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.themeIcon : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getThemeName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.themeName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getThemeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.themeType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProGuildThemeInfo{themeType=" + this.themeType + ",oldThemeTypeList=" + this.oldThemeTypeList + ",themeName=" + this.themeName + ",themeIcon=" + this.themeIcon + ",themeColor=" + this.themeColor + ",themeBgImg=" + this.themeBgImg + ",sessionId=" + this.sessionId + ",}";
    }

    public GProGuildThemeInfo(int i, ArrayList<Integer> arrayList, String str, String str2, byte[] bArr, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), arrayList, str, str2, bArr, str3, str4});
            return;
        }
        this.serialVersionUID = 1L;
        this.oldThemeTypeList = new ArrayList<>();
        this.themeName = "";
        this.themeIcon = "";
        this.themeColor = new byte[0];
        this.themeBgImg = "";
        this.sessionId = "";
        this.themeType = i;
        this.oldThemeTypeList = arrayList;
        this.themeName = str;
        this.themeIcon = str2;
        this.themeColor = bArr;
        this.themeBgImg = str3;
        this.sessionId = str4;
    }
}
