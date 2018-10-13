package bcaas.io.bybitcoindemo.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import bcaas.io.bybitcoindemo.R;
import bcaas.io.bybitcoindemo.tool.LogTool;
import bcaas.io.bybitcoindemo.tool.gson.GsonTool;
import bcaas.io.bybitcoindemo.ui.contracts.MainContract;
import bcaas.io.bybitcoindemo.ui.presenterImp.MainPresenterImp;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 * <p>
 * BTC 首页
 */
public class BTCMainActivity extends Activity
        implements MainContract.View {

    private String TAG = BTCMainActivity.class.getSimpleName();

    @BindView(R.id.btn_decode_transaction)
    Button btnDecodeTransaction;
    @BindView(R.id.btn_publish_transaction)
    Button btnPublishTransaction;
    @BindView(R.id.btn_verify_message)
    Button btnVerifyMessage;
    @BindView(R.id.btn_block)
    Button btnBlock;
    @BindView(R.id.btn_block_tx_list_by_date)
    Button btnBlockTxListByDate;
    @BindView(R.id.btn_block_tx_list)
    Button btnBlockTxList;
    @BindView(R.id.btn_tx_detail)
    Button btnTxDetail;
    @BindView(R.id.btn_unconfirmed)
    Button btnUnconfirmed;
    @BindView(R.id.btn_address)
    Button btnAddress;
    @BindView(R.id.btn_address_transaction_list)
    Button btnAddressTransactionList;
    @BindView(R.id.btn_unspent_list)
    Button btnUnspentList;
    @BindView(R.id.btn_unconfirmed_summary)
    Button btnUnconfirmedSummary;
    @BindView(R.id.tv_response_content)
    TextView tvResponseContent;

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btc_main);
        ButterKnife.bind(this);
        presenter = new MainPresenterImp(this);
        initView();
        setListener();

    }

    private void initView() {

    }

    private void setListener() {
        btnDecodeTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnDecodeTransaction");
                presenter.decodeTransaction();
            }
        });

        btnPublishTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnPublishTransaction");
                presenter.publishTransaction();
            }
        });
        btnVerifyMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnVerifyMessage");

                presenter.verifyMessage();
            }
        });
        btnBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnBlock");

                presenter.getBlock();
            }
        });
        btnBlockTxListByDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnBlockTxListByDate");

                presenter.getBlockListByDate();
            }
        });
        btnBlockTxList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnBlockTxList");

                presenter.getBlockTransactionList();
            }
        });
        btnTxDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnTxDetail");

                presenter.getTransactionDetail();
            }
        });
        btnUnconfirmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnUnconfirmed");

                presenter.getUnConfirmed();
            }
        });
        btnUnconfirmedSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnUnconfirmedSummary");

                presenter.getUnConfirmedSummary();
            }
        });
        btnAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnAddress");

                presenter.getAddressInfo();
            }
        });

        btnAddressTransactionList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnAddressTransactionList");

                presenter.getAddressTransactionList();
            }
        });
        btnUnspentList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnUnspentList");

                presenter.getAddressUnspentList();
            }
        });
        btnDecodeTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogTool.d(TAG, "btnDecodeTransaction");

                presenter.decodeTransaction();
            }
        });

    }

    @Override
    public void response(String responseJson) {
        if (tvResponseContent != null) {
            tvResponseContent.setText(GsonTool.getGson().toJson(responseJson));
        }
    }
}
