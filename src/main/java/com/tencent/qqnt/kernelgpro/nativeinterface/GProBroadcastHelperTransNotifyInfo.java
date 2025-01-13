package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBroadcastHelperTransNotifyInfo.class */
public final class GProBroadcastHelperTransNotifyInfo {
    static IPatchRedirector $redirector_;
    public long fileErrCode;
    public String fileErrMsg;
    public String filePath;
    public long fileProgress;
    public long fileSpeed;
    public long totalSize;
    public int trasferStatus;

    public GProBroadcastHelperTransNotifyInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.fileErrMsg = "";
            this.filePath = "";
        }
    }

    public long getFileErrCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.fileErrCode : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getFileErrMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.fileErrMsg : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFilePath() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.filePath : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getFileProgress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.fileProgress : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getFileSpeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.fileSpeed : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getTotalSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.totalSize : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getTrasferStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.trasferStatus : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProBroadcastHelperTransNotifyInfo{fileProgress=" + this.fileProgress + ",fileSpeed=" + this.fileSpeed + ",fileErrCode=" + this.fileErrCode + ",fileErrMsg=" + this.fileErrMsg + ",filePath=" + this.filePath + ",totalSize=" + this.totalSize + ",trasferStatus=" + this.trasferStatus + ",}";
    }

    public GProBroadcastHelperTransNotifyInfo(long j, long j2, long j3, String str, String str2, long j4, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, str2, Long.valueOf(j4), Integer.valueOf(i));
            return;
        }
        this.fileErrMsg = "";
        this.filePath = "";
        this.fileProgress = j;
        this.fileSpeed = j2;
        this.fileErrCode = j3;
        this.fileErrMsg = str;
        this.filePath = str2;
        this.totalSize = j4;
        this.trasferStatus = i;
    }
}
