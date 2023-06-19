package NS_MINI_INTERFACE;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

/* compiled from: P */
/* loaded from: classes.dex */
public final class INTERFACE$StAddressInfo extends MessageMicro<INTERFACE$StAddressInfo> {
    static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 18, 26}, new String[]{"country", "province", "city"}, new Object[]{"", "", ""}, INTERFACE$StAddressInfo.class);
    public final PBStringField country = PBField.initString("");
    public final PBStringField province = PBField.initString("");
    public final PBStringField city = PBField.initString("");
}
