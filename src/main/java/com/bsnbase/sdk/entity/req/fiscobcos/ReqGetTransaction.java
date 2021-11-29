package com.bsnbase.sdk.entity.req.fiscobcos;

import com.bsnbase.sdk.entity.base.IBody;
import lombok.Data;

/**
 * Request parameters of FISCO-BCOS get transaction information interface
 */
@Data
public class ReqGetTransaction implements IBody {
    /**
     * Transaction hash
     */
    String txHash;

    @Override
    public String getEncryptionValue() {
        return (this.txHash == null ? "" : this.txHash);
    }
}
