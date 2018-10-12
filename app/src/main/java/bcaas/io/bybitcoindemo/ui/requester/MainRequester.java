package bcaas.io.bybitcoindemo.ui.requester;

import bcaas.io.bybitcoindemo.http.HttpApi;
import bcaas.io.bybitcoindemo.http.retrofit.RetrofitFactory;
import bcaas.io.bybitcoindemo.json.ResponseJson;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 */
public class MainRequester {

    public void decodeTransaction(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.decodeTransaction();
        call.enqueue(callBackListener);
    }

    public void publishTransaction(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.publicTransaction();
        call.enqueue(callBackListener);
    }

    public void verifyMessage(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.verifyMessage();
        call.enqueue(callBackListener);
    }

    public void getUnspentAddressList(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getAddressUnspentList("15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew");
        call.enqueue(callBackListener);
    }

    public void getAddressTransactionList(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getAddressTransactionList("15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew");
        call.enqueue(callBackListener);
    }

    public void getAddressInfo(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getAddressInfo("15urYnyeJe3gwbGJ74wcX89Tz7ZtsFDVew");
        call.enqueue(callBackListener);
    }

    public void getUnConfirmedSummary(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getUnconfirmedSummary();
        call.enqueue(callBackListener);
    }

    public void getUnComfirmed(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getUnconfirmed();
        call.enqueue(callBackListener);
    }

    public void getTransactionDetail(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getTransactionDetail("0eab89a271380b09987bcee5258fca91f28df4dadcedf892658b9bc261050d96");
        call.enqueue(callBackListener);
    }

    public void getBlockTransactionList(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getBlockTransactionList(1);
        call.enqueue(callBackListener);
    }

    public void getBlockListByDate(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getBlockListByDate("20151215");
        call.enqueue(callBackListener);
    }

    public void getTransaction(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getTransaction(2);
        call.enqueue(callBackListener);
    }

    public void getBlock(Callback<ResponseJson> callBackListener) {
        HttpApi httpApi = RetrofitFactory.getAPIInstance().create(HttpApi.class);
        Call<ResponseJson> call = httpApi.getBlock("3");
        call.enqueue(callBackListener);
    }

}
