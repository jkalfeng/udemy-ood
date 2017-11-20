package com.udemy.ood.ems.common;

public interface Observable {

   void register(Observer observer);

   void remove(Observer observer);

   void notifyObserver(String message);
}
