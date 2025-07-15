package com.akash;

import hu.akarnokd.rxjava3.math.MathFlowable;
import io.reactivex.rxjava3.core.Flowable;

public class Q3 {
    public void Q3Sol() {
        MathFlowable.averageDouble(Flowable.range(1, 10))
                .subscribe(avg -> System.out.println("Average: " + avg));

        Flowable.just(5, 1, 3, 2, 4)
                .to(MathFlowable::min)
                .subscribe(min -> System.out.println("Min: " + min));
    }
}
