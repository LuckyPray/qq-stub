package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class SvcReqBindUin extends JceStruct {
    static ArrayList<BindUin> cache_vecBindUin;
    public byte cCmd;
    public ArrayList<BindUin> vecBindUin;

    public SvcReqBindUin() {
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

    public SvcReqBindUin(byte b2, ArrayList<BindUin> arrayList) {
        throw new RuntimeException("stub");
    }
}
