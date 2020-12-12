package com.principal;

import com.clases.Auto;

public class TestAuto {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1   = new Auto();
		auto1.marca  = "Ferrari";
		auto1.anio   = 2010;
		auto1.precio = 1E5;
		
		Auto auto2   = new Auto();
		auto2.marca  = "Chevrolet";
		auto2.anio   = 1997;
		auto2.precio = 9E2;
		
		showAuto(auto1);
		showAuto(auto2);
		
	}
*/
	public static void showAuto(Auto carro) {
		System.out.println("Marca: " + carro.marca);
		System.out.println("Anio: " + carro.anio);
		System.out.println("Precio: " + carro.precio + " $ \n");
	}

}
