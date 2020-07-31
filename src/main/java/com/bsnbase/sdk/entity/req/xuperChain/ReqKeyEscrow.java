package com.bsnbase.sdk.entity.req.xuperChain;

import com.bsnbase.sdk.entity.base.IBody;
import lombok.Data;

/**
 * 密钥托管模式请求参数
 */
@Data
public class ReqKeyEscrow implements IBody  {
    String userId;
	String userAddr;
    String contractName;
    String funcName;
    String funcParam;
	@Override
	public String getEncryptionValue() {

		String str = (this.userId == null ? "" : this.userId);
		str += (this.userAddr == null ? "" : this.userAddr);
		str += (this.contractName == null ? "" : this.contractName);
		str += (this.funcName == null ? "" : this.funcName);
		str += (this.funcParam == null ? "" : this.funcParam);
		return str;
	}
}
