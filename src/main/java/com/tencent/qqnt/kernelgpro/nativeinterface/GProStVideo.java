package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStVideo.class */
public final class GProStVideo {
    static IPatchRedirector $redirector_;
    public int approvalStatus;
    public byte[] busiData;
    public GProStImage cover;
    public int displayIndex;
    public int duration;
    public String fileId;
    public int fileSize;
    public int height;
    public int isQuic;
    public int mediaQualityRank;
    public float mediaQualityScore;
    public int orientation;
    public String patternId;
    public String playUrl;
    public int transStatus;
    public ArrayList<GProStVideoUrl> vecVideoUrlList;
    public String videoMD5;
    public int videoPrior;
    public int videoRate;
    public int videoSource;
    public int width;

    public GProStVideo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.fileId = "";
        this.playUrl = "";
        this.vecVideoUrlList = new ArrayList<>();
        this.busiData = new byte[0];
        this.videoMD5 = "";
        this.cover = new GProStImage();
        this.patternId = "";
    }

    public int getApprovalStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.approvalStatus : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 12, this);
    }

    public GProStImage getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.cover : (GProStImage) iPatchRedirector.redirect((short) 20, this);
    }

    public int getDisplayIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.displayIndex : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
    }

    public int getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.duration : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getFileId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.fileId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getFileSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.fileSize : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getIsQuic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.isQuic : ((Integer) iPatchRedirector.redirect((short) 18, this)).intValue();
    }

    public int getMediaQualityRank() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.mediaQualityRank : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public float getMediaQualityScore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.mediaQualityScore : ((Float) iPatchRedirector.redirect((short) 16, this)).floatValue();
    }

    public int getOrientation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.orientation : ((Integer) iPatchRedirector.redirect((short) 19, this)).intValue();
    }

    public String getPatternId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.patternId : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getTransStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.transStatus : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public ArrayList<GProStVideoUrl> getVecVideoUrlList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.vecVideoUrlList : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public String getVideoMD5() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.videoMD5 : (String) iPatchRedirector.redirect((short) 17, this);
    }

    public int getVideoPrior() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.videoPrior : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getVideoRate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.videoRate : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getVideoSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.videoSource : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 23)) {
            return (String) iPatchRedirector.redirect((short) 23, this);
        }
        return "GProStVideo{fileId=" + this.fileId + ",fileSize=" + this.fileSize + ",duration=" + this.duration + ",width=" + this.width + ",height=" + this.height + ",playUrl=" + this.playUrl + ",transStatus=" + this.transStatus + ",videoPrior=" + this.videoPrior + ",videoRate=" + this.videoRate + ",vecVideoUrlList=" + this.vecVideoUrlList + ",busiData=" + this.busiData + ",approvalStatus=" + this.approvalStatus + ",videoSource=" + this.videoSource + ",mediaQualityRank=" + this.mediaQualityRank + ",mediaQualityScore=" + this.mediaQualityScore + ",videoMD5=" + this.videoMD5 + ",isQuic=" + this.isQuic + ",orientation=" + this.orientation + ",cover=" + this.cover + ",patternId=" + this.patternId + ",displayIndex=" + this.displayIndex + ",}";
    }
}
