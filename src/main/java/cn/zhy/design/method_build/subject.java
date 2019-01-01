package cn.zhy.design.method_build;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class subject {
    List<Observe> observes = new ArrayList<Observe>();

    public abstract void addObserves(Observe observe);

    public abstract void deleObserves(Observe observe);

    public abstract void notified();
}
