package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRemoveRiskMembersReq.class */
public final class GProRemoveRiskMembersReq {
    static IPatchRedirector $redirector_;
    public boolean addBlack;
    public long guildId;
    public boolean removeFromGuild;
    public int revokeType;
    public boolean selectAll;
    public ArrayList<Long> tinyidList;

    public GProRemoveRiskMembersReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.tinyidList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public boolean getAddBlack() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.addBlack : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public boolean getRemoveFromGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.removeFromGuild : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public int getRevokeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.revokeType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public boolean getSelectAll() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.selectAll : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public ArrayList<Long> getTinyidList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyidList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public void setAddBlack(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.addBlack = z;
        } else {
            iPatchRedirector.redirect((short) 12, this, z);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public void setRemoveFromGuild(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.removeFromGuild = z;
        } else {
            iPatchRedirector.redirect((short) 13, this, z);
        }
    }

    public void setRevokeType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.revokeType = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setSelectAll(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.selectAll = z;
        } else {
            iPatchRedirector.redirect((short) 10, this, z);
        }
    }

    public void setTinyidList(ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.tinyidList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 9, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProRemoveRiskMembersReq{tinyidList=" + this.tinyidList + ",selectAll=" + this.selectAll + ",guildId=" + this.guildId + ",addBlack=" + this.addBlack + ",removeFromGuild=" + this.removeFromGuild + ",revokeType=" + this.revokeType + ",}";
    }

    public GProRemoveRiskMembersReq(ArrayList<Long> arrayList, boolean z, long j, boolean z2, boolean z3, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, Boolean.valueOf(z), Long.valueOf(j), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i));
            return;
        }
        this.tinyidList = new ArrayList<>();
        this.tinyidList = arrayList;
        this.selectAll = z;
        this.guildId = j;
        this.addBlack = z2;
        this.removeFromGuild = z3;
        this.revokeType = i;
    }
}
