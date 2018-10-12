package bcaas.io.bybitcoindemo.constants;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 */
public class APIURLConstants {

    //https://chain.api.btc.com/v3/block/3
    public static final String BaseUrl = "https://chain.api.btc.com";
    public static final String UrlServerType = "/v3";


    public static final String transaction = "v3/block/latest/tx?verbose=2";
    //区块信息 GET /block/{xxx}
    public static final String block = "/block/1";
    //根据日期获取交易列表，按照倒序排列 block/date/{ymd}
    public static final String blockList = "/block/1";
    public static final String address = "";
    public static final String unspent = "";

}
