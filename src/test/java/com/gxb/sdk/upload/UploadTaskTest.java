package com.gxb.sdk.upload;

import com.gxb.sdk.api.UploadApi;
import com.gxb.sdk.client.GxbApiFactory;
import com.gxb.sdk.param.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;

import java.io.File;
import java.util.UUID;

/**
 * Created by yaojun on 2019/6/25.
 */
public class UploadTaskTest {
    private static final Logger logger = LoggerFactory.getLogger(UploadTaskTest.class);

    {
        try {
            System.setProperty("javax.net.ssl.trustStore", new File("cacerts/cacerts").getAbsolutePath());
        } catch (Exception e) {
            logger.warn("init cacerts...");
        }
    }

    protected GxbApiFactory gxbApiFactory = GxbApiFactory.builder().baseUrl("https://prod.gxb.io/datamatrix/").build();;
    /**
     * 此处请使用开户时创建的appid和appSercet，不然无法上传成功
     */
    protected String appId = "gxba57f21312fe2dfa";
    protected String appSercet = "2d1844d9d213123231235c4f8de";


    protected static UploadParam getUploadParm() {
        // 商户自定义授权流水标示，最长32位
        String sequenceNo = UUID.randomUUID().toString().replace("-", "");
        //需要上传的数据
        String uploadData = "";
        SourceTypeEnum sourceTypeEnum = SourceTypeEnum.GXB;
        return new UploadParam(sequenceNo, "xiaobao_scorepro", System.currentTimeMillis(), "zhangsan", "18258171452", "330682199011221410", uploadData, sourceTypeEnum.getSourceType());
    }

    @Test
    public void doUploadOperatorTask() throws Exception {
        DataTypeEnum dataTypeEnum = DataTypeEnum.OPERATOR;
        UploadParam parm = getUploadParm();
        UploadApi uploadApi = gxbApiFactory.newApi(UploadApi.class);
        Response<GxbResponse<String>> response =
                uploadApi.uploadData(dataTypeEnum.getDataType(), UploadData.builder(appId, appSercet, parm.getSequenceNo(), System.currentTimeMillis(), "xiaobao_scorepro")
                        .mobile(parm.getMobile()).name(parm.getName()).idcard(parm.getIdcard()).data(parm.getData()).source(parm.getSource()).build()).execute();
        boolean isUploadSuccess = response.body().isSuccess();
        logger.info("上传是否成功: " + isUploadSuccess);
    }
}