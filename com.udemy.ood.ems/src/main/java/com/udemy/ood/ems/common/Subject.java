package com.udemy.ood.ems.common;

public interface Subject {

   void register(Observer observer);

   void remove(Observer observer);

   void notifyObservers();
}
