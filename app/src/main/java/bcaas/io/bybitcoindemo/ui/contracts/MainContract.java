package bcaas.io.bybitcoindemo.ui.contracts;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 */
public interface MainContract {

    interface View {


    }

    interface Presenter {
        void decodeTransaction();

        void publishTransaction();

        void verifyMessage();

        //获取交易详情
        void getTransactionDetail();

        //获取地址的信息
        void getAddressInfo();

        //获取单个区块详情
        void getBlock();

        //根据日期获取交易列表，按照倒序排
        void getBlockListByDate();

        //获取区块交易列表
        void getBlockTransactionList();

        //获取未确认交易的哈希
        void getUnConfirmed();

        //获取未确认交易的信息，包括体积和数量。
        void getUnConfirmedSummary();

        //获取地址的交易列表，按照倒序排列
        void getAddressTransactionList();

        //获取地址的未花费交易列表，按照确认数正序排列
        void getAddressUnspentList();

        void getUnspentTransaction();


    }
}
