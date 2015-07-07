//package ua.mywork.arrays;
//
//import org.junit.Assert;
//import org.junit.Test;
//import sun.awt.SunHints;
//
//import static org.junit.Assert.*;
//
//
//public class ArrayHelperTest {
//
//    @Test
//    public void testLeftUnion() throws Exception {
//
//        int[] leftArray = {3, 6, 2, 4,};
//        int[] rightArray = {3, 6, 2, 4, 1};
//        int[] expectedValue = {3, 6, 2, 4, 3, 6, 2, 4};
//
//        ArrayHelper testClass = new ArrayHelper();
//
////        testClass.leftUnion(leftArray, rightArray);
//
//        int[] returnValue = testClass.leftUnion(leftArray, rightArray);
//
//        Assert.assertArrayEquals(expectedValue, returnValue);
//    }
//
//    @Test(expected = MyExeption.class)
//    public void testLeftUnionWhenLeftArrayIsNullWuthMessage() throws Exception {
//
//        int[] leftArray = null;
//        int[] rightArray = {3, 6, 2, 4, 1};
//        String retunValue = "My Message";
//
//        ArrayHelper testClass = new ArrayHelper();
//
//        try {
//            testClass.leftUnion(leftArray, rightArray);
//            fail("Exceprion should be throw");
//        } catch (MyExeption ex) {
//
//            assert true;
//
//            assertEquals(retunValue, ex.getMessage());
//        }
//    }
//
//
//}