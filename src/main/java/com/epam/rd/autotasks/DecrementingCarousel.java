package com.epam.rd.autotasks;

public class DecrementingCarousel {
     private final int capacity;
    public int[] carousel;
    int index;
    boolean isRun;
    {
        index = 0;
        isRun = false;
    }

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element > 0 && index < capacity && !isRun) {
            carousel[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun(capacity);
        }
        return null;
    }
}
