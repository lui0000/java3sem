package queue.queue_2_nd;

import queue_1_st.ArrayQueue;

import java.util.Objects;
import java.util.Queue;


public class mathematicalOperations <T> implements java.lang.Math {


    private double value;

    public mathematicalOperations(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(double value) {
        return this.value;
    }
}





