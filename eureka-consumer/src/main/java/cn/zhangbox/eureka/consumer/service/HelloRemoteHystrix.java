package cn.zhangbox.eureka.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements  StudentConsumerService {


    @Override
    public String getStudentList(@RequestParam(value = "sname") String sname, @RequestParam(value = "age") Integer age) {
        return "hello~~~";
    }

    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "hello~~~";
    }
}
