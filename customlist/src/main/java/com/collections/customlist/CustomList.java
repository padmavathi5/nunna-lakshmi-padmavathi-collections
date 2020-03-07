package com.collections.customlist;

import java.util.AbstractList;
import java.util.Arrays;

public @SuppressWarnings("serial") class CustomList<T> extends AbstractList<T>implements java.io.Serializable{
	private int size=0;
	private static final int  CAPACITY=10;
	private Object []arr;
	CustomList(){
		arr=new Object[CAPACITY];
	}
	public boolean add(T t) {
        if (size == arr.length) {
            increaseCapacity();
        }
        arr[size++] = t;
		return true;
    }
	private void increaseCapacity() {
		// TODO Auto-generated method stub
		int newSize = arr.length * 2;
        arr = Arrays.copyOf(arr, newSize);
		
	}
	 @SuppressWarnings("unchecked")
	
		// TODO Auto-generated method stub
	public T get(int i) {
		   if (i >= size || i < 0) {
		       throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		   }
		   return (T) arr[i];
	}

	 @SuppressWarnings("unchecked")
	 public T remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = arr[i];
	        int numofele = arr.length - ( i + 1 ) ;
	        System.arraycopy( arr, i + 1, arr, i, numofele ) ;
	        size--;
	        return (T) item;
	    }
	 public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(arr[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
