package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildChoiceQuestion.class */
public final class GProJoinGuildChoiceQuestion implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProJoinGuildChoiceQuestionItem> items;
    public int needAnswerNum;
    public int passCorrectNum;
    long serialVersionUID;

    public GProJoinGuildChoiceQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.items = new ArrayList<>();
        }
    }

    public ArrayList<GProJoinGuildChoiceQuestionItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public int getNeedAnswerNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.needAnswerNum : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getPassCorrectNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.passCorrectNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setItems(ArrayList<GProJoinGuildChoiceQuestionItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.items = arrayList;
        } else {
            iPatchRedirector.redirect((short) 8, this, arrayList);
        }
    }

    public void setNeedAnswerNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.needAnswerNum = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setPassCorrectNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.passCorrectNum = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProJoinGuildChoiceQuestion{needAnswerNum=" + this.needAnswerNum + ",passCorrectNum=" + this.passCorrectNum + ",items=" + this.items + ",}";
    }

    public GProJoinGuildChoiceQuestion(int i, int i2, ArrayList<GProJoinGuildChoiceQuestionItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.items = new ArrayList<>();
        this.needAnswerNum = i;
        this.passCorrectNum = i2;
        this.items = arrayList;
    }
}
