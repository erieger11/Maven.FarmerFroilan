package com.zipcodewilmington.froilansfarm.Crop;


import java.util.HashMap;

public class
Storage extends HashMap<Object, Integer> {

import com.zipcodewilmington.froilansfarm.Food.Edible;

import java.util.HashMap;

public class Storage extends HashMap<Object, Integer>
{
   HashMap<Object, Integer> storage = new HashMap();

    public void add(Edible edible, Integer numberofItems)

    {
        storage.put(edible, numberofItems);
    }


}
