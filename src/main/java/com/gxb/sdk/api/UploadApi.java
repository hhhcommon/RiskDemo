package com.gxb.sdk.api;

import com.gxb.sdk.param.GxbResponse;
import com.gxb.sdk.param.UploadData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by yaojun on 2019/6/25.
 */
public interface UploadApi {
    @POST("risk/upload/{type}")
    Call<GxbResponse<String>> uploadData(@Path("type") String type, @Body UploadData uploadData);
}
