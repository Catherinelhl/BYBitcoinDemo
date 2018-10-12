package bcaas.io.bybitcoindemo.http;


import bcaas.io.bybitcoindemo.json.ResponseJson;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 * <p>
 * 请求网络的所有接口
 */
public interface HttpApi {

    /**
     * 解码交易
     * 解码 transaction 信息
     */
    @POST("/v3/tools/tx-decode")
    Call<ResponseJson> decodeTransaction();


    /**
     * 发布交易
     * 向全网广播您的交易
     *
     * @return
     */
    @POST("/v3/tools/tx-publish")
    Call<ResponseJson> publicTransaction();


    /**
     * 验证签名
     * {
     * "address": "address",
     * "message": "message",
     * "signature": "signature"
     * }
     */

    @POST("/v3/tools/verify-message")
    Call<ResponseJson> verifyMessage();

    /**
     * 获取单个区块详情
     *
     * @return xxx可以是：
     * <p>
     * 块高度
     * 块哈希
     * latest - 最新块
     * 示例
     * 返回高度为 3 的块
     * <p>
     * https://chain.api.btc.com/v3/block/3
     * <p>
     * 返回最新块
     * <p>
     * https://chain.api.btc.com/v3/block/latest
     * <p>
     * 返回最新块、高度为 3 的块
     * <p>
     * https://chain.api.btc.com/v3/block/latest,3
     */
    @GET("/v3/block/{xxx}")
    Call<ResponseJson> getBlock(@Path("xxx") String block);

    /**
     * 获取区块列表
     *
     * @param ymd 获取2015年12月15日的区块列表
     *            <p>
     *            https://chain.api.btc.com/v3/block/date/20151215
     */
    @GET("/v3/block/date/{ymd}")
    Call<ResponseJson> getBlockListByDate(@Path("ymd") String ymd);

    /**
     * 获取交易信息
     * 由于部分交易体积很大，为提高传输效率，所有涉及到交易的接口，均支持交易信息的分级输出
     *
     * @param verbose 可选，默认为2，选择输出内容等级，含义分别如下：
     *                <p>
     *                等级 1，包含交易信息；
     *                等级 2，包含等级 1、交易的输入、输出地址与金额；
     *                等级 3，包含等级 2、交易的输入、输入 script 等信息。
     */
    @GET("/v3/block/latest/tx")
    Call<ResponseJson> getTransaction(@Query("verbose") int verbose);

    /**
     * 获取区块交易列表
     * 注意：该接口不支持批量查询。
     * <p>
     * 参数：
     * <p>
     * page，可选，默认为1，页码
     * pagesize，可选，默认为50，可选范围为1-50，分页大小
     * 示例
     * 返回最新块的交易列表
     * <p>
     * https://chain.api.btc.com/v3/block/latest/tx
     * <p>
     * 返回单个块的交易列表
     * <p>
     * https://chain.api.btc.com/v3/block/3/tx
     */

    @GET("/v3/block/{xxx}/tx")
    Call<ResponseJson> getBlockTransactionList(@Path("xxx") int pageSize);


    /**
     * 获取交易详情
     * 在获取多个交易时，如果对应的交易不存在，则为null。
     * <p>
     * 示例
     * 获取单个交易的全部信息
     * <p>
     * https://chain.api.btc.com/v3/tx/0eab89a271380b09987bcee5258fca91f28df4dadcedf892658b9bc261050d96?verbose=3
     * <p>
     * 获取多个交易
     * <p>
     * https://chain.api.btc.com/v3/tx/000000000000000005cb6f6e2f09e84a353ab91756a38aa50fbaf25059f76666,0ba9252660a6a5f291a8983092074f9a1da5f6d1c790518d6550f054e60bbab1
     */
    @GET("/v3/tx/{txhash}")
    Call<ResponseJson> getTransactionDetail(@Path("txhash") String txHash);

    /**
     * 未确认交易的哈希
     * https://chain.api.btc.com/v3/tx/unconfirmed
     */
    @GET("/v3/tx/unconfirmed")
    Call<ResponseJson> getUnconfirmed();


    /**
     * 未确认交易信息
     * 获取未确认交易的信息，包括体积和数量
     * <p>
     * https://chain.api.btc.com/v3/tx/unconfirmed/summary?_ga=2.70530640.1311644878.1539229743-466148789.1539229743
     */
    @GET("/v3/tx/unconfirmed/summary")
    Call<ResponseJson> getUnconfirmedSummary();

    /**
     * 获取地址的信息
     *
     * @return 获取单个地址
     * <p>
     * https://chain.api.btc.com/v3/address/15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew
     * <p>
     * 获取多个地址
     * <p>
     * https://chain.api.btc.com/v3/address/15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew,1PErRgFdo757pyyMxFiwB326vuymXC3hev
     */

    @GET("/v3/address/{address}")
    Call<ResponseJson> getAddressInfo(@Path("address") String address);


    /**
     * 地址交易列表
     * 获取地址的交易列表，按照倒序排列
     * 注意：该接口不支持批量查询
     * <p>
     * 参数：
     * <p>
     * page，可选，默认为1，页码
     * pagesize，可选，默认为50，可选范围为1-50，分页大小
     * 示例
     * https://chain.api.btc.com/v3/address/15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew/tx
     */
    @GET("/v3/address/{address}/tx")
    Call<ResponseJson> getAddressTransactionList(@Path("address") String address);


    /**
     * 获取未花费列表
     * <p>
     * 获取地址的未花费交易列表，按照确认数正序排列。
     * <p>
     * 注意：该接口不支持批量查询
     * <p>
     * https://chain.api.btc.com/v3/address/15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew/unspent
     */
    @GET("/v3/address/{address}/unspent")
    Call<ResponseJson> getAddressUnspentList(@Path("address") String address);
}
