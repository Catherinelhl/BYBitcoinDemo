package bcaas.io.bybitcoindemo.tool.gson;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

import bcaas.io.bybitcoindemo.tool.StringTool;
import okhttp3.MediaType;
import okhttp3.RequestBody;


/**
 * @author catherine.brainwilliam
 * @since 2018/8/16
 */
public class GsonTool {

    public GsonTool() {
    }

    /*将对象转换为String*/
    public static String string(Object o) {
        Gson gson = getGson();
        return gson.toJson(o);
    }

    /*通过传入的key得到相应的数组数据*/
    public static <T> T getListByKey(String resource, String key, Type type) {
        Gson gson = getGson();
        String value = JsonTool.getString(resource, key);
        return !StringTool.isEmpty(value) && !StringTool.equals("[]", value.replace(" ", "")) ? gson.fromJson(value, type) : null;
    }

    /*通过传入的key得到相应的数据*/
    public static <T> T getBeanByKey(String resource, String key, Type type) {
        Gson gson = getGson();
        String value = JsonTool.getString(resource, key);
        return StringTool.isEmpty(value) ? null : gson.fromJson(value, type);
    }

    /*解析数据是object的情况*/
    public static <T> T convert(String str, Class<T> cls) throws JsonSyntaxException {
        Gson gson = getGson();
        return gson.fromJson(str, cls);
    }

    public static <T> T convert(String str, Type type) throws JsonSyntaxException {
        Gson gson = getGson();
        return gson.fromJson(str, type);
    }

//    /*   encryption request bean*/
//    public static <T> String AESJsonBean(T jsonBean) {
//        if (jsonBean == null) {
//            throw new NullPointerException("AESJsonBean jsonBean is null");
//        }
//        String json = GsonTool.string(jsonBean);
//        // encryption
//        String encodeJson = null;
//        try {
//            encodeJson = AESTool.encodeCBC_128(json);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return encodeJson;
//    }

    public static RequestBody stringToRequestBody(String str) {
        if (StringTool.isEmpty(str)) return null;
        return RequestBody.create(MediaType.parse("application/json"), str);
    }
//
//    public static <T> RequestBody beanToRequestBody(T jsonBean) {
//        String str = AESJsonBean(jsonBean);
//        if (StringTool.isEmpty(str)) {
//            throw new NullPointerException("beanToRequestBody str is null");
//        }
//        return RequestBody.create(MediaType.parse("application/json"), str);
//}

    public static Gson getGson() {
        return new GsonBuilder()
                .disableHtmlEscaping()
                .create();
    }
}
