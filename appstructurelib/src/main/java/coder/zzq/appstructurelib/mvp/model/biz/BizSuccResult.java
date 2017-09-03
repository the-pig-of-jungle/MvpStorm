package coder.zzq.appstructurelib.mvp.model.biz;


import coder.zzq.appstructurelib.http.IResponseData;

/**
 * Created by 朱志强 on 2017/4/29.
 */

public class BizSuccResult{
    private int mBizTag;
    private IResponseData mResponseData;
    private byte[] mSecretKey;

    public BizSuccResult(int bizTag, IResponseData responseData,byte[] secretKey) {
        mBizTag = bizTag;
        mResponseData = responseData;
        mSecretKey = secretKey;
    }


    public int getBizTag() {
        return mBizTag;
    }

    public void setBizTag(int bizTag) {
        mBizTag = bizTag;
    }

    public <T> IResponseData<T> getResponseData(Class<T> dataType) {
        return mResponseData;
    }

    public void setResponseData(IResponseData responseData) {
        mResponseData = responseData;
    }

    public byte[] getSecretKey() {
        return mSecretKey;
    }

    public void setSecretKey(byte[] mSecretKey) {
        this.mSecretKey = mSecretKey;
    }
}
