package bcaas.io.bybitcoindemo.ui.presenterImp;

import bcaas.io.bybitcoindemo.json.ResponseJson;
import bcaas.io.bybitcoindemo.tool.LogTool;
import bcaas.io.bybitcoindemo.ui.contracts.MainContract;
import bcaas.io.bybitcoindemo.ui.requester.MainRequester;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 */
public class MainPresenterImp implements MainContract.Presenter {
    private String TAG = MainPresenterImp.class.getSimpleName();

    private MainContract.View view;
    private MainRequester requester;

    public MainPresenterImp(MainContract.View view) {
        this.view = view;
        requester = new MainRequester();
    }

    @Override
    public void getTransactionDetail() {
        requester.getTransaction(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getAddressInfo() {
        requester.getAddressInfo(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getAddressUnspentList() {
        requester.getUnspentAddressList(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getBlock() {
        requester.getBlock(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getBlockListByDate() {
        requester.getBlockListByDate(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getBlockTransactionList() {
        requester.getBlockTransactionList(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getUnConfirmed() {
        requester.getUnComfirmed(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getUnConfirmedSummary() {
        requester.getUnConfirmedSummary(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getAddressTransactionList() {
        requester.getAddressInfo(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void getUnspentTransaction() {
        requester.getUnspentAddressList(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void decodeTransaction() {
        requester.decodeTransaction(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void publishTransaction() {
        requester.publishTransaction(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });

    }

    @Override
    public void verifyMessage() {
        requester.verifyMessage(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                LogTool.d(TAG, response.body());
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                LogTool.e(TAG, t.getMessage());

            }
        });
    }
}
