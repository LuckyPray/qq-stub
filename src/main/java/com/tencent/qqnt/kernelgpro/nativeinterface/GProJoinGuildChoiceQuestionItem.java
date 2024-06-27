package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildChoiceQuestionItem.class */
public final class GProJoinGuildChoiceQuestionItem implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<String> answers;
    public String correctAnswer;
    public String question;
    long serialVersionUID;

    public GProJoinGuildChoiceQuestionItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.question = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.correctAnswer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.answers = new ArrayList<>();
    }

    public ArrayList<String> getAnswers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.answers : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getCorrectAnswer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.correctAnswer : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.question : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setAnswers(ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.answers = arrayList;
        } else {
            iPatchRedirector.redirect((short) 8, this, arrayList);
        }
    }

    public void setCorrectAnswer(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.correctAnswer = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public void setQuestion(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.question = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProJoinGuildChoiceQuestionItem{question=" + this.question + ",correctAnswer=" + this.correctAnswer + ",answers=" + this.answers + ",}";
    }

    public GProJoinGuildChoiceQuestionItem(String str, String str2, ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.question = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.correctAnswer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.answers = new ArrayList<>();
        this.question = str;
        this.correctAnswer = str2;
        this.answers = arrayList;
    }
}
