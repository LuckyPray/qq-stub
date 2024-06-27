package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetUserList.class */
public final class GProGetUserList {
    static IPatchRedirector $redirector_;
    public int getNum;
    public long startIndex;
    public long startUin;
    public int uint32GetType;
    public int uint32SortType;

    public GProGetUserList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getGetNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.getNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getStartIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.startIndex : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getStartUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.startUin : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getUint32GetType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.uint32GetType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getUint32SortType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uint32SortType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetUserList{uint32GetType=" + this.uint32GetType + ",uint32SortType=" + this.uint32SortType + ",startIndex=" + this.startIndex + ",startUin=" + this.startUin + ",getNum=" + this.getNum + ",}";
    }
}
