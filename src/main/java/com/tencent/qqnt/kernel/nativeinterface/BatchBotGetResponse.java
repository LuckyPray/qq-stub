package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BatchBotGetResponse.class */
public final class BatchBotGetResponse {
    public ArrayList<CommonBotFeatures> botFeatures = new ArrayList<>();
    public int nextPage;

    public ArrayList<CommonBotFeatures> getBotFeatures() {
        return this.botFeatures;
    }

    public int getNextPage() {
        return this.nextPage;
    }

    public String toString() {
        return "BatchBotGetResponse{botFeatures=" + this.botFeatures + ",nextPage=" + this.nextPage + ",}";
    }
}
