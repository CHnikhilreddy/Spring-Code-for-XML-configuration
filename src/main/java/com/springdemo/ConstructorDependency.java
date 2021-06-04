package com.springdemo;
public class ConstructorDependency {
public ConstructorDependency( ) {
System.out.println("Constructor depency initialized");
}
@Override
public String toString() {
return "ConstructorDependency []";
}
}