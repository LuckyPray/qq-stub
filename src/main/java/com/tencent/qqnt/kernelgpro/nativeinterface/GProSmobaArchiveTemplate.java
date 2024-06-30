package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSmobaArchiveTemplate.class */
public final class GProSmobaArchiveTemplate {
    static IPatchRedirector $redirector_;
    public String goodBranch;
    public ArrayList<String> goodHeroIconList;
    public int gradeLevel;
    public String mvpNum;
    public int starCnt;
    public String winNum;
    public String winRate;

    public GProSmobaArchiveTemplate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.winNum = "";
        this.mvpNum = "";
        this.winRate = "";
        this.goodBranch = "";
        this.goodHeroIconList = new ArrayList<>();
    }

    public String getGoodBranch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.goodBranch : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<String> getGoodHeroIconList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.goodHeroIconList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public int getGradeLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.gradeLevel : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getMvpNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.mvpNum : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getStarCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.starCnt : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getWinNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.winNum : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getWinRate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.winRate : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProSmobaArchiveTemplate{gradeLevel=" + this.gradeLevel + ",starCnt=" + this.starCnt + ",winNum=" + this.winNum + ",mvpNum=" + this.mvpNum + ",winRate=" + this.winRate + ",goodBranch=" + this.goodBranch + ",goodHeroIconList=" + this.goodHeroIconList + ",}";
    }
}
