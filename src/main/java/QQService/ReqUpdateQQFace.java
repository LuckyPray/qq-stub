package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqUpdateQQFace extends JceStruct {
    static FaceInfo cache_stFaceInfo;
    static ReqHead cache_stHeader;
    public int bPicType;
    public FaceInfo stFaceInfo;
    public ReqHead stHeader;

    public ReqUpdateQQFace() {
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

    public ReqUpdateQQFace(ReqHead reqHead, FaceInfo faceInfo, int i2) {
        throw new RuntimeException("stub");
    }
}
