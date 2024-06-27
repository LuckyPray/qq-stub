package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendRobot.class */
public final class GProContentRecommendRobot implements Serializable {
    static IPatchRedirector $redirector_;
    public String appId;
    public String buttonName;
    public String desc;
    public byte[] extra;
    public String nickName;
    public GProImageBasicInfo picInfo;
    public long robotUin;
    public String schema;
    long serialVersionUID;
    public int type;
    public String uid;

    public GProContentRecommendRobot() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.picInfo = new GProImageBasicInfo();
        this.schema = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buttonName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.extra = new byte[0];
        this.appId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.appId : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getButtonName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.buttonName : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.desc : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public byte[] getExtra() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.extra : (byte[]) iPatchRedirector.redirect((short) 10, this);
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.nickName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProImageBasicInfo getPicInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.picInfo : (GProImageBasicInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public long getRobotUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.robotUin : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.schema : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.uid : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProContentRecommendRobot{robotUin=" + this.robotUin + ",picInfo=" + this.picInfo + ",schema=" + this.schema + ",uid=" + this.uid + ",nickName=" + this.nickName + ",desc=" + this.desc + ",type=" + this.type + ",buttonName=" + this.buttonName + ",extra=" + this.extra + ",appId=" + this.appId + ",}";
    }
}
