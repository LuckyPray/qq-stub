package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStImage.class */
public final class GProStImage {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public int displayIndex;
    public int height;
    public String imageMD5;
    public boolean isGif;
    public boolean isOrig;
    public String layerPicUrl;
    public int origSize;
    public String patternId;
    public String picId;
    public String picUrl;
    public ArrayList<GProStImageUrl> vecImageUrlList;
    public int width;

    public GProStImage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.picUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vecImageUrlList = new ArrayList<>();
        this.picId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.busiData = new byte[0];
        this.imageMD5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.layerPicUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.patternId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public int getDisplayIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.displayIndex : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getImageMD5() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.imageMD5 : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public boolean getIsGif() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.isGif : ((Boolean) iPatchRedirector.redirect((short) 14, this)).booleanValue();
    }

    public boolean getIsOrig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.isOrig : ((Boolean) iPatchRedirector.redirect((short) 13, this)).booleanValue();
    }

    public String getLayerPicUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.layerPicUrl : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getOrigSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.origSize : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public String getPatternId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.patternId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getPicId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.picId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getPicUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.picUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProStImageUrl> getVecImageUrlList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.vecImageUrlList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProStImage{width=" + this.width + ",height=" + this.height + ",picUrl=" + this.picUrl + ",vecImageUrlList=" + this.vecImageUrlList + ",picId=" + this.picId + ",busiData=" + this.busiData + ",imageMD5=" + this.imageMD5 + ",layerPicUrl=" + this.layerPicUrl + ",patternId=" + this.patternId + ",displayIndex=" + this.displayIndex + ",origSize=" + this.origSize + ",isOrig=" + this.isOrig + ",isGif=" + this.isGif + ",}";
    }
}
