package com.packages.demo;

public class PackageInfo {

	public static void main(String[] args) {
		Package p = Package.getPackage("java.lang");
		System.out.println("Package Name: " + p.getName());
		
		System.out.println("Specification Title: " + p.getSpecificationTitle());
		
		System.out.println("Implementation Title: " + p.getImplementationTitle());

		System.out.println("Specification Version: " + p.getSpecificationVersion());
	}

}
