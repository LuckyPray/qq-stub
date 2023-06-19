package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqCreateDiscuss extends JceStruct {
    static int cache_DiscussType;
    static ArrayList<AddDiscussMemberInfo> cache_Members;
    public int DiscussType;
    public ArrayList<AddDiscussMemberInfo> Members;
    public String Name;
    public String Nick;
    public int Refer;

    public ReqCreateDiscuss() {
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

    public ReqCreateDiscuss(String str, ArrayList<AddDiscussMemberInfo> arrayList, int i2, String str2, int i3) {
        throw new RuntimeException("stub");
    }
}
