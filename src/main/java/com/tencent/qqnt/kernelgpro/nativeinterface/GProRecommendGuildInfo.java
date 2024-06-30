package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendGuildInfo.class */
public final class GProRecommendGuildInfo {
    static IPatchRedirector $redirector_;
    public String cover;
    public String face;
    public String faceAnimationOnIdle;
    public String faceAnimationOnUpdate;
    public long fontColorId;
    public String guildCode;
    public long guildId;
    public String introduction;
    public int locationType;
    public String name;
    public ArrayList<GProNavigationInfo> navigationInfoList;
    public GProPlayFaceAnimationPolicy playFaceAnimationPolicy;
    public long seq;
    public String subTitle;
    public ArrayList<GProTextMedalInfo> textMedalInfoList;

    public GProRecommendGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = "";
        this.face = "";
        this.cover = "";
        this.subTitle = "";
        this.introduction = "";
        this.guildCode = "";
        this.faceAnimationOnUpdate = "";
        this.faceAnimationOnIdle = "";
        this.playFaceAnimationPolicy = new GProPlayFaceAnimationPolicy();
        this.navigationInfoList = new ArrayList<>();
        this.textMedalInfoList = new ArrayList<>();
    }

    public String getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.cover : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFace() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.face : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFaceAnimationOnIdle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.faceAnimationOnIdle : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String getFaceAnimationOnUpdate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.faceAnimationOnUpdate : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getFontColorId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.fontColorId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getGuildCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildCode : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getIntroduction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.introduction : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getLocationType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.locationType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProNavigationInfo> getNavigationInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.navigationInfoList : (ArrayList) iPatchRedirector.redirect((short) 15, this);
    }

    public GProPlayFaceAnimationPolicy getPlayFaceAnimationPolicy() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.playFaceAnimationPolicy : (GProPlayFaceAnimationPolicy) iPatchRedirector.redirect((short) 14, this);
    }

    public long getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.seq : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public String getSubTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.subTitle : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProTextMedalInfo> getTextMedalInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.textMedalInfoList : (ArrayList) iPatchRedirector.redirect((short) 17, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProRecommendGuildInfo{guildId=" + this.guildId + ",name=" + this.name + ",face=" + this.face + ",cover=" + this.cover + ",fontColorId=" + this.fontColorId + ",subTitle=" + this.subTitle + ",introduction=" + this.introduction + ",guildCode=" + this.guildCode + ",seq=" + this.seq + ",faceAnimationOnUpdate=" + this.faceAnimationOnUpdate + ",faceAnimationOnIdle=" + this.faceAnimationOnIdle + ",playFaceAnimationPolicy=" + this.playFaceAnimationPolicy + ",navigationInfoList=" + this.navigationInfoList + ",locationType=" + this.locationType + ",textMedalInfoList=" + this.textMedalInfoList + ",}";
    }

    public GProRecommendGuildInfo(long j, String str, String str2, String str3, long j2, String str4, String str5, String str6, long j3, String str7, String str8, GProPlayFaceAnimationPolicy gProPlayFaceAnimationPolicy, ArrayList<GProNavigationInfo> arrayList, int i, ArrayList<GProTextMedalInfo> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, str3, Long.valueOf(j2), str4, str5, str6, Long.valueOf(j3), str7, str8, gProPlayFaceAnimationPolicy, arrayList, Integer.valueOf(i), arrayList2});
            return;
        }
        this.name = "";
        this.face = "";
        this.cover = "";
        this.subTitle = "";
        this.introduction = "";
        this.guildCode = "";
        this.faceAnimationOnUpdate = "";
        this.faceAnimationOnIdle = "";
        this.playFaceAnimationPolicy = new GProPlayFaceAnimationPolicy();
        this.navigationInfoList = new ArrayList<>();
        this.textMedalInfoList = new ArrayList<>();
        this.guildId = j;
        this.name = str;
        this.face = str2;
        this.cover = str3;
        this.fontColorId = j2;
        this.subTitle = str4;
        this.introduction = str5;
        this.guildCode = str6;
        this.seq = j3;
        this.faceAnimationOnUpdate = str7;
        this.faceAnimationOnIdle = str8;
        this.playFaceAnimationPolicy = gProPlayFaceAnimationPolicy;
        this.navigationInfoList = arrayList;
        this.locationType = i;
        this.textMedalInfoList = arrayList2;
    }
}
