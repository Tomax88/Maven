package com.academy.test.lesson12;

import com.academy.lesson12.Task2.NoSuchElementException;
import com.academy.lesson12.Task2.Queue;
import com.academy.lesson12.Task2.QueueImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class QueueTest {
    public void testQueueint(){
        Integer[] intData = {1,2,3,4,5,6};
        Integer [] arr = new Integer[intData.length];
        Queue<Integer> queue = new  QueueImpl<>(arr);


        for (int i = 0; i < intData.length; i++){
            queue.add(intData[i]);
        }

        for (int i=0;i>=0;i--){
            Assert.assertEquals(queue.poll(),intData[i]);
            Assert.assertEquals(queue.peek(),intData[i]);

        }
        try {

            for (int i = 0; i >= 0; i--) {
                Assert.assertEquals(queue.remove(), intData[i]);
                Assert.assertEquals(queue.element(), intData[i]);

            }
        }catch (NoSuchElementException e){
            Assert.fail("");
        }


    }
}
