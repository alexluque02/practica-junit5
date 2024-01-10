package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ContainsTest {

    List<Integer> c;

    @BeforeEach
    void setUp(){
        c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    }

    @Test
    void identityIsTrueAndItemContainsValue(){
        int num = 3;
        boolean result = false;
        for (Integer item : c){
            if (item != null && item == num) {
                result = true;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    void identityIsFalseValueIsNullAndItemContainsValue(){
        c.add(null);
        boolean result = false;
        for (Integer item : c){
            if (item == null) {
                result = true;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    void identityIsTrueAndValueIsNotContained(){
        int num = 50;
        boolean result = false;
        for (Integer item : c){
            if (item != null && item == num) {
                result = true;
                break;
            }
        }
        assertFalse(result);
    }

    @Test
    void identityIsFalseAndValueIsNullAndNotContained(){
        boolean result = false;
        for (Integer item : c){
            if (item == null) {
                result = true;
                break;
            }
        }
        assertFalse(result);
    }

    @Test
    void identityIsFalseAndValueIsNotNullAndItemIsContained(){
        int num = 3;
        boolean result = false;
        for (Integer item : c){
            if (item != null && item.equals(num)) {
                result = true;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    void identityIsFalseAndValueIsNotNullAndItemIsNotContained(){
        int num = 10;
        boolean result = false;
        for (Integer item : c){
            if (item != null && item.equals(num)) {
                result = true;
                break;
            }
        }
        assertFalse(result);
    }

    @AfterEach
    void tearDown(){
        c = null;
    }

}
