package tech.bmatch;

import tech.bmatch.model.PhoneInfo;
import tech.bmatch.service.PhoneRecoginzeService;
import tech.bmatch.service.PhoneRecoginzeServiceImpl;

/**
 * Main函数入口
 *
 * @author juniors
 * @date 14/11/2018
 */
public class App {
    public static void main(String[] args) {
        PhoneRecoginzeService service = new PhoneRecoginzeServiceImpl();

        PhoneInfo phoneInfo = service.onCall("18652930170");

        System.out.println(phoneInfo.getProvince()+"-"+phoneInfo.getCity());
    }
}
