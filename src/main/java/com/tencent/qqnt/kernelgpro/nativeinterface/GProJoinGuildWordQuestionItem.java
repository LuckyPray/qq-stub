package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildWordQuestionItem.class */
public final class GProJoinGuildWordQuestionItem implements Serializable {
    static IPatchRedirector $redirector_;
    public String correctAnswer;
    public String question;
    long serialVersionUID;

    public GProJoinGuildWordQuestionItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.question = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.correctAnswer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCorrectAnswer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.correctAnswer : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.question : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setCorrectAnswer(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.correctAnswer = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public void setQuestion(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.question = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProJoinGuildWordQuestionItem{question=" + this.question + ",correctAnswer=" + this.correctAnswer + ",}";
    }

    public GProJoinGuildWordQuestionItem(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.question = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.correctAnswer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.question = str;
        this.correctAnswer = str2;
    }
}
