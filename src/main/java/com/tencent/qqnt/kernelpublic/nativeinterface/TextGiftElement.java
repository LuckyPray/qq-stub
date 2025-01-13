package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/TextGiftElement.class */
public final class TextGiftElement implements Serializable {
    static IPatchRedirector $redirector_;
    public String bgImageUrl;
    public int charmValue;
    public long giftId;
    public String giftName;
    public int level;
    public boolean needPlayAnimation;
    public String orderId;
    public String paddingTop;
    public long price;
    public String receiverNick;
    public long receiverUin;
    public int sendType;
    public String senderNick;
    public long senderUin;
    long serialVersionUID;
    public ArrayList<VASGiftSpendCoinItem> spendCoins;
    public long tianquanId;

    public TextGiftElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.giftName = "";
        this.receiverNick = "";
        this.senderNick = "";
        this.orderId = "";
        this.bgImageUrl = "";
        this.paddingTop = "";
        this.spendCoins = new ArrayList<>();
    }

    public String getBgImageUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.bgImageUrl : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getCharmValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.charmValue : ((Integer) iPatchRedirector.redirect((short) 18, this)).intValue();
    }

    public long getGiftId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.giftId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGiftName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.giftName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.level : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public boolean getNeedPlayAnimation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.needPlayAnimation : ((Boolean) iPatchRedirector.redirect((short) 16, this)).booleanValue();
    }

    public String getOrderId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.orderId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getPaddingTop() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.paddingTop : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public long getPrice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.price : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String getReceiverNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.receiverNick : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getReceiverUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.receiverUin : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getSendType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.sendType : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public String getSenderNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.senderNick : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getSenderUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.senderUin : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public ArrayList<VASGiftSpendCoinItem> getSpendCoins() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.spendCoins : (ArrayList) iPatchRedirector.redirect((short) 15, this);
    }

    public long getTianquanId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.tianquanId : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "TextGiftElement{giftId=" + this.giftId + ",giftName=" + this.giftName + ",receiverUin=" + this.receiverUin + ",senderUin=" + this.senderUin + ",receiverNick=" + this.receiverNick + ",senderNick=" + this.senderNick + ",price=" + this.price + ",orderId=" + this.orderId + ",bgImageUrl=" + this.bgImageUrl + ",tianquanId=" + this.tianquanId + ",level=" + this.level + ",paddingTop=" + this.paddingTop + ",spendCoins=" + this.spendCoins + ",needPlayAnimation=" + this.needPlayAnimation + ",sendType=" + this.sendType + ",charmValue=" + this.charmValue + ",}";
    }

    public TextGiftElement(long j, String str, long j2, long j3, String str2, String str3, long j4, String str4, String str5, long j5, int i, String str6, ArrayList<VASGiftSpendCoinItem> arrayList, boolean z, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3), str2, str3, Long.valueOf(j4), str4, str5, Long.valueOf(j5), Integer.valueOf(i), str6, arrayList, Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        this.serialVersionUID = 1L;
        this.giftName = "";
        this.receiverNick = "";
        this.senderNick = "";
        this.orderId = "";
        this.bgImageUrl = "";
        this.paddingTop = "";
        this.spendCoins = new ArrayList<>();
        this.giftId = j;
        this.giftName = str;
        this.receiverUin = j2;
        this.senderUin = j3;
        this.receiverNick = str2;
        this.senderNick = str3;
        this.price = j4;
        this.orderId = str4;
        this.bgImageUrl = str5;
        this.tianquanId = j5;
        this.level = i;
        this.paddingTop = str6;
        this.spendCoins = arrayList;
        this.needPlayAnimation = z;
        this.sendType = i2;
        this.charmValue = i3;
    }
}
