package com.fixme;

/**
 * Colour
 */
public class Colour {
	static public class out {
		static public void red(String s) {
			System.out.println("\u001B[1;31m" + s + "\u001B[0m");
		}

		static public void green(String s) {
			System.out.println("\u001B[1;32m" + s + "\u001B[0m");
		}

		static public void white(String s) {
			System.out.println("\u001B[1;37m" + s + "\u001B[0m");
		}
	}

	static public void red(String s) {
		System.out.print("\u001B[1;31m" + s + "\u001B[0m");
	}

	static public void green(String s) {
		System.out.print("\u001B[1;32m" + s + "\u001B[0m");
	}

	static public void white(String s) {
		System.out.print("\u001B[1;37m" + s + "\u001B[0m");
	}

	static public class line {
		static public String red(String s) {
			return ("\u001B[1;31m" + s + "\u001B[0m");
		}

		static public String green(String s) {
			return ("\u001B[1;32m" + s + "\u001B[0m");
		}

		static public String white(String s) {
			return ("\u001B[1;37m" + s + "\u001B[0m");
		}
	}
}
