/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.client;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.gxb.sdk.exception.GxbApiException;
import com.gxb.sdk.param.GxbResponse;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Converter;

import java.io.*;
import java.nio.charset.Charset;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月22日 下午11:22:34
 */
public class GxbGsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final Logger logger = LoggerFactory.getLogger(GxbGsonResponseBodyConverter.class);
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    GxbGsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string();
        logger.debug("get GxbGsonResponseBody: {}", response);

        GxbResponse gxbResponse = gson.fromJson(response, GxbResponse.class);
        // 拦截所有业务错误
        if (!gxbResponse.isSuccess()) {
            value.close();
            throw new GxbApiException(gxbResponse.getErrorCode(), gxbResponse.getErrorMsg(), String.valueOf(gxbResponse.getData()));
        }
        MediaType contentType = value.contentType();
        Charset charset = contentType != null ? contentType.charset(Charset.forName("UTF-8")) : Charset.forName("UTF-8");
        InputStream inputStream = new ByteArrayInputStream(response.getBytes());
        Reader reader = new InputStreamReader(inputStream, charset);
        JsonReader jsonReader = gson.newJsonReader(reader);
        try {
            return adapter.read(jsonReader);
        } finally {
            value.close();
        }
    }
}
