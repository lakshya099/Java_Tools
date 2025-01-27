package com.lakshya.algo.util;
public interface LMList<T> 
{
public void add(T data);
public void add(int index,T data);
public void insert(int index,T data);

public void removeAll();
public void clear();
public T removeAt(int index);

public T get(int index);
public int size();

public void update(int index,T data);

public void forEach(LMListItemAccepter<T> klia);

public LMIterator<T> iterator();

public void copyTo(LMList<T> other);
public void copyFrom(LMList<T> other);

public void appendTo(LMList<T> other);
public void appendFrom(LMList<T> other);
}