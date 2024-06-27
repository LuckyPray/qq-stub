package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLabelInfo.class */
public final class GProLabelInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String content;
    public String detailsAvUrl;
    public String detailsImageUrl;
    public String friendJoinNumTag;
    public ArrayList<GProGuildInfoInLabel> guildInfos;
    public String introduceAvUrl;
    public String introduceImageUrl;
    public String labelTopPicture;
    public String labelTopWord;
    public String name;
    public String selectedCntTag;
    long serialVersionUID;

    public GProLabelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.introduceImageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.introduceAvUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.detailsImageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.detailsAvUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildInfos = new ArrayList<>();
        this.selectedCntTag = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelTopWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelTopPicture = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendJoinNumTag = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.content : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getDetailsAvUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.detailsAvUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getDetailsImageUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.detailsImageUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFriendJoinNumTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.friendJoinNumTag : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public ArrayList<GProGuildInfoInLabel> getGuildInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildInfos : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getIntroduceAvUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.introduceAvUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getIntroduceImageUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.introduceImageUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getLabelTopPicture() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.labelTopPicture : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getLabelTopWord() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.labelTopWord : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getSelectedCntTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.selectedCntTag : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProLabelInfo{name=" + this.name + ",introduceImageUrl=" + this.introduceImageUrl + ",introduceAvUrl=" + this.introduceAvUrl + ",detailsImageUrl=" + this.detailsImageUrl + ",detailsAvUrl=" + this.detailsAvUrl + ",content=" + this.content + ",guildInfos=" + this.guildInfos + ",selectedCntTag=" + this.selectedCntTag + ",labelTopWord=" + this.labelTopWord + ",labelTopPicture=" + this.labelTopPicture + ",friendJoinNumTag=" + this.friendJoinNumTag + ",}";
    }

    public GProLabelInfo(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<GProGuildInfoInLabel> arrayList, String str7, String str8, String str9, String str10) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, str4, str5, str6, arrayList, str7, str8, str9, str10});
            return;
        }
        this.serialVersionUID = 1L;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.introduceImageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.introduceAvUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.detailsImageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.detailsAvUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildInfos = new ArrayList<>();
        this.selectedCntTag = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelTopWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelTopPicture = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendJoinNumTag = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = str;
        this.introduceImageUrl = str2;
        this.introduceAvUrl = str3;
        this.detailsImageUrl = str4;
        this.detailsAvUrl = str5;
        this.content = str6;
        this.guildInfos = arrayList;
        this.selectedCntTag = str7;
        this.labelTopWord = str8;
        this.labelTopPicture = str9;
        this.friendJoinNumTag = str10;
    }
}
