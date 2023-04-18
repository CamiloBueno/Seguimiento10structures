package model.structures.impl;

import model.structures.IHashTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    private int tableSize = 5;
    private HashTable hashTable;

    @BeforeEach
    void init(){

        hashTable = new HashTable<>(tableSize);

    }

    @Test
    void put1() {
        //Initialize
        int num = 2;
        int num2 = 4/2;

        //Act
        hashTable.put(num,"hey");

        //Assert
        assertEquals(num,num2);
    }

    @Test
    void put2() {
        //Initialize
        int num = 2;
        int num2 = 3;
        //Act
        hashTable.put(num,"hey");
        hashTable.remove(num);
        hashTable.put(num, num2);
        hashTable.remove(num);
        //Assert
        assertTrue(hashTable.isEmpty());
    }

    @Test
    void put3() {
        //Initialize
        int num = 2;

        //Act
        hashTable.put(num,"hey");

        //Assert

    }

    @Test
    void remove() {

    }

    @Test
    void isEmpty() {

    }

    @Test
    void hash() {

    }

    @Test
    void get() {

    }

    @Test
    void size() {

    }
}