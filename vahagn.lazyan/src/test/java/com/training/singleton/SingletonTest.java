package com.training.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vahag on 15.04.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class SingletonTest {

    @Test
    public void test1() {
        Singleton sin1 = Singleton.getInstance();
        Singleton sin2 = Singleton.getInstance();
        assert sin1.equals(sin2);
    }

    @Test
    public void test2() {
        Singleton sin1 = Singleton.getInstance();
        Singleton sin2 = Singleton.getInstance(new HashMap<String, Object>(), false);
        assert sin1.equals(sin2);
    }

    @Test
    public void test3() {
        Map<String, Object> map1 = new HashMap<String, Object>() {{
            put("1", 1);
            put("2", 2);
        }};
        Map<String, Object> map2 = new HashMap<String, Object>() {{
            put("1", 3);
            put("2", 2);
            put("3", 1);
        }};

        Singleton sin1 = Singleton.getInstance(map1, false);
        Singleton sin2 = Singleton.getInstance(map2, false);

        assert sin1.equals(sin2);
        assert !map1.equals(map2);
        assert sin1.getConfigs().equals(sin2.getConfigs());

    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        Singleton sin1 = Singleton.getInstance(null, true);
        sin1 = Singleton.getInstance(null,false);
    }
}
