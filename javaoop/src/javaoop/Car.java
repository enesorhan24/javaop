package javaoop;

public class Car {
	private String color;
	private String Model;
	private double Enginee;
	private int Doors;
	// Classlarda belirtilen publicler onlar�n her yerden eri�ilebilir oldu�unu g�sterir
	//Private yap�l�rsa sadece classlar �zerinden ula��labilir.
	
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
