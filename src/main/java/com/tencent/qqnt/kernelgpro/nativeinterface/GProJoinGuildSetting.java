package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildSetting.class */
public final class GProJoinGuildSetting implements Serializable {
    static IPatchRedirector $redirector_;
    public GProJoinGuildChoiceQuestion choiceQuestion;
    public int optionType;
    long serialVersionUID;
    public GProJoinGuildWordQuestion wordQuestion;

    public GProJoinGuildSetting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.wordQuestion = new GProJoinGuildWordQuestion();
        this.choiceQuestion = new GProJoinGuildChoiceQuestion();
    }

    public GProJoinGuildChoiceQuestion getChoiceQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.choiceQuestion : (GProJoinGuildChoiceQuestion) iPatchRedirector.redirect((short) 5, this);
    }

    public int getOptionType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.optionType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProJoinGuildWordQuestion getWordQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.wordQuestion : (GProJoinGuildWordQuestion) iPatchRedirector.redirect((short) 4, this);
    }

    public void setChoiceQuestion(GProJoinGuildChoiceQuestion gProJoinGuildChoiceQuestion) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.choiceQuestion = gProJoinGuildChoiceQuestion;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProJoinGuildChoiceQuestion);
        }
    }

    public void setOptionType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.optionType = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setWordQuestion(GProJoinGuildWordQuestion gProJoinGuildWordQuestion) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.wordQuestion = gProJoinGuildWordQuestion;
        } else {
            iPatchRedirector.redirect((short) 7, this, gProJoinGuildWordQuestion);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProJoinGuildSetting{optionType=" + this.optionType + ",wordQuestion=" + this.wordQuestion + ",choiceQuestion=" + this.choiceQuestion + ",}";
    }

    public GProJoinGuildSetting(int i, GProJoinGuildWordQuestion gProJoinGuildWordQuestion, GProJoinGuildChoiceQuestion gProJoinGuildChoiceQuestion) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), gProJoinGuildWordQuestion, gProJoinGuildChoiceQuestion});
            return;
        }
        this.serialVersionUID = 1L;
        this.wordQuestion = new GProJoinGuildWordQuestion();
        this.choiceQuestion = new GProJoinGuildChoiceQuestion();
        this.optionType = i;
        this.wordQuestion = gProJoinGuildWordQuestion;
        this.choiceQuestion = gProJoinGuildChoiceQuestion;
    }
}
