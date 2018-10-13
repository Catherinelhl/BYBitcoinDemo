package bcaas.io.bybitcoindemo.tool.gson;

import org.json.JSONException;
import org.json.JSONObject;

import bcaas.io.bybitcoindemo.tool.StringTool;

/**
 * BcaasAndroid
 * <p>
 * io.bcaas.tools
 * <p>
 * created by catherine in 九月/04/2018/下午5:20
 * JSON 数据判断
 */
public class JsonTool {

    public static String getString(String resource, String key) {
        return getString(resource, key, (String) null);
    }

    public static String getString(String resource, String key, String value) {
        if (StringTool.isEmpty(resource)) {
            return value;
        } else if (StringTool.isEmpty(key)) {
            return value;
        } else {
            JSONObject jsonObject = null;

            try {
                jsonObject = new JSONObject(resource);
                return !jsonObject.has(key) ? value : jsonObject.getString(key);
            } catch (JSONException var5) {
                return value;
            }
        }
    }
}
