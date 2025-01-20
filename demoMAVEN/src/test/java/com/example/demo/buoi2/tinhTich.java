package com.example.demo.buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class TinhToanTichService {
    public static int tinhTich(int a, int b) {
        return a * b;
    }
}

class TinhTichTest {

    @Test
    public void testTinhTich_BienDuoi() {
        assertEquals(0, TinhToanTichService.tinhTich(0, 0));
    }

    @Test
    public void testTinhTich_BienTren() {
        assertEquals(1_000_000, TinhToanTichService.tinhTich(1000, 1000));
    }

    @Test
    public void testTinhTich_NgayDuoiBienTren() {
        assertEquals(999_000, TinhToanTichService.tinhTich(999, 1000));
    }

    @Test
    public void testTinhTich_NgayTrenBienDuoi() {
        assertEquals(0, TinhToanTichService.tinhTich(1, 0));
    }

    @Test
    public void testTinhTich_BienDuoiVaBienTren() {
        assertEquals(0, TinhToanTichService.tinhTich(0, 1000));
    }
}
