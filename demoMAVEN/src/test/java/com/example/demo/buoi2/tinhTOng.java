package com.example.demo.buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class TinhToanService {
    public static int tinhTong(int a, int b) {
        return a + b;
    }
}
class TinhTongTest {

    @Test
    public void tinhTong1() {
        assertEquals(15, TinhToanService.tinhTong(5, 10));
    }
    @Test
    public void tinhTong2() {
        assertEquals(14, TinhToanService.tinhTong(4, 10));
    }
    @Test
    public void tinhTong3() {
        assertEquals(16, TinhToanService.tinhTong(6, 10));
    }
    @Test
    public void tinhTong4() {
        assertEquals(19, TinhToanService.tinhTong(9, 10));
    }
    @Test
    public void tinhTong5() {
        assertEquals(20, TinhToanService.tinhTong(10, 10));
    }
}
