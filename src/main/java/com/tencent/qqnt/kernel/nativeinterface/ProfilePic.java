package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ProfilePic.class */
public final class ProfilePic {
    public String picId;
    public int picTime;
    public HashMap<Integer, ProfilePicUrl> picUrlMap;

    public ProfilePic() {
        this.picId = "";
        this.picUrlMap = new HashMap<>();
    }

    public String getPicId() {
        return this.picId;
    }

    public int getPicTime() {
        return this.picTime;
    }

    public HashMap<Integer, ProfilePicUrl> getPicUrlMap() {
        return this.picUrlMap;
    }

    public String toString() {
        return "ProfilePic{picId=" + this.picId + ",picTime=" + this.picTime + ",picUrlMap=" + this.picUrlMap + ",}";
    }

    public ProfilePic(String str, int i, HashMap<Integer, ProfilePicUrl> hashMap) {
        this.picId = "";
        this.picUrlMap = new HashMap<>();
        this.picId = str;
        this.picTime = i;
        this.picUrlMap = hashMap;
    }
}
