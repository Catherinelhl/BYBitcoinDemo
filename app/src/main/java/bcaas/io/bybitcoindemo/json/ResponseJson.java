package bcaas.io.bybitcoindemo.json;

import java.io.Serializable;

/**
 * @author catherine.brainwilliam
 * @since 2018/10/12
 */
public class ResponseJson implements Serializable {

    private int err_no;
    private String err_msg;
    private Object data;


    public int getErr_no() {
        return err_no;
    }

    public void setErr_no(int err_no) {
        this.err_no = err_no;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseJson{" +
                "err_no=" + err_no +
                ", err_msg='" + err_msg + '\'' +
                ", data=" + data +
                '}';
    }
}
