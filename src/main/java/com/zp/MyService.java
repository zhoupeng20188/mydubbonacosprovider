package com.zp;

import com.zp.dubbo.IUserInterface;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author zp
 * @create 2020/8/29 12:22
 */
@Service(interfaceClass = IUserInterface.class)
public class MyService implements IUserInterface {
    public String sayHello(String name) {
        return name;
    }
}
