package tech.bmatch.service;

import tech.bmatch.model.PhoneInfo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 手机号码信息服务实现类
 *
 * @author juniors
 * @date 14/11/2018
 */
public class PhoneRecoginzeServiceImpl implements PhoneRecoginzeService{

    public static HashMap<String,PhoneInfo> cache = new LinkedHashMap<>();

    /**
     * 对数据进行初始化操作
     * 加载到缓存中
     */
    static {
        InputStream in = PhoneRecoginzeServiceImpl.class.getResourceAsStream("/phone.data.txt");
       // InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        reader.lines().forEach(line->{
                PhoneInfo phoneInfo = new PhoneInfo();
                String[] lines = line.split("\t");
                String key = lines[0];
                cache.put(key,phoneInfo);
                phoneInfo.setPhone(lines[0]);
                phoneInfo.setProvince(lines[1]);
                phoneInfo.setCity(lines[2]);
                phoneInfo.setOperator(lines[3]);
                phoneInfo.setCityCode(lines[4]);
                phoneInfo.setPostCode(lines[5]);

            });
    }

    /**
     * 查询服务
     *
     * @param phone
     * @return
     */
    @Override
    public PhoneInfo onCall(String phone) {

        String phoneFix = phone.substring(0,7);

        PhoneInfo phoneInfo = search(cache.keySet().toArray(new String[]{}),
                0,cache.size(),Integer.parseInt(phoneFix));

        return phoneInfo;
    }

    /**
     * 利用二分法进行查询
     *
     * @param phone
     * @param start
     * @param end
     * @param hkey
     * @return
     */
    public PhoneInfo search(String[] phone,int start,int end,int hkey){

        PhoneInfo phoneInfo = null;

        while (start <= end){
            int mid = start + (end-start)/2;
            int target = Integer.parseInt(phone[mid]);
            if(target > hkey){
                end = mid - 1;
            }
            else if(target < hkey){
                start = mid + 1;
            }else {
                String key = phone[mid];

                phoneInfo = cache.get(key);

                break;
            }

        }

        return phoneInfo;
    }
}
