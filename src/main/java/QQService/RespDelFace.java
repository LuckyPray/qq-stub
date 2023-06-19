package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespDelFace extends JceStruct {
    static RespHead cache_stHeader;
    public int iFaceNum;
    public RespHead stHeader;
    public int uFaceTimeStamp;

    public RespDelFace() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public RespDelFace(RespHead respHead, int i2, int i3) {
        throw new RuntimeException("stub");
    }
}
