package com.qq.taf.jce;

import java.nio.ByteBuffer;

/**
 * 
 * <b>功能：比较临时的代码，用来查找JceOutputStream在reserve(int len)时会出现IllegalArgumentException的问题</b><br>
 * <br>
 * <b>完整路径：</b> com.qq.taf.jce.OnIllegalArgumentException <br>
 * <b>创建日期：</b> 2013-7-2 上午11:32:10 <br>
 * 
 * @author <a href="mailto:markzhang@tencent.com">markzhang</a><br>
 *         <a href="http://www.tencent.com">Shenzhen Tencent Co.,Ltd.</a>
 * @version 1.0, 2013-7-2
 * @since MQzone V1.0
 */
public interface OnIllegalArgumentException
{

	public void onException(IllegalArgumentException e, ByteBuffer bs, int oldLen, int newLen);
}
