package com.model.index;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.springframework.util.DigestUtils;

/**
 * 公共方法类
 */
public class Com {

    /**
     * 当前日期
     */
    public String Time(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return df.format(new Date());
    }

    /**
     * 生成UUID随机数
     * @return UUID随机数
     */
    public String UUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 字符串加密
     */
    public String MD5(String str) {
        String slat = "c2c";
        String base = str +"/"+ slat;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

    /**
     * 生成订单号
     */
    static int Guid = 100;
    public String NID(){
        Guid += 1;
        long now = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String time = dateFormat.format(now);
        String info = now + "";
        if(Guid > 999){
            Guid = 100;
        }
        return time + info.substring(2, info.length()) + Guid;
    }
}
