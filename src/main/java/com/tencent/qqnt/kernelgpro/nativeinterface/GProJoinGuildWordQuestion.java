package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildWordQuestion.class */
public final class GProJoinGuildWordQuestion implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProJoinGuildWordQuestionItem> items;
    long serialVersionUID;

    public GProJoinGuildWordQuestion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.items = new ArrayList<>();
        }
    }

    public ArrayList<GProJoinGuildWordQuestionItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public void setItems(ArrayList<GProJoinGuildWordQuestionItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.items = arrayList;
        } else {
            iPatchRedirector.redirect((short) 4, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProJoinGuildWordQuestion{items=" + this.items + ",}";
    }

    public GProJoinGuildWordQuestion(ArrayList<GProJoinGuildWordQuestionItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.items = new ArrayList<>();
        this.items = arrayList;
    }
}
