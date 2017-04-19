package com.training.flyweight;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author vahag
 * @since 20.04.17
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class FlyweightTest {
    private MetaCategoryFactory factory;

    @Before
    public void setUp() {
        factory = new MetaCategoryFactory();
    }

    @Test
    public void test1() {
        assertEquals(factory.getFactoryItemsCount(), 0);

        assertEquals(factory.lookup("test1"), factory.lookup("test1"));

        assertNotEquals(factory.lookup("test2"),factory.lookup("test3"));
        factory.lookup("test2");
        factory.lookup("test1");
        assertNotEquals(factory.getFactoryItemsCount(),6);
        assertEquals(factory.getFactoryItemsCount(),3);

    }
}
