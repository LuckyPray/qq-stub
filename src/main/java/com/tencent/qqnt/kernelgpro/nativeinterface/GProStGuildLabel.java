package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGuildLabel.class */
public final class GProStGuildLabel {
    static IPatchRedirector $redirector_;
    public byte[] bussiData;
    public int bussiLabelType;
    public byte[] labelName;
    public int labelType;
    public int labelValue;
    public String value;
    public ArrayList<String> valueList;

    public GProStGuildLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.labelName = new byte[0];
        this.value = "";
        this.valueList = new ArrayList<>();
        this.bussiData = new byte[0];
    }

    public byte[] getBussiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.bussiData : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public int getBussiLabelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bussiLabelType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public byte[] getLabelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.labelName : (byte[]) iPatchRedirector.redirect((short) 2, this);
    }

    public int getLabelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.labelType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getLabelValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.labelValue : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.value : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<String> getValueList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.valueList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProStGuildLabel{labelName=" + this.labelName + ",labelType=" + this.labelType + ",labelValue=" + this.labelValue + ",value=" + this.value + ",valueList=" + this.valueList + ",bussiLabelType=" + this.bussiLabelType + ",bussiData=" + this.bussiData + ",}";
    }
}
