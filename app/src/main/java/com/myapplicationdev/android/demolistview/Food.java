package com.myapplicationdev.android.demolistview;

import static android.R.attr.name;

/**
 * Created by 15017466 on 28/4/2017.
 */

public class Food {

    private String name;
    private boolean star;
    public Food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }
    public String getName() {
        return name;
    }
    public boolean isStar() {
        return star;
    }
}
