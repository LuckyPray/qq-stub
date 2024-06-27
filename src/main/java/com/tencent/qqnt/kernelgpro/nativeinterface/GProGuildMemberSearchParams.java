package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildMemberSearchParams.class */
public final class GProGuildMemberSearchParams {
    static IPatchRedirector $redirector_;
    public long categoryId;
    public long channelId;
    public int count;
    public long guildId;
    public String keyword;
    public long pos;
    public long roleId;
    public int sourceId;

    public GProGuildMemberSearchParams() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.keyword = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getKeyword() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.keyword : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getPos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.pos : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.roleId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public int getSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sourceId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setCategoryId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.categoryId = j;
        } else {
            iPatchRedirector.redirect((short) 17, this, j);
        }
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 16, this, j);
        }
    }

    public void setCount(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.count = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 12, this, j);
        }
    }

    public void setKeyword(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.keyword = str;
        } else {
            iPatchRedirector.redirect((short) 13, this, str);
        }
    }

    public void setPos(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.pos = j;
        } else {
            iPatchRedirector.redirect((short) 15, this, j);
        }
    }

    public void setRoleId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.roleId = j;
        } else {
            iPatchRedirector.redirect((short) 18, this, j);
        }
    }

    public void setSourceId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.sourceId = i;
        } else {
            iPatchRedirector.redirect((short) 11, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "GProGuildMemberSearchParams{sourceId=" + this.sourceId + ",guildId=" + this.guildId + ",keyword=" + this.keyword + ",count=" + this.count + ",pos=" + this.pos + ",channelId=" + this.channelId + ",categoryId=" + this.categoryId + ",roleId=" + this.roleId + ",}";
    }

    public GProGuildMemberSearchParams(int i, long j, String str, int i2, long j2, long j3, long j4, long j5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), str, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)});
            return;
        }
        this.keyword = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sourceId = i;
        this.guildId = j;
        this.keyword = str;
        this.count = i2;
        this.pos = j2;
        this.channelId = j3;
        this.categoryId = j4;
        this.roleId = j5;
    }
}
