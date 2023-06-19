package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqDelFace extends JceStruct {
    static ReqHead cache_stHeader;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    public ReqHead stHeader;
    public int uFaceTimeStamp;
    public ArrayList<FaceInfo> vFaceInfo;

    public ReqDelFace() {
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

    public ReqDelFace(ReqHead reqHead, int i2, ArrayList<FaceInfo> arrayList) {
        throw new RuntimeException("stub");
    }
}
