import model.structures.impl.Queue;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.structures.impl.Dog;

class QueueTest {
    private Queue<Integer> queue;

    private Queue<String> queue2;

    private Queue<Dog> queue3;

    @BeforeEach
    void init(){
        queue = new Queue<>();
    }
    /**
     * Objective: Enter a value of type Integer, and we expected that the method enquue it succesfully
     */
    @Test
    void enqueueTest1() {

        int num = 5;

        queue.enqueue(num);
        int numExpected = queue.front();

        Assert.assertEquals( numExpected, num);
    }

    /**
     * Objective: Valite that we enter not only but any type of object as String
     *  and after that the queue can't be empty
     */
    @Test
    void enqueueTest2() {
        //A Scenario
        String sr1 = "Camilo";
        String sr2 = "Juan Miguel";
        String sr3 = "Messi";
        //Act
        queue2.enqueue(sr1);
        queue2.enqueue(sr2);
        queue2.enqueue(sr3);
        String srExpected = queue2.front();
        //Assert (Se evalúa)
        Assert.assertEquals(srExpected, sr1);
        Assert.assertFalse(queue2.isEmpty());
    }

    /**
     * Objetive: Validate if the queue is empty, then 3 people enter,
     *  the firts one dequeue but enter again, now front is the second one.
     */
    @Test
    void enqueueTest3(){
        //Scenario
        Dog person1 = new Dog("Jaime", 25);
        Dog person2 = new Dog("Pilar", 20);
        Dog person3 = new Dog("Sebastian", 33);
        //Act
        queue3.enqueue(person1);
        queue3.enqueue(person2);
        queue3.enqueue(person3);
        //Asrt
        Assert.assertFalse(queue3.isEmpty());
        Assert.assertEquals(person1, queue3.front());
        queue3.dequeue();
        Assert.assertEquals(person2, queue3.front());
    }

    /**
     * Objective: If the user try to dequeue a queue which is empty,
     * so a null is expected.
     */
    @Test
    void dequeueTest1() {
        //scenario
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        //Act
        queue.enqueue(num1);
        queue.enqueue(num2);
        queue.enqueue(num3);
        Assert.assertFalse(queue.isEmpty());
        //Asrt
        while(!queue.isEmpty()){
            queue.dequeue();
        }
        Assert.assertTrue(queue.isEmpty());
        Assert.assertEquals(null, queue.dequeue());
    }

    /**
     * Objective: There's 3 people, the first and second are expected to be dequeued succesfully
     */
    @Test
    void dequeueTest2() {
        //Scenario
        Dog person1 = new Dog("Ronaldo", 38);
        Dog person2 = new Dog("Pirlo", 28);
        Dog person3 = new Dog("La Pulga", 30);
        //Act
        queue3.enqueue(person1);
        queue3.enqueue(person2);
        queue3.enqueue(person3);
        //Ast
        Dog persondequeued1 = queue3.dequeue();
        Dog persondequeued2 = queue3.dequeue();
        Assert.assertFalse(queue3.isEmpty());
        Assert.assertEquals(person3, queue3.front());
        Assert.assertEquals(person1,persondequeued1);
        Assert.assertEquals(person2,persondequeued2);
    }

    /**
     * Objective: 3 String enter to the queue, then only 2 are dequeued,
     * so is expected that the first dequeued is diferrent from the String left in the Queue
     */
    @Test
    void dequeueTest3() {
        //scenario
        String name = "Rocky";
        String name2 = "Ricardo";
        String name3 = "Daniel";
        //Act
        queue2.enqueue(name);
        queue2.enqueue(name2);
        queue2.enqueue(name3);
        //As
        String namedequeued1 = queue2.dequeue();
        String namedequeued2 = queue2.dequeue();
        Assert.assertNotEquals(namedequeued1, name3 );

    }
}