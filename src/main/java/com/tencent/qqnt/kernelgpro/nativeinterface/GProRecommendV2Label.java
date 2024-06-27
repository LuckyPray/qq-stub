package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendV2Label.class */
public final class GProRecommendV2Label implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendV2Color edgingColor;
    public int labelAttr;
    public int labelType;
    public String name;
    long serialVersionUID;
    public GProRecommendV2Color textColor;

    public GProRecommendV2Label() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.textColor = new GProRecommendV2Color();
        this.edgingColor = new GProRecommendV2Color();
    }

    public GProRecommendV2Color getEdgingColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.edgingColor : (GProRecommendV2Color) iPatchRedirector.redirect((short) 5, this);
    }

    public int getLabelAttr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.labelAttr : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getLabelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.labelType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRecommendV2Color getTextColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.textColor : (GProRecommendV2Color) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendV2Label{name=" + this.name + ",textColor=" + this.textColor + ",edgingColor=" + this.edgingColor + ",labelAttr=" + this.labelAttr + ",labelType=" + this.labelType + ",}";
    }

    public GProRecommendV2Label(String str, GProRecommendV2Color gProRecommendV2Color, GProRecommendV2Color gProRecommendV2Color2, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, gProRecommendV2Color, gProRecommendV2Color2, Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.textColor = new GProRecommendV2Color();
        this.edgingColor = new GProRecommendV2Color();
        this.name = str;
        this.textColor = gProRecommendV2Color;
        this.edgingColor = gProRecommendV2Color2;
        this.labelAttr = i;
        this.labelType = i2;
    }
}
