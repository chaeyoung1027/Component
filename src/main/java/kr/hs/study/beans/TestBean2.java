package kr.hs.study.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    private int data1;
    private double data2;

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }
}
