package javaoop;

public class Car {
	private String color;
	private String Model;
	private double Enginee;
	private int Doors;
	// Classlarda belirtilen publicler onlarýn her yerden eriþilebilir olduðunu gösterir
	//Private yapýlýrsa sadece classlar üzerinden ulaþýlabilir.
	
public void setcolor(String color){
	this.color=color;
}
public String getcolor(){
	return this.color;
}
public void setModel(String Model){
	this.Model=Model;
}
public String getModel(){
	return this.Model;
}
public void setEnginee(double Enginee){
	this.Enginee=Enginee;
}
public double getEnginee(){
	return this.Enginee;
}
public void setDoors(int Doors){
	this.Doors=Doors;
}
public int getDoors(){
	return this.Doors;
}
}
