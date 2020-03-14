package com.abhishek.onlineofflinequizapp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by delaroy on 4/30/18.
 */

public class DataServiceGenerator {
    public static <S> S createService(Class<S> serviceClass) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://server.mrkzevar.com/uaa/");

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request newRequest  = chain.request().newBuilder()
                        .addHeader("Authorization", "bearer " +"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODQyNTU2MTMsInVzZXJfbmFtZSI6IlN1cHBvcnRAbXJrbGxwLmNvbSIsImF1dGhvcml0aWVzIjpbIlJPTEVfV0hPTEVTQUxFUiJdLCJqdGkiOiJlZGU0NjMzZC02N2Q2LTQ5ZjItODY2Mi01MDRmMzYxMGFjNWIiLCJjbGllbnRfaWQiOiJvcmRvZnktd2ViIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl19.e09kLcQoZPoZ82XDpND4YPOVw0u9Lra06Pk09PYYDakz-zXaibnpIDafaanBvx5PIF7A9F5WWJPdjrF0A-LV2Ks1e8JBn1Oo2vXU6es8jCLjmvxSbHQSBYA-mSWiCAkUmcSEIUDkS0Pn1Vg50avP6PPYg-3Yw0_aMMw-Z6ryG4VlV76W2gff0WqDr_LlonVnjcXyHd19831ludM2C7ZCWkq1G9oITTgxDxwKTasnnhMbOGt7C0_2qtasx0hTBeXOw0hShUpyM63maWtuAyrAUKUYdGSPusiRJbfkIaFUpWV7gqXqGkjGfSI8UIB2FKH9TkwdH7rQkeQcj29lwSKo2Q")
                        .build();
                return chain.proceed(newRequest);

            }
        })
                .readTimeout(90, TimeUnit.SECONDS)
                .connectTimeout(90, TimeUnit.SECONDS)
                .writeTimeout(90, TimeUnit.SECONDS)
                .cache(null);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor()

                    .setLevel(HttpLoggingInterceptor.Level.BODY);

            httpClient.addInterceptor(logging);
        }

        builder.client(httpClient.build());
        Retrofit retrofit = builder.build();
        return  retrofit.create(serviceClass);
    }


}
