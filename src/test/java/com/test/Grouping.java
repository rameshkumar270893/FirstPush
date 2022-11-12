package com.test;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups="reg")
	public void tc1() {
		System.out.println("tc01-regression");
	}
	@Test(groups="sanity")
	public void tc2() {
		System.out.println("tc02-sanity");
	}
	@Test(groups="smoke")
	public void tc3() {
		System.out.println("tc03-smoke");
	}
	@Test(groups="reg")
	public void tc4() {
		System.out.println("tc04-regression");
	}
	@Test(groups="sanity")
	public void tc5() {
		System.out.println("tc05-sanity");
	}
	@Test(groups="smoke")
	public void tc6() {
		System.out.println("tc06-smoke");
	}
}
