package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProActiveUser.class */
public final class GProActiveUser {
    static IPatchRedirector $redirector_;
    public long age;
    public String avatarMeta;
    public String cityName;
    public int gender;
    public long guildId;
    public boolean isQQFriend;
    public String nickName;
    public String openid;
    public long stateType;
    public long tinyid;

    public GProActiveUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cityName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.openid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getAge() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.age : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCityName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.cityName : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getGender() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.gender : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public boolean getIsQQFriend() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.isQQFriend : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nickName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getOpenid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.openid : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getStateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.stateType : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProActiveUser{tinyid=" + this.tinyid + ",nickName=" + this.nickName + ",gender=" + this.gender + ",avatarMeta=" + this.avatarMeta + ",age=" + this.age + ",stateType=" + this.stateType + ",cityName=" + this.cityName + ",guildId=" + this.guildId + ",isQQFriend=" + this.isQQFriend + ",openid=" + this.openid + ",}";
    }

    public GProActiveUser(long j, String str, int i, String str2, long j2, long j3, String str3, long j4, boolean z, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, Integer.valueOf(i), str2, Long.valueOf(j2), Long.valueOf(j3), str3, Long.valueOf(j4), Boolean.valueOf(z), str4});
            return;
        }
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cityName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.openid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyid = j;
        this.nickName = str;
        this.gender = i;
        this.avatarMeta = str2;
        this.age = j2;
        this.stateType = j3;
        this.cityName = str3;
        this.guildId = j4;
        this.isQQFriend = z;
        this.openid = str4;
    }
}
