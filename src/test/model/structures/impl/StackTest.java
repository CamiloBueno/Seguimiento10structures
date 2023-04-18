package model.structures.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack1;
    private Stack<String> stack2;
    private Stack<Continents> stack3;
    private Stack<Transformers> stack4;

    @BeforeEach
    void init() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack3 = new Stack<>();
        stack4 = new Stack<>();
    }

    @Test
    void isEmptyTest1() {
        int num1 = 10;
        int num2 = 20;
        stack1.push(num1);
        stack1.push(num2);
        assertFalse(stack1.isEmpty());//Should be false
    }

    @Test
    void isEmptyTest2() {
        int num1 = 10;
        int num2 = 20;
        stack1.push(num1);
        stack1.push(num2);
        stack1.pop();
        assertFalse(stack1.isEmpty());//Should be false
        stack1.pop();
        assertTrue(stack1.isEmpty()); //Should be True
    }

    @Test
    void isEmptyTest3() {
        Continents cont1 = new Continents("Spain", "Europe");
        Continents cont2 = new Continents("France", "Europe");
        Continents cont3 = new Continents("Italy", "Europe");

        stack3.push(cont1);
        stack3.push(cont2);
        stack3.push(cont3);
        assertFalse(stack3.isEmpty());

        while (!stack3.isEmpty()) {
            stack3.pop();
        }
        assertTrue(stack3.isEmpty());
    }

    @Test
    void peekTest1() {
        int num = 7;
        int num2 = 9;

        stack1.push(num);
        stack1.push(num2);
        int numExpected = stack1.peek();

        assertNotEquals(numExpected, num);
    }

    @Test
    void peekTest2() { //Peek
        //scenario
        Continents cont1 = new Continents("Spain", "Europe");

        Continents cont2 = new Continents("Italy", "Europe");

        Continents cont3 = new Continents("Colombia", "South America");

        Continents cont4 = new Continents("Brazil", "South America");

        Continents cont5 = new Continents("Germany", "Europe");

        Continents cont6 = new Continents("Portugal", "Europe");

        //act
        stack3.push(cont1);
        stack3.push(cont2);
        stack3.push(cont3);
        stack3.push(cont4);
        stack3.push(cont5);
        stack3.push(cont6);
        //Assert
        assertEquals(cont6, stack3.peek());
        assertEquals(cont6, stack3.pop());
    }

    @Test
    void peekTest3() { //Peek
        //scenario
        Transformers t1 = new Transformers("Ferrari", "eagle");
        Transformers t2 = new Transformers("Mercedes", "fox");
        Transformers t3 = new Transformers("Toyota", "turtle");

        //act
        stack4.push(t1);
        stack4.push(t2);
        stack4.push(t3);

        //Assert
        assertEquals(t3,stack4.peek());
        assertFalse(stack4.isEmpty());
        assertNotEquals(t2,stack4.peek());

    }

    @Test
    void push1(){
        //scenario
        Transformers t1 = new Transformers("Ferrari", "eagle");
        Transformers t2 = new Transformers("Mercedes", "fox");
        //Transformers t3 = new Transformers("Toyota", "turtle");
        //act
        stack4.push(t1);
        stack4.pop();
        stack4.push(t2);
        //assert
        assertNotEquals(t1, stack4.peek());

    }

    @Test
    void push2(){
        //scenario
        Transformers t1 = new Transformers("Ferrari", "eagle");
        Transformers t2 = new Transformers("Mercedes", "fox");

        //act
        stack4.push(t1);
        stack4.pop();
        stack4.push(t2);
        stack4.pop();

        //assert
        assertTrue(stack4.isEmpty());

    }

    @Test
    void push3(){
        //scenario
        Transformers t1 = new Transformers("Ferrari", "eagle");
        Transformers t2 = new Transformers("Mercedes", "fox");

        //act
        stack4.push(t1);
        stack4.pop();
        stack4.push(t2);
        stack4.pop();
        stack4.push(t1);

        //assert
        assertFalse(stack4.isEmpty());

    }
    @Test
    void pop1(){
        //scenario
        Transformers t1 = new Transformers("Ferrari", "eagle");
        Transformers t2 = new Transformers("Mercedes", "fox");

        //act
        stack4.push(t1);
        stack4.pop();
        //assert
        assertEquals( null,stack4.pop());
    }
    @Test
    void pop2(){
        //scenario
        Transformers t1 = new Transformers("Ferrari", "eagle");
        Transformers t2 = new Transformers("Mercedes", "fox");
        Transformers t3 = new Transformers("Toyota", "turtle");

        //act
        stack4.push(t1);
        stack4.push(t2);
        stack4.push(t3);
        while(!stack4.isEmpty()){
            stack4.pop();
        }
        //assert
        assertTrue( stack4.isEmpty());
    }
    @Test
    void pop3(){
        //act
        stack2.push("hola");
        stack2.push("hey");
        stack2.pop();
        //assert
        assertEquals( "hola",stack2.peek());
    }

}