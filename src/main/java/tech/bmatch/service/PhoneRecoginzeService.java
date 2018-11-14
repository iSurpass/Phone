package tech.bmatch.service;

import tech.bmatch.model.PhoneInfo;

/**
 * 手机号码信息服务接口类
 *
 * @author juniors
 * @date 14/11/2018
 */
public interface PhoneRecoginzeService {
    /**
     * 手机号码查找服务
     *
     * @param phone
     * @return
     */
    PhoneInfo onCall(String phone);
}
