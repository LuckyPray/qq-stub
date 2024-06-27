package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildAnswerItem.class */
public final class GProJoinGuildAnswerItem {
    static IPatchRedirector $redirector_;
    public String answer;
    public String question;

    public GProJoinGuildAnswerItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.question = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.answer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getAnswer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.answer : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.question : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProJoinGuildAnswerItem{question=" + this.question + ",answer=" + this.answer + ",}";
    }

    public GProJoinGuildAnswerItem(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.question = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.answer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.question = str;
        this.answer = str2;
    }
}
