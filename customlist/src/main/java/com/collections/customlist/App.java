package com.collections.customlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	CustomList<Integer>li = new CustomList<Integer>();
    	li.add(2);
    	li.add(4);
    	li.add(12);
    	li.add(20);
    	li.add(13);
    	li.add(15);
    	LOGGER.debug("elements in list are : "+li);
    	
        li.remove(2);
        LOGGER.debug("Elements 2 is removed");
        LOGGER.debug("Elements in list after removing 2 : ");
        LOGGER.debug(li);
        LOGGER.debug("First element in list is ");
        LOGGER.debug(li.get(0) );
        LOGGER.debug("Size of list : ");
        LOGGER.debug(li.size());
        CustomList<String>li2=new CustomList<String>();
        li2.add("apple");
        li2.add("bat");
        li2.add("cat");
        li2.add("dog");
        LOGGER.debug(li2);
        LOGGER.debug(li2.get(0));
        LOGGER.debug(li2.size());
        li2.remove(2);
        LOGGER.debug("Element at index 2 is removed");
        LOGGER.debug(li2);
    }
}
