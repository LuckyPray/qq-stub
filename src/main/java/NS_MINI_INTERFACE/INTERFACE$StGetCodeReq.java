package NS_MINI_INTERFACE;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

/* compiled from: P */
/* loaded from: classes.dex */
public final class INTERFACE$StGetCodeReq extends MessageMicro<INTERFACE$StGetCodeReq> {
    static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10}, new String[]{"appid"}, new Object[]{""}, INTERFACE$StGetCodeReq.class);
    public final PBStringField appid = PBField.initString("");
}
