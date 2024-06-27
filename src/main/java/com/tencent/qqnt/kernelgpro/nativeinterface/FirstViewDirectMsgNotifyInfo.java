package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/FirstViewDirectMsgNotifyInfo.class */
public final class FirstViewDirectMsgNotifyInfo {
    static IPatchRedirector $redirector_;
    public String CmtId;
    public int DirectMsgSwitch;
    public ArrayList<Integer> FeedAtTypes;
    public int FeedCommentsSwitch;
    public String FeedId;
    public long FeedsChannelId;
    public long FeedsEventIsValid;
    public byte[] FeedsEventLastId;
    public long FeedsEventLastTime;
    public long FeedsEventNnreadNum;
    public long FeedsGuildId;
    public boolean FeedsNeedNofity;
    public String JumpSchema;
    public String ReplyId;
    public MsgAbstract msgAbstract;
    public boolean needPushNotify;

    public FirstViewDirectMsgNotifyInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.msgAbstract = new MsgAbstract();
        this.FeedsEventLastId = new byte[0];
        this.FeedAtTypes = new ArrayList<>();
        this.FeedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.CmtId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ReplyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.JumpSchema = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCmtId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.CmtId : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public int getDirectMsgSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.DirectMsgSwitch : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<Integer> getFeedAtTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.FeedAtTypes : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public int getFeedCommentsSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.FeedCommentsSwitch : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.FeedId : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public long getFeedsChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.FeedsChannelId : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public long getFeedsEventIsValid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.FeedsEventIsValid : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public byte[] getFeedsEventLastId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.FeedsEventLastId : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public long getFeedsEventLastTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.FeedsEventLastTime : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getFeedsEventNnreadNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.FeedsEventNnreadNum : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getFeedsGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.FeedsGuildId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public boolean getFeedsNeedNofity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.FeedsNeedNofity : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public String getJumpSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.JumpSchema : (String) iPatchRedirector.redirect((short) 17, this);
    }

    public MsgAbstract getMsgAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.msgAbstract : (MsgAbstract) iPatchRedirector.redirect((short) 6, this);
    }

    public boolean getNeedPushNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.needPushNotify : ((Boolean) iPatchRedirector.redirect((short) 18, this)).booleanValue();
    }

    public String getReplyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.ReplyId : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "FirstViewDirectMsgNotifyInfo{DirectMsgSwitch=" + this.DirectMsgSwitch + ",FeedsEventIsValid=" + this.FeedsEventIsValid + ",FeedsEventNnreadNum=" + this.FeedsEventNnreadNum + ",msgAbstract=" + this.msgAbstract + ",FeedsEventLastTime=" + this.FeedsEventLastTime + ",FeedsEventLastId=" + this.FeedsEventLastId + ",FeedsNeedNofity=" + this.FeedsNeedNofity + ",FeedsGuildId=" + this.FeedsGuildId + ",FeedsChannelId=" + this.FeedsChannelId + ",FeedCommentsSwitch=" + this.FeedCommentsSwitch + ",FeedAtTypes=" + this.FeedAtTypes + ",FeedId=" + this.FeedId + ",CmtId=" + this.CmtId + ",ReplyId=" + this.ReplyId + ",JumpSchema=" + this.JumpSchema + ",needPushNotify=" + this.needPushNotify + ",}";
    }

    public FirstViewDirectMsgNotifyInfo(int i, long j, long j2, MsgAbstract msgAbstract, long j3, byte[] bArr, boolean z, long j4, long j5, int i2, ArrayList<Integer> arrayList, String str, String str2, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), msgAbstract, Long.valueOf(j3), bArr, Boolean.valueOf(z), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i2), arrayList, str, str2, str3, str4});
            return;
        }
        this.msgAbstract = new MsgAbstract();
        this.FeedsEventLastId = new byte[0];
        this.FeedAtTypes = new ArrayList<>();
        this.FeedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.CmtId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ReplyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.JumpSchema = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.DirectMsgSwitch = i;
        this.FeedsEventIsValid = j;
        this.FeedsEventNnreadNum = j2;
        this.msgAbstract = msgAbstract;
        this.FeedsEventLastTime = j3;
        this.FeedsEventLastId = bArr;
        this.FeedsNeedNofity = z;
        this.FeedsGuildId = j4;
        this.FeedsChannelId = j5;
        this.FeedCommentsSwitch = i2;
        this.FeedAtTypes = arrayList;
        this.FeedId = str;
        this.CmtId = str2;
        this.ReplyId = str3;
        this.JumpSchema = str4;
    }
}
