package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProIdentityInstruction.class */
public final class GProIdentityInstruction {
    static IPatchRedirector $redirector_;
    public ArrayList<GProIdentity> identityList;
    public String instructionText;
    public String memberListPreviewImg;
    public String noteText;
    public String sampleIdentityDesc;
    public String textChannelPreviewImg;

    public GProIdentityInstruction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.instructionText = "";
        this.noteText = "";
        this.textChannelPreviewImg = "";
        this.memberListPreviewImg = "";
        this.sampleIdentityDesc = "";
        this.identityList = new ArrayList<>();
    }

    public ArrayList<GProIdentity> getIdentityList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.identityList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String getInstructionText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.instructionText : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getMemberListPreviewImg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.memberListPreviewImg : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getNoteText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.noteText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getSampleIdentityDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sampleIdentityDesc : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getTextChannelPreviewImg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.textChannelPreviewImg : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProIdentityInstruction{instructionText=" + this.instructionText + ",noteText=" + this.noteText + ",textChannelPreviewImg=" + this.textChannelPreviewImg + ",memberListPreviewImg=" + this.memberListPreviewImg + ",sampleIdentityDesc=" + this.sampleIdentityDesc + ",identityList=" + this.identityList + ",}";
    }

    public GProIdentityInstruction(String str, String str2, String str3, String str4, String str5, ArrayList<GProIdentity> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, str4, str5, arrayList});
            return;
        }
        this.instructionText = "";
        this.noteText = "";
        this.textChannelPreviewImg = "";
        this.memberListPreviewImg = "";
        this.sampleIdentityDesc = "";
        this.identityList = new ArrayList<>();
        this.instructionText = str;
        this.noteText = str2;
        this.textChannelPreviewImg = str3;
        this.memberListPreviewImg = str4;
        this.sampleIdentityDesc = str5;
        this.identityList = arrayList;
    }
}
