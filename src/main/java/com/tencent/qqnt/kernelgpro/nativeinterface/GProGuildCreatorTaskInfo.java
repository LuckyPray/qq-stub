package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildCreatorTaskInfo.class */
public final class GProGuildCreatorTaskInfo {
    static IPatchRedirector $redirector_;
    public int finishedCnt;
    public boolean isAllFinished;
    public int skipStatus;
    public ArrayList<GProTaskInfo> tasks;
    public int totalCnt;

    public GProGuildCreatorTaskInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.tasks = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getFinishedCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.finishedCnt : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public boolean getIsAllFinished() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isAllFinished : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public int getSkipStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.skipStatus : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<GProTaskInfo> getTasks() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.tasks : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public int getTotalCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.totalCnt : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGuildCreatorTaskInfo{skipStatus=" + this.skipStatus + ",isAllFinished=" + this.isAllFinished + ",finishedCnt=" + this.finishedCnt + ",totalCnt=" + this.totalCnt + ",tasks=" + this.tasks + ",}";
    }

    public GProGuildCreatorTaskInfo(int i, boolean z, int i2, int i3, ArrayList<GProTaskInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), arrayList);
            return;
        }
        this.tasks = new ArrayList<>();
        this.skipStatus = i;
        this.isAllFinished = z;
        this.finishedCnt = i2;
        this.totalCnt = i3;
        this.tasks = arrayList;
    }
}
