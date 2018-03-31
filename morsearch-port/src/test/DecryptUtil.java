/**
 * Created by hyt on 2018/1/30.
 */
import java.io.UnsupportedEncodingException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import net.sf.json.JSONObject;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;



/**
 * 微信小程序信息获取
 * @author songhn
 */
public class DecryptUtil {
    /**
     * 获取微信小程序 session_key 和 openid
     */
/*    public JSONObject getSessionKeyAndOropenid(String code){
        //微信端登录code值

        String wxCode = code;
        String requestUrl = WxappConfig.GETSESSIONKEYOROPENID;
        Map<String,String> requestUrlParam = new HashMap<String,String>();
        requestUrlParam.put("appid", RemoteInterfaceAddress.AppletAPPID);
        requestUrlParam.put("secret", RemoteInterfaceAddress.AppletAppSecret);
        requestUrlParam.put("js_code", wxCode);
        requestUrlParam.put("grant_type", "authorization_code");
        JSONObject jsonObject = HttpsClientUtil.getInstance().sendGetRequest(requestUrl, requestUrlParam);
        return jsonObject;

    }*/
    /**
     * 解密用户敏感数据获取用户信息
     * @param sessionKey 数据进行加密签名的密钥
     * @param encryptedData 包括敏感数据在内的完整用户信息的加密数据
     * @param iv 加密算法的初始向量
     */
    public static JSONObject getUserInfo(String encryptedData,String sessionKey,String iv){
        try {
            // 被加密的数据
/*
            byte[] dataByte = Base64.decode(encryptedData);
            // 加密秘钥
            byte[] keyByte = Base64.decode(sessionKey);
            // 偏移量
            byte[] ivByte = Base64.decode(iv);
*/

            byte[] dataByte = org.apache.commons.net.util.Base64.decodeBase64(encryptedData);
            //加密秘钥
            byte[] keyByte = org.apache.commons.net.util.Base64.decodeBase64(sessionKey);
            //偏移量
            byte[] ivByte = org.apache.commons.net.util.Base64.decodeBase64(iv);


            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSONObject.fromObject(result);
            }
        }catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }


    public  static void main(String[] args) {
        try {
            getUserInfo("%2BAHwK6bt489pE6DpZ3AJY3AfN5KkmpOzk4SgpGBK0whDhTzVgkDwk0ZvfG0SoaqD5dCOSyMbR3FUpP3YwHdq%2Bn%2FPnzwyIj0SIbGQ5LwJYasblOXYYyKKVi79BzAthZHdVmn%2BfPMqrD0933EBtJiqO4ucuJ%2BYJp2f3PKyhXBdljBTkEMjdo8OVfCahQf15MhGQH%2FO4RZO4nPKWuos%2FGmuEIM%2BZDmn8Yn1ivKiOCJOfOoN9gJn%2Bm13UQNyCqvftCBA1mhfSImnBBSUSJ8NdMO5CzkQFCews9%2BR5ZBXEUsNKl9JY0E2pqXxMsq64uRS34yFCw3b8RU%2FLJa1oOMbStHGuANSTWjdEGsr8gt8ZSkFPNQnoEp1btvWoy4LxcSWhaijEK%2BSvguvKR%2BzKNQMB68W5%2FWl432GGOitCPZInJKmwld3aQvz5HPnIilGVMzcEGdUwl64Ti6u0ULphhuVX%2FFgvRX5FhCr5XLGCG%2BggCAxkXo%3D"
                    ,"aNZ8mU3WRiyolMgFMNpbcQ==","hGgI2sPUShuwYgSYs5XEBg==");
        } catch (Exception e) {
            e.printStackTrace();
        }

    };



}

