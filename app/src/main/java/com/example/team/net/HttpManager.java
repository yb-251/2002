package com.example.team.net;

import android.util.Log;


import com.example.team.utils.SpUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class HttpManager {
    private static HttpManager instance;

    public  static HttpManager getInstance(){
        if(instance == null){
            synchronized(HttpManager.class){
                if(instance == null){
                    instance = new HttpManager();
                }
            }
        }
        return instance;
    }

//    private ServiceApi serviceApi;
//    private ChannelApi channelApi;
//    private BrandApi brandApi;
//    private ShopApi shopApi;
//    private SortApi sortApi;
//
//
//
//    private Retrofit getRetrofit(String url){
//        Retrofit retrofit = new Retrofit.Builder().baseUrl(url)
//                .client(getOkHttpClient())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        return retrofit;
//    }
//
//    private OkHttpClient getOkHttpClient(){
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .connectTimeout(60, TimeUnit.SECONDS)
//                .readTimeout(60,TimeUnit.SECONDS)
//                .addInterceptor(new LoggingInterceptor())
//                .addInterceptor(new HeaderInterceptor())
//                .build();
//        return okHttpClient;
//    }
//
//    static class LoggingInterceptor implements Interceptor {
//
//        @Override
//        public Response intercept(Chain chain) throws IOException {
//            Request request = chain.request();
//            Response response = chain.proceed(request);
//            ResponseBody responseBody = response.peekBody(Integer.MAX_VALUE);
//            Log.i("responseBody",responseBody.string());
//            return response;
//        }
//    }
//
//    /**
//     * 拦截的头处理
//     */
//    static class HeaderInterceptor implements Interceptor{
//
//        @Override
//        public Response intercept(Chain chain) throws IOException {
//            Request request = chain.request().newBuilder()
//                    .addHeader("Authorization","APPCODE 964e16aa1ae944e9828e87b8b9fbd30a")
//                    .addHeader("X-Nideshop-Token", SpUtils.getInstance().getString("token"))
//                    .build();
//            return chain.proceed(request);
//        }
//    }
//
//
//    /**
//     * ServiceApi
//     * @return
//     */
//    public ServiceApi getService(){
//        if(serviceApi == null){
//            serviceApi = getRetrofit(ServiceApi.BASE_URL).create(ServiceApi.class);
//        }
//        return serviceApi;
//    }
//
//    public ChannelApi getChannelApi(){
//        if(channelApi == null){
//            channelApi = getRetrofit(channelApi.base_url).create(ChannelApi.class);
//        }
//        return channelApi;
//    }
//    public BrandApi getBrandApi(){
//        if (brandApi==null){
//            brandApi=getRetrofit(brandApi.base_url).create(BrandApi.class);
//        }
//        return brandApi;
//    }
//    public ShopApi getShopApi() {
//        if (shopApi==null){
//            shopApi=getRetrofit(shopApi.BASE_URL).create(ShopApi.class);
//        }
//        return shopApi;
//    }
//    public SortApi getSortApi() {
//        if (sortApi==null){
//            sortApi=getRetrofit(sortApi.BASE_URL).create(SortApi.class);
//        }
//        return sortApi;
//    }

}
