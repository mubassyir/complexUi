package com.mubassyir.complexui.data

import com.mubassyir.complexui.R
import com.mubassyir.complexui.model.Food

object DummyData {

    fun onBoardingMessages(): ArrayList<String> {
        val onBoardingMessages =ArrayList<String>()
        onBoardingMessages.add("Simple UI design make you easy to find anything")
        onBoardingMessages.add("Various kind of F&B that u can enjoy")
        onBoardingMessages.add("Enjoy just from your finger")
        return onBoardingMessages
    }

    fun onBoardingTitles(): ArrayList<String> {
        val onBoardingTitles = ArrayList<String>()
        onBoardingTitles.add("Simple")
        onBoardingTitles.add("Discover")
        onBoardingTitles.add("Enjoy")
        return onBoardingTitles
    }

    fun westernFood(): ArrayList<Food> {
        val listFood = ArrayList<Food>()
        listFood.add(Food(R.drawable.food_beaf_steak, "Beaf Steak"))
        listFood.add(Food(R.drawable.food_bread,"Bread"))
        listFood.add(Food(R.drawable.food_cereal,"Cereal"))
        listFood.add(Food(R.drawable.food_fried_noodles,"Fried Noodles"))
        listFood.add(Food(R.drawable.food_hot_dog,"Hot Dog"))
        listFood.add(Food(R.drawable.food_nasi_goreng,"Nasi Goreng"))
        listFood.add(Food(R.drawable.food_sushi,"Sushi"))
        listFood.add(Food(R.drawable.food_risotto,"Risotto"))
        listFood.add(Food(R.drawable.food_pasta,"Pasta"))
        listFood.add(Food(R.drawable.food_spicy_shrimp,"Spicy Shrimp"))
        return listFood
    }

    fun westernBeverage(): ArrayList<Food> {
        val listBeverage = ArrayList<Food>()
        listBeverage.add(Food(R.drawable.drink_blue_hawai,"Blue Hawai"))
        listBeverage.add(Food(R.drawable.drink_boba_tea,"Boba Tea"))
        listBeverage.add(Food(R.drawable.drink_cola,"Cola"))
        listBeverage.add(Food(R.drawable.drink_gia_marescoti,"Gia Marecoti"))
        listBeverage.add(Food(R.drawable.drink_lemon_drop_martini,"Lemon Drop Martini"))
        listBeverage.add(Food(R.drawable.drink_orange_squash,"Orange Squash"))
        listBeverage.add(Food(R.drawable.drink_spirits,"Spirits"))
        listBeverage.add(Food(R.drawable.drink_strawberry_milk,"Strawberry Milk"))
        listBeverage.add(Food(R.drawable.drink_white_russian,"White Russian"))
        return listBeverage
    }

    fun localFood(): ArrayList<Food> {
        val localFood = ArrayList<Food>()
        localFood.add(Food(R.drawable.local_food_ayam_goreng,"Ayam Goreng"))
        localFood.add(Food(R.drawable.local_food_gado_gado,"Gado Gado"))
        localFood.add(Food(R.drawable.local_food_bubur_ayam,"Bubur Ayam"))
        localFood.add(Food(R.drawable.local_food_bakmi,"Bakmi"))
        localFood.add(Food(R.drawable.local_food_asinan,"Asinan"))
        localFood.add(Food(R.drawable.local_food_gudeg,"Gudeg"))
        localFood.add(Food(R.drawable.local_food_gulai,"Gulai"))
        localFood.add(Food(R.drawable.local_food_soto,"Soto"))
        localFood.add(Food(R.drawable.local_food_sayur_asem,"Sayur Asem"))
        localFood.add(Food(R.drawable.local_food_sate,"Sate"))
        localFood.add(Food(R.drawable.local_food_nasi_goreng,"Nasi Goreng"))
        localFood.add(Food(R.drawable.local_food_sambal,"Sambal"))
        localFood.add(Food(R.drawable.local_food_nasi_padang,"Nasi Padang"))
        localFood.add(Food(R.drawable.local_food_rawon,"Rawon"))
        localFood.add(Food(R.drawable.local_food_pecel_lele,"Pecel Lele"))
        localFood.add(Food(R.drawable.local_food_perkedel,"Perkedel"))

        return  localFood
    }
}