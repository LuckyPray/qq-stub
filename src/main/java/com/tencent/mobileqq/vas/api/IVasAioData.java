package com.tencent.mobileqq.vas.api;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

public class IVasAioData {
    /* compiled from: P */
    /* loaded from: classes5.dex */
    public static final class VasAioMsgData {
        static IPatchRedirector $redirector_;
        private int avatarId;
        private int bubbleDiyTextId;
        private int bubbleId;
        private int bubbleVoiceId;
        private int canConvertToText;

        @NotNull
        private ArrayList<Integer> carouselNamePlateIds;
        private int diyFontCfgUpdateTime;
        private int diyFontImageId;
        private int extendNamePlateId;
        private int fontId;
        private int gameNamePlateId;
        private int grayNamePlate;
        private int isIceBreakMsg;
        private int magicFontType;
        private int msgBigClubFlag;
        private int msgBigClubLevel;
        private int msgVipLevel;
        private int msgVipType;
        private int namePlateId;
        private int namePlateType;
        private int pendantDiyInfoId;
        private long pendantId;
        private int subBubbleId;
        private long subFontId;
        private int templateID;
        private int vipStarFlag;

        public VasAioMsgData() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 53)) {
                this.carouselNamePlateIds = new ArrayList<>();
            } else {
                iPatchRedirector.redirect((short) 53, (Object) this);
            }
        }

        public final int getAvatarId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) ? this.avatarId : ((Integer) iPatchRedirector.redirect((short) 33, (Object) this)).intValue();
        }

        public final int getBubbleDiyTextId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.bubbleDiyTextId : ((Integer) iPatchRedirector.redirect((short) 25, (Object) this)).intValue();
        }

        public final int getBubbleId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.bubbleId : ((Integer) iPatchRedirector.redirect((short) 23, (Object) this)).intValue();
        }

        public final int getBubbleVoiceId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.bubbleVoiceId : ((Integer) iPatchRedirector.redirect((short) 27, (Object) this)).intValue();
        }

        public final int getCanConvertToText() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.canConvertToText : ((Integer) iPatchRedirector.redirect((short) 31, (Object) this)).intValue();
        }

        @NotNull
        public final ArrayList<Integer> getCarouselNamePlateIds() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.carouselNamePlateIds : (ArrayList) iPatchRedirector.redirect((short) 17, (Object) this);
        }

        public final int getDiyFontCfgUpdateTime() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) ? this.diyFontCfgUpdateTime : ((Integer) iPatchRedirector.redirect((short) 43, (Object) this)).intValue();
        }

        public final int getDiyFontImageId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 45)) ? this.diyFontImageId : ((Integer) iPatchRedirector.redirect((short) 45, (Object) this)).intValue();
        }

        public final int getExtendNamePlateId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.extendNamePlateId : ((Integer) iPatchRedirector.redirect((short) 19, (Object) this)).intValue();
        }

        public final int getFontId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) ? this.fontId : ((Integer) iPatchRedirector.redirect((short) 39, (Object) this)).intValue();
        }

        public final int getGameNamePlateId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.gameNamePlateId : ((Integer) iPatchRedirector.redirect((short) 21, (Object) this)).intValue();
        }

        public final int getGrayNamePlate() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.grayNamePlate : ((Integer) iPatchRedirector.redirect((short) 9, (Object) this)).intValue();
        }

        public final int getMagicFontType() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 47)) ? this.magicFontType : ((Integer) iPatchRedirector.redirect((short) 47, (Object) this)).intValue();
        }

        public final int getMsgBigClubFlag() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msgBigClubFlag : ((Integer) iPatchRedirector.redirect((short) 5, (Object) this)).intValue();
        }

        public final int getMsgBigClubLevel() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.msgBigClubLevel : ((Integer) iPatchRedirector.redirect((short) 7, (Object) this)).intValue();
        }

        public final int getMsgVipLevel() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.msgVipLevel : ((Integer) iPatchRedirector.redirect((short) 3, (Object) this)).intValue();
        }

        public final int getMsgVipType() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) ? this.msgVipType : ((Integer) iPatchRedirector.redirect((short) 1, (Object) this)).intValue();
        }

        public final int getNamePlateId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.namePlateId : ((Integer) iPatchRedirector.redirect((short) 15, (Object) this)).intValue();
        }

        public final int getNamePlateType() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.namePlateType : ((Integer) iPatchRedirector.redirect((short) 11, (Object) this)).intValue();
        }

        public final int getPendantDiyInfoId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) ? this.pendantDiyInfoId : ((Integer) iPatchRedirector.redirect((short) 37, (Object) this)).intValue();
        }

        public final long getPendantId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) ? this.pendantId : ((Long) iPatchRedirector.redirect((short) 35, (Object) this)).longValue();
        }

        public final int getSubBubbleId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.subBubbleId : ((Integer) iPatchRedirector.redirect((short) 29, (Object) this)).intValue();
        }

        public final long getSubFontId() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) ? this.subFontId : ((Long) iPatchRedirector.redirect((short) 41, (Object) this)).longValue();
        }

        public final int getTemplateID() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 49)) ? this.templateID : ((Integer) iPatchRedirector.redirect((short) 49, (Object) this)).intValue();
        }

        public final int getVipStarFlag() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.vipStarFlag : ((Integer) iPatchRedirector.redirect((short) 13, (Object) this)).intValue();
        }

        public final int isIceBreakMsg() {
            IPatchRedirector iPatchRedirector = $redirector_;
            return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 51)) ? this.isIceBreakMsg : ((Integer) iPatchRedirector.redirect((short) 51, (Object) this)).intValue();
        }

        public final void setAvatarId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) {
                this.avatarId = i2;
            } else {
                iPatchRedirector.redirect((short) 34, (Object) this, i2);
            }
        }

        public final void setBubbleDiyTextId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
                this.bubbleDiyTextId = i2;
            } else {
                iPatchRedirector.redirect((short) 26, (Object) this, i2);
            }
        }

        public final void setBubbleId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
                this.bubbleId = i2;
            } else {
                iPatchRedirector.redirect((short) 24, (Object) this, i2);
            }
        }

        public final void setBubbleVoiceId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) {
                this.bubbleVoiceId = i2;
            } else {
                iPatchRedirector.redirect((short) 28, (Object) this, i2);
            }
        }

        public final void setCanConvertToText(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
                this.canConvertToText = i2;
            } else {
                iPatchRedirector.redirect((short) 32, (Object) this, i2);
            }
        }

        public final void setCarouselNamePlateIds(@NotNull ArrayList<Integer> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
                iPatchRedirector.redirect((short) 18, (Object) this, (Object) arrayList);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                this.carouselNamePlateIds = arrayList;
            }
        }

        public final void setDiyFontCfgUpdateTime(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) {
                this.diyFontCfgUpdateTime = i2;
            } else {
                iPatchRedirector.redirect((short) 44, (Object) this, i2);
            }
        }

        public final void setDiyFontImageId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 46)) {
                this.diyFontImageId = i2;
            } else {
                iPatchRedirector.redirect((short) 46, (Object) this, i2);
            }
        }

        public final void setExtendNamePlateId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
                this.extendNamePlateId = i2;
            } else {
                iPatchRedirector.redirect((short) 20, (Object) this, i2);
            }
        }

        public final void setFontId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) {
                this.fontId = i2;
            } else {
                iPatchRedirector.redirect((short) 40, (Object) this, i2);
            }
        }

        public final void setGameNamePlateId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
                this.gameNamePlateId = i2;
            } else {
                iPatchRedirector.redirect((short) 22, (Object) this, i2);
            }
        }

        public final void setGrayNamePlate(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
                this.grayNamePlate = i2;
            } else {
                iPatchRedirector.redirect((short) 10, (Object) this, i2);
            }
        }

        public final void setIceBreakMsg(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 52)) {
                this.isIceBreakMsg = i2;
            } else {
                iPatchRedirector.redirect((short) 52, (Object) this, i2);
            }
        }

        public final void setMagicFontType(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 48)) {
                this.magicFontType = i2;
            } else {
                iPatchRedirector.redirect((short) 48, (Object) this, i2);
            }
        }

        public final void setMsgBigClubFlag(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
                this.msgBigClubFlag = i2;
            } else {
                iPatchRedirector.redirect((short) 6, (Object) this, i2);
            }
        }

        public final void setMsgBigClubLevel(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
                this.msgBigClubLevel = i2;
            } else {
                iPatchRedirector.redirect((short) 8, (Object) this, i2);
            }
        }

        public final void setMsgVipLevel(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
                this.msgVipLevel = i2;
            } else {
                iPatchRedirector.redirect((short) 4, (Object) this, i2);
            }
        }

        public final void setMsgVipType(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
                this.msgVipType = i2;
            } else {
                iPatchRedirector.redirect((short) 2, (Object) this, i2);
            }
        }

        public final void setNamePlateId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
                this.namePlateId = i2;
            } else {
                iPatchRedirector.redirect((short) 16, (Object) this, i2);
            }
        }

        public final void setNamePlateType(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
                this.namePlateType = i2;
            } else {
                iPatchRedirector.redirect((short) 12, (Object) this, i2);
            }
        }

        public final void setPendantDiyInfoId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) {
                this.pendantDiyInfoId = i2;
            } else {
                iPatchRedirector.redirect((short) 38, (Object) this, i2);
            }
        }

        public final void setPendantId(long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) {
                this.pendantId = j2;
            } else {
                iPatchRedirector.redirect((short) 36, (Object) this, j2);
            }
        }

        public final void setSubBubbleId(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) {
                this.subBubbleId = i2;
            } else {
                iPatchRedirector.redirect((short) 30, (Object) this, i2);
            }
        }

        public final void setSubFontId(long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) {
                this.subFontId = j2;
            } else {
                iPatchRedirector.redirect((short) 42, (Object) this, j2);
            }
        }

        public final void setTemplateID(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 50)) {
                this.templateID = i2;
            } else {
                iPatchRedirector.redirect((short) 50, (Object) this, i2);
            }
        }

        public final void setVipStarFlag(int i2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
                this.vipStarFlag = i2;
            } else {
                iPatchRedirector.redirect((short) 14, (Object) this, i2);
            }
        }
    }


}
