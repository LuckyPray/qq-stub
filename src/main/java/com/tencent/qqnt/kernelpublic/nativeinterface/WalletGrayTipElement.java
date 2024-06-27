package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/WalletGrayTipElement.class */
public final class WalletGrayTipElement implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] authkey;
    public byte[] broadcastRichContent;
    public int hideFlag;
    public int icon;
    public byte[] idiom;
    public byte[] idiomAlpha;
    public int idiomSeq;
    public String jumpUrl;
    public int luckyFlag;
    public long luckyUin;
    public int msgType;
    public byte[] pcBody;
    public byte[] poemRule;
    public int random;
    public byte[] receiverRichContent;
    public long receiverUin;
    public byte[] senderRichContent;
    public long senderUin;
    long serialVersionUID;
    public int showLastest;
    public int subchannel;
    public int time;

    public WalletGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.senderRichContent = new byte[0];
        this.receiverRichContent = new byte[0];
        this.authkey = new byte[0];
        this.pcBody = new byte[0];
        this.broadcastRichContent = new byte[0];
        this.idiom = new byte[0];
        this.idiomAlpha = new byte[0];
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.poemRule = new byte[0];
    }

    public byte[] getAuthkey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.authkey : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public byte[] getBroadcastRichContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.broadcastRichContent : (byte[]) iPatchRedirector.redirect((short) 17, this);
    }

    public int getHideFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.hideFlag : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.icon : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public byte[] getIdiom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.idiom : (byte[]) iPatchRedirector.redirect((short) 18, this);
    }

    public byte[] getIdiomAlpha() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.idiomAlpha : (byte[]) iPatchRedirector.redirect((short) 20, this);
    }

    public int getIdiomSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.idiomSeq : ((Integer) iPatchRedirector.redirect((short) 19, this)).intValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public int getLuckyFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.luckyFlag : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public long getLuckyUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.luckyUin : ((Long) iPatchRedirector.redirect((short) 14, this)).longValue();
    }

    public int getMsgType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.msgType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public byte[] getPcBody() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.pcBody : (byte[]) iPatchRedirector.redirect((short) 12, this);
    }

    public byte[] getPoemRule() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.poemRule : (byte[]) iPatchRedirector.redirect((short) 23, this);
    }

    public int getRandom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.random : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public byte[] getReceiverRichContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.receiverRichContent : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public long getReceiverUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.receiverUin : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public byte[] getSenderRichContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.senderRichContent : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public long getSenderUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.senderUin : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getShowLastest() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.showLastest : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getSubchannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.subchannel : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
    }

    public int getTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.time : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 24)) {
            return (String) iPatchRedirector.redirect((short) 24, this);
        }
        return "WalletGrayTipElement{showLastest=" + this.showLastest + ",senderUin=" + this.senderUin + ",receiverUin=" + this.receiverUin + ",senderRichContent=" + this.senderRichContent + ",receiverRichContent=" + this.receiverRichContent + ",authkey=" + this.authkey + ",msgType=" + this.msgType + ",luckyFlag=" + this.luckyFlag + ",hideFlag=" + this.hideFlag + ",pcBody=" + this.pcBody + ",icon=" + this.icon + ",luckyUin=" + this.luckyUin + ",time=" + this.time + ",random=" + this.random + ",broadcastRichContent=" + this.broadcastRichContent + ",idiom=" + this.idiom + ",idiomSeq=" + this.idiomSeq + ",idiomAlpha=" + this.idiomAlpha + ",jumpUrl=" + this.jumpUrl + ",subchannel=" + this.subchannel + ",poemRule=" + this.poemRule + ",}";
    }

    public WalletGrayTipElement(int i, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, byte[] bArr4, int i5, long j3, int i6, int i7, byte[] bArr5, byte[] bArr6, int i8, byte[] bArr7, String str, int i9, byte[] bArr8) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), bArr, bArr2, bArr3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bArr4, Integer.valueOf(i5), Long.valueOf(j3), Integer.valueOf(i6), Integer.valueOf(i7), bArr5, bArr6, Integer.valueOf(i8), bArr7, str, Integer.valueOf(i9), bArr8});
            return;
        }
        this.serialVersionUID = 1L;
        this.senderRichContent = new byte[0];
        this.receiverRichContent = new byte[0];
        this.authkey = new byte[0];
        this.pcBody = new byte[0];
        this.broadcastRichContent = new byte[0];
        this.idiom = new byte[0];
        this.idiomAlpha = new byte[0];
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.poemRule = new byte[0];
        this.showLastest = i;
        this.senderUin = j;
        this.receiverUin = j2;
        this.senderRichContent = bArr;
        this.receiverRichContent = bArr2;
        this.authkey = bArr3;
        this.msgType = i2;
        this.luckyFlag = i3;
        this.hideFlag = i4;
        this.pcBody = bArr4;
        this.icon = i5;
        this.luckyUin = j3;
        this.time = i6;
        this.random = i7;
        this.broadcastRichContent = bArr5;
        this.idiom = bArr6;
        this.idiomSeq = i8;
        this.idiomAlpha = bArr7;
        this.jumpUrl = str;
        this.subchannel = i9;
        this.poemRule = bArr8;
    }
}
