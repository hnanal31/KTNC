package com.example.demo.buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 class TinhToanThuongService {
    public static int tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Khong the chia cho 0");
        }
        return a / b;
    }
}

class TinhThuongTest {

    @Test
    public void testTinhThuong_BienDuoi() {
        assertEquals(1, TinhToanThuongService.tinhThuong(1, 1));
    }

    @Test
    public void testTinhThuong_BienTren() {
        assertEquals(1000, TinhToanThuongService.tinhThuong(1000, 1));
    }

    @Test
    public void testTinhThuong_NgayDuoiBienTren() {
        assertEquals(999, TinhToanThuongService.tinhThuong(999, 1));
    }

    @Test
    public void testTinhThuong_NgayTrenBienDuoi() {
        assertEquals(2, TinhToanThuongService.tinhThuong(2, 1));
    }

    @Test
    public void testTinhThuong_BienTrenChiaBienTren() {
        assertEquals(1, TinhToanThuongService.tinhThuong(1000, 1000));
    }

    @Test
    public void testTinhThuong_ChiaCho0() {
        assertThrows(ArithmeticException.class, () -> TinhToanThuongService.tinhThuong(10, 0));
    }
}
