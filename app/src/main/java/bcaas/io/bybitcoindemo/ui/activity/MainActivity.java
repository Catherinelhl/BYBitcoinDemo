package bcaas.io.bybitcoindemo.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import bcaas.io.bybitcoindemo.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 * <p>
 * 首页
 */
public class MainActivity extends Activity {
    private String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.btn_btc)
    Button btnBtc;
    @BindView(R.id.btn_eth)
    Button btnEth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        setListener();

    }

    private void initView() {

    }

    private void setListener() {
        btnBtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), BTCMainActivity.class);
                startActivity(intent);
            }
        });

        btnEth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), ETHMainActivity.class);
                startActivity(intent);
            }
        });

    }
}
