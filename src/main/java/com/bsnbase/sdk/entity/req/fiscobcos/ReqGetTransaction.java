package com.bsnbase.sdk.entity.req.fiscobcos;

import com.bsnbase.sdk.entity.base.IBody;
import lombok.Data;

@Data
public class ReqGetTransaction implements IBody  {
    String txHash;
	@Override
	public String getEncryptionValue() {
		return (this.txHash == null? "":this.txHash);
	}
}
