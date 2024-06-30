package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMemberInfoInGame.class */
public final class GProMemberInfoInGame implements Serializable {
    static IPatchRedirector $redirector_;
    public String backgroundPic;
    public int gameIdentity;
    public int gameStatus;
    public long gameStatusUpdateTimestampMs;
    public ArrayList<String> goodHeroIconList;
    public int gradeLevel;
    public String gradeLevelIcon;
    public String heroName;
    public String heroPic;
    public String honorDesc;
    public String honorIcon;
    public String identityDesc;
    public long joinTimestampMs;
    public String nickName;
    public String record;
    public long roomId;
    public String schema;
    long serialVersionUID;
    public long tinyId;

    public GProMemberInfoInGame() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.nickName = "";
        this.heroName = "";
        this.heroPic = "";
        this.record = "";
        this.schema = "";
        this.goodHeroIconList = new ArrayList<>();
        this.honorIcon = "";
        this.honorDesc = "";
        this.identityDesc = "";
        this.backgroundPic = "";
        this.gradeLevelIcon = "";
    }

    public String getBackgroundPic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.backgroundPic : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public int getGameIdentity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.gameIdentity : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getGameStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.gameStatus : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getGameStatusUpdateTimestampMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.gameStatusUpdateTimestampMs : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public ArrayList<String> getGoodHeroIconList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.goodHeroIconList : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public int getGradeLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.gradeLevel : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public String getGradeLevelIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.gradeLevelIcon : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public String getHeroName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.heroName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getHeroPic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.heroPic : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getHonorDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.honorDesc : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public String getHonorIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.honorIcon : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String getIdentityDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.identityDesc : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public long getJoinTimestampMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.joinTimestampMs : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nickName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getRecord() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.record : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.schema : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 20)) {
            return (String) iPatchRedirector.redirect((short) 20, this);
        }
        return "GProMemberInfoInGame{tinyId=" + this.tinyId + ",roomId=" + this.roomId + ",nickName=" + this.nickName + ",heroName=" + this.heroName + ",heroPic=" + this.heroPic + ",gameStatus=" + this.gameStatus + ",record=" + this.record + ",joinTimestampMs=" + this.joinTimestampMs + ",gameIdentity=" + this.gameIdentity + ",gameStatusUpdateTimestampMs=" + this.gameStatusUpdateTimestampMs + ",schema=" + this.schema + ",goodHeroIconList=" + this.goodHeroIconList + ",honorIcon=" + this.honorIcon + ",honorDesc=" + this.honorDesc + ",identityDesc=" + this.identityDesc + ",gradeLevel=" + this.gradeLevel + ",backgroundPic=" + this.backgroundPic + ",gradeLevelIcon=" + this.gradeLevelIcon + ",}";
    }
}
