package com.morsearch.test;


import com.morsearch.base.BaseController;
import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.*;
import com.morsearch.model.Acc_Buy;
import com.morsearch.model.Acc_Recharge;
import com.morsearch.service.OrderService;
import com.morsearch.service.WalletService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Pay_Detail;
import com.morsearch.vo.Pay_Sign;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jdom.JDOMException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 调试
 */
public class testclass {

    public  static void main(String[] args) {
        try {
            decrypt1("%2BAHwK6bt489pE6DpZ3AJY3AfN5KkmpOzk4SgpGBK0whDhTzVgkDwk0ZvfG0SoaqD5dCOSyMbR3FUpP3YwHdq%2Bn%2FPnzwyIj0SIbGQ5LwJYasblOXYYyKKVi79BzAthZHdVmn%2BfPMqrD0933EBtJiqO4ucuJ%2BYJp2f3PKyhXBdljBTkEMjdo8OVfCahQf15MhGQH%2FO4RZO4nPKWuos%2FGmuEIM%2BZDmn8Yn1ivKiOCJOfOoN9gJn%2Bm13UQNyCqvftCBA1mhfSImnBBSUSJ8NdMO5CzkQFCews9%2BR5ZBXEUsNKl9JY0E2pqXxMsq64uRS34yFCw3b8RU%2FLJa1oOMbStHGuANSTWjdEGsr8gt8ZSkFPNQnoEp1btvWoy4LxcSWhaijEK%2BSvguvKR%2BzKNQMB68W5%2FWl432GGOitCPZInJKmwld3aQvz5HPnIilGVMzcEGdUwl64Ti6u0ULphhuVX%2FFgvRX5FhCr5XLGCG%2BggCAxkXo%3D"
            ,"aNZ8mU3WRiyolMgFMNpbcQ==","hGgI2sPUShuwYgSYs5XEBg==","UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

    };

    private static final String ALGORITHM = "AES";/*密钥算法 */
    private static final String ALGORITHM_MODE_PADDING = "AES/ECB/PKCS7Padding";

    public static String decrypt1(String data, String key, String iv, String encodingFormat) throws Exception {
//        initialize();

        //被加密的数据
        byte[] dataByte = Base64.decodeBase64(data);
        //加密秘钥
        byte[] keyByte = Base64.decodeBase64(key);
        //偏移量
        byte[] ivByte = Base64.decodeBase64(iv);


        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);// 创建密码器
            //Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKeySpec spec = new SecretKeySpec(keyByte,ALGORITHM);
            AlgorithmParameters parameters = AlgorithmParameters.getInstance(ALGORITHM);
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, encodingFormat);
                return result;
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }


}
