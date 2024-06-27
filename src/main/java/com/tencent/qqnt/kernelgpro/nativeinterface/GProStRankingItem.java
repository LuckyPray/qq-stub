package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRankingItem.class */
public final class GProStRankingItem {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public int grade;
    public int inTopicList;
    public int rankNo;
    public GProStRelationInfo relation;
    public long score;
    public GProStUser user;

    public GProStRankingItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.user = new GProStUser();
        this.relation = new GProStRelationInfo();
        this.busiData = new byte[0];
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public int getGrade() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.grade : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getInTopicList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.inTopicList : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getRankNo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.rankNo : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProStRelationInfo getRelation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.relation : (GProStRelationInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public long getScore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.score : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProStUser getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.user : (GProStUser) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProStRankingItem{user=" + this.user + ",relation=" + this.relation + ",score=" + this.score + ",grade=" + this.grade + ",busiData=" + this.busiData + ",rankNo=" + this.rankNo + ",inTopicList=" + this.inTopicList + ",}";
    }
}
