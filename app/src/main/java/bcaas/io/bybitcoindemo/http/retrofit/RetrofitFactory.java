package bcaas.io.bybitcoindemo.http.retrofit;


import bcaas.io.bybitcoindemo.constants.APIURLConstants;
import bcaas.io.bybitcoindemo.constants.Constants;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author catherine.brainwilliam
 * @since 2018/8/20
 * <p>
 * 网络请求
 */
public class RetrofitFactory {

    private static Retrofit APIInstance;
    private static OkHttpClient client;

    private static void initClient() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .connectTimeout(Constants.ValueMaps.TIME_OUT_TIME_LONG, TimeUnit.SECONDS)
                    .readTimeout(Constants.ValueMaps.TIME_OUT_TIME_LONG, TimeUnit.SECONDS)
                    .writeTimeout(Constants.ValueMaps.TIME_OUT_TIME_LONG, TimeUnit.SECONDS)
                    .addInterceptor(new OkHttpInterceptor())
                    .build();
        }
    }

    /**
     * Application api
     *
     * @return
     */
    public static Retrofit getAPIInstance() {
        initClient();
        APIInstance = new Retrofit.Builder()
                .baseUrl(APIURLConstants.BaseUrl)
                .client(client)
                .addConverterFactory(new StringConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//Observable，暂时没用
                .build();
        return APIInstance;
    }

    //清空API请求
    public static void cleanAPI() {
        APIInstance = null;
    }

}
