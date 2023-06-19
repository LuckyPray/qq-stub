package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespFaceInfo extends JceStruct {
    static RespHead cache_stHeader;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    public int iFaceNum;
    public RespHead stHeader;
    public int uFaceTimeStamp;
    public ArrayList<FaceInfo> vFaceInfo;

    public RespFaceInfo() {
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

    public RespFaceInfo(RespHead respHead, int i2, ArrayList<FaceInfo> arrayList, int i3) {
        throw new RuntimeException("stub");
    }
}
