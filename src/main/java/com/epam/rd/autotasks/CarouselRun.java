package com.epam.rd.autotasks;

public class CarouselRun extends DecrementingCarousel {

     protected int position = 0;

    public CarouselRun(int capacity) {
        super(capacity);
    }


    public int next() {
            if (isFinished())
                return -1;
            else {
                while (carousel[position %= carousel.length] <= 0) {
                    position++;
                }
            }
            return carousel[position++]--;
        }

        public boolean isFinished () {
            for (int el : carousel)
                if (el > 0)
                    return false;
            return true;
        }

}
