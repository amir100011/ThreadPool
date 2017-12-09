package bgu.spl.a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActorThreadPoolTest {

    @Test
    public void submit() {
    }

    @Test
    public void shutdown() {
    }

    @Test
    public void start() {
        ActorThreadPool tom = new ActorThreadPool(4);
        tom.start();
    }
}