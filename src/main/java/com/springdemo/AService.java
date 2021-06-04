package com.springdemo;
public class AService {
private ConstructorDependency constructorDependency;
private SetterDependency setterDependency;
public AService(ConstructorDependency constructorDependency) {
this.constructorDependency = constructorDependency;
}
public void setSetterDependency(SetterDependency setterDependency) {
this.setterDependency = setterDependency;
}
public void init() {
System.out.println("Bean initializing after wiring all dependencies");
}public void destroy() {
System.out.println("Pre destroy");
}
@Override
public String toString() {
return "AService [constructorDependency=" + constructorDependency + 
", setterDependency=" + setterDependency
+ "]";
}
}