package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class PrivilegeBaseInfo extends JceStruct {
    static ArrayList<PrivilegeInfo> cache_vClosePriv;
    static ArrayList<PrivilegeInfo> cache_vOpenPriv = new ArrayList<>();
    public String strJumpUrl;
    public String strMsg;
    public ArrayList<PrivilegeInfo> vClosePriv;
    public ArrayList<PrivilegeInfo> vOpenPriv;

    static {
        cache_vOpenPriv.add(new PrivilegeInfo());
        cache_vClosePriv = new ArrayList<>();
        cache_vClosePriv.add(new PrivilegeInfo());
    }

    public PrivilegeBaseInfo() {
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

    public PrivilegeBaseInfo(String str, String str2, ArrayList<PrivilegeInfo> arrayList, ArrayList<PrivilegeInfo> arrayList2) {
        throw new RuntimeException("stub");
    }
}
