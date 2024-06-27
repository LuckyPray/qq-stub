package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CheckImageResult.class */
public final class CheckImageResult {
    public int code;
    public ArrayList<PicMaterial> picMaterials = new ArrayList<>();

    public int getCode() {
        return this.code;
    }

    public ArrayList<PicMaterial> getPicMaterials() {
        return this.picMaterials;
    }

    public String toString() {
        return "CheckImageResult{code=" + this.code + ",picMaterials=" + this.picMaterials + ",}";
    }
}
