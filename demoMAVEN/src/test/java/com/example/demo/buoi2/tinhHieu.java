package com.example.demo.buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class TinhToanHieuService {
    public static int tinhHieu(int a, int b) {
        return a - b;
    }
}

class TinhHieuTest {

    @Test
    public void testTinhHieu_BienDuoi() {
        assertEquals(0, TinhToanHieuService.tinhHieu(0, 0));
    }

    @Test
    public void testTinhHieu_BienTren() {
        assertEquals(1000, TinhToanHieuService.tinhHieu(1000, 0));
    }

    @Test
    public void testTinhHieu_NgayDuoiBienTren() {
        assertEquals(999, TinhToanHieuService.tinhHieu(999, 0));
    }

    @Test
    public void testTinhHieu_NgayTrenBienDuoi() {
        assertEquals(1, TinhToanHieuService.tinhHieu(1, 0));
    }

    @Test
    public void testTinhHieu_BienDuoiVaBienTren() {
        assertEquals(-1000, TinhToanHieuService.tinhHieu(0, 1000));
    }
}
