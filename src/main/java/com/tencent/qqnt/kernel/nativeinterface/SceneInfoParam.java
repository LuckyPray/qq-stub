package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SceneInfoParam.class */
public final class SceneInfoParam {
    public int sceneType;

    public SceneInfoParam() {
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public String toString() {
        return "SceneInfoParam{sceneType=" + this.sceneType + ",}";
    }

    public SceneInfoParam(int i) {
        this.sceneType = i;
    }
}
