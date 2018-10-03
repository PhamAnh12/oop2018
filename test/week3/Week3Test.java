package week3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        assertEquals(1, Week3.max(1, -1));
        assertEquals(0, Week3.max(-2, 0));
        assertEquals(100, Week3.max(100,-100));
        assertEquals(-10, Week3.max(-20,-10));
        assertEquals(1999, Week3.max(1998,1999));

    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testminOfArray() {
        int[] testArray1 = {1,2,3,4,5};
        int[] testArray2 = {-1,-2,-3,-4,-5,-6};
        int[] testArray3 = {2,4,6,8,-2,-4,-6,-8};
        int[] testArray4 ={99,98,100,101,102,96,103,0,-105};
        int[] testArray5 = {1999,1996,1992,-20000,-210000,-1000000};
        assertEquals(1, Week3.minOfArray(testArray1));
        assertEquals(-6, Week3.minOfArray(testArray2));
        assertEquals(-8, Week3.minOfArray(testArray3));
        assertEquals(-105, Week3.minOfArray(testArray4));
        assertEquals(-1000000, Week3.minOfArray(testArray5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI() {
        assertEquals("Bình thường", Week3.calculateBMI(66, 1.77));
        assertEquals("Bình thường", Week3.calculateBMI(52, 1.65));
        assertEquals("Béo phì", Week3.calculateBMI(100, 1.66));
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.65));
        assertEquals("Thiếu cân", Week3.calculateBMI(55, 1.88));
    }
}