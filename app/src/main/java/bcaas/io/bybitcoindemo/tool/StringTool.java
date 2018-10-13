package bcaas.io.bybitcoindemo.tool;

import android.text.TextUtils;

/**
 * @author catherine.brainwilliam
 * @since 2018/8/15
 */
public class StringTool {

    public static boolean isEmpty(String content) {
        return TextUtils.isEmpty(content);
    }

    public static boolean notEmpty(String content) {
        return !isEmpty(content);
    }

    public static boolean equals(String str1, String str2) {
        return TextUtils.equals(str1, str2);
    }

    public static boolean contains(CharSequence seq, CharSequence searchSeq) {
        if (seq != null && searchSeq != null) {
            return TextUtils.indexOf(seq, searchSeq, 0) >= 0;
        } else {
            return false;
        }

    }
}
