package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("test")
@Lazy
@Scope("prototype")
//이름이 아니라 type으로 가져온다.
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1의 기본생성자");
    }
}
