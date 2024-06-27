package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RMCodecAbility.class */
public final class RMCodecAbility {
    public PttFormatType audioCodecFormat;
    public RMCodecType codecType;
    public Integer pictureFormat;
    public VideoCodecFormatType videoCodecFormat;

    public RMCodecAbility() {
        this.codecType = RMCodecType.values()[0];
    }

    public PttFormatType getAudioCodecFormat() {
        return this.audioCodecFormat;
    }

    public RMCodecType getCodecType() {
        return this.codecType;
    }

    public Integer getPictureFormat() {
        return this.pictureFormat;
    }

    public VideoCodecFormatType getVideoCodecFormat() {
        return this.videoCodecFormat;
    }

    public String toString() {
        return "RMCodecAbility{pictureFormat=" + this.pictureFormat + ",videoCodecFormat=" + this.videoCodecFormat + ",audioCodecFormat=" + this.audioCodecFormat + ",codecType=" + this.codecType + ",}";
    }

    public RMCodecAbility(Integer num, VideoCodecFormatType videoCodecFormatType, PttFormatType pttFormatType, RMCodecType rMCodecType) {
        this.codecType = RMCodecType.values()[0];
        this.pictureFormat = num;
        this.videoCodecFormat = videoCodecFormatType;
        this.audioCodecFormat = pttFormatType;
        this.codecType = rMCodecType;
    }
}
