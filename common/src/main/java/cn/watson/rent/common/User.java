package cn.watson.rent.common;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    int age;

    public void say(){
        System.out.println("aaaaaaaaa");
    }
}
