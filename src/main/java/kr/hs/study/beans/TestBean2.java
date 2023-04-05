package kr.hs.study.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    @Value("22")    //setter을 사용하지 않아도 된다.
    private int data1;
    @Value("22.22")
    private double data2;

    public int getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }
}
