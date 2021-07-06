package com.mubassyir.complexui

import com.mubassyir.complexui.fragment.FoodFragment
import com.mubassyir.complexui.fragment.BeverageFragment

interface ResourceStore {
    companion object {
        val tabList = listOf(
            R.string.tab_food, R.string.tab_beverage
        )
        val pagerFragments = listOf(
            FoodFragment.create(), BeverageFragment.create(),
        )
    }
}