package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    List<String> _recentlyUsed;

    public RecentlyUsedList() {
        _recentlyUsed = new ArrayList<>();
    }

    public Integer count() {
        return _recentlyUsed.size();
    }

    public void add(String toAdd) {
        _recentlyUsed.add(toAdd);
    }

    public String get(Integer index) {
        return _recentlyUsed.get(index);
    }
}
