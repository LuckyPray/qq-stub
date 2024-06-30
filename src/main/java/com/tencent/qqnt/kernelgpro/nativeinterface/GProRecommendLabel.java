package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendLabel.class */
public final class GProRecommendLabel implements Serializable {
    static IPatchRedirector $redirector_;
    public int bussiLabelType;
    public String labelName;
    public int labelType;
    public int labelValue;
    long serialVersionUID;
    public String value;
    public ArrayList<String> valueList;

    public GProRecommendLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.labelName = "";
        this.value = "";
        this.valueList = new ArrayList<>();
    }

    public int getBussiLabelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.bussiLabelType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getLabelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.labelName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getLabelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.labelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getLabelValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.labelValue : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.value : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getValueList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.valueList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProRecommendLabel{labelName=" + this.labelName + ",labelType=" + this.labelType + ",labelValue=" + this.labelValue + ",value=" + this.value + ",valueList=" + this.valueList + ",bussiLabelType=" + this.bussiLabelType + ",}";
    }

    public GProRecommendLabel(String str, int i, int i2, String str2, ArrayList<String> arrayList, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Integer.valueOf(i), Integer.valueOf(i2), str2, arrayList, Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.labelName = "";
        this.value = "";
        this.valueList = new ArrayList<>();
        this.labelName = str;
        this.labelType = i;
        this.labelValue = i2;
        this.value = str2;
        this.valueList = arrayList;
        this.bussiLabelType = i3;
    }
}
