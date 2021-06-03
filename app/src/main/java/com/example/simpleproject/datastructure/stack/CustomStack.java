package com.example.simpleproject.datastructure.stack;

import java.util.Arrays;

public class CustomStack<T> {  ///Here  T can be used as String ,int others type
  private int currentPosition =0;

  private Object[] elements;

  private int INITIAL_SIZE=10;

  public CustomStack()
  {
      elements=new Object[INITIAL_SIZE];
  }

  public T pop()
  {
      T t= (T) elements[--currentPosition];    ///Typecasting of generic T
      elements[currentPosition]=null;

      return t;
  }

  public void push(T element)
  {
      if(currentPosition ==elements.length)     ///if increasing  current position reach the array lenhth of element then we called exapnd size method
      {
          expandSize();
      }
      elements[currentPosition++]=elements;   ///when push method is called then current position will be 1

  }

  private void expandSize()
  {
      int increasedSize=elements.length *2;

      elements= Arrays.copyOf(elements,increasedSize);
  }
}
