package tech.bmatch;

import tech.bmatch.model.PhoneInfo;
import tech.bmatch.service.PhoneRecoginzeService;
import tech.bmatch.service.PhoneRecoginzeServiceImpl;

import java.util.Scanner;

/**
 * Main函数入口
 *
 * @author juniors
 * @date 14/11/2018
 */
public class App {
    public static void main(String[] args) {
        PhoneRecoginzeService service = new PhoneRecoginzeServiceImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            PhoneInfo phoneInfo = service.onCall(scanner.next());
            System.out.println(phoneInfo.getProvince()+"-"+phoneInfo.getCity());
        }

    }
}
