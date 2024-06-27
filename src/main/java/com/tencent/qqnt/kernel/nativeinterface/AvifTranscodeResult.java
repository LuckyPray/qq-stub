package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AvifTranscodeResult.class */
public final class AvifTranscodeResult {
    public Integer detailErrno;
    public Boolean genAioResult;
    public AvifTranscodeStep transcodeStep;

    public AvifTranscodeResult() {
        this.transcodeStep = AvifTranscodeStep.values()[0];
    }

    public Integer getDetailErrno() {
        return this.detailErrno;
    }

    public Boolean getGenAioResult() {
        return this.genAioResult;
    }

    public AvifTranscodeStep getTranscodeStep() {
        return this.transcodeStep;
    }

    public String toString() {
        return "AvifTranscodeResult{transcodeStep=" + this.transcodeStep + ",detailErrno=" + this.detailErrno + ",genAioResult=" + this.genAioResult + ",}";
    }

    public AvifTranscodeResult(AvifTranscodeStep avifTranscodeStep, Integer num, Boolean bool) {
        this.transcodeStep = AvifTranscodeStep.values()[0];
        this.transcodeStep = avifTranscodeStep;
        this.detailErrno = num;
        this.genAioResult = bool;
    }
}
