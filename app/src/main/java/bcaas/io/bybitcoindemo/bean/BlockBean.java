package bcaas.io.bybitcoindemo.bean;

import java.io.Serializable;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 */
public class BlockBean implements Serializable {
    //块高度
    private int height;
    //块版本
    private int version;
    private String mrkl_root;
    //块最大时间戳
    private int curr_max_timestamp;
    //块时间戳
    private int timestamp;
    //bits
    private int bits;
    //nonce
    private int nonce;
    // 块哈希
    private String hash;
    // 前向块哈希，如不存在，则为 null
    private String prev_block_hash;
    //后向块哈希，如不存在，则为 null
    private String next_block_hash;
    //块体积
    private int size;
    //矿池难度
    private int pool_difficulty;
    // 块难度
    private int difficulty;
    //块奖励
    private int tx_count;
    //块奖励
    private int reward_block;
    //块手续费
    private int reward_fees;
    //该记录系统处理时间，无业务含义
    private int created_at;
    //确认数
    private int confirmations;
    private extrasClass extras;

    private class extrasClass {
        //块播报方
        private String relayed_by;

    }
}
