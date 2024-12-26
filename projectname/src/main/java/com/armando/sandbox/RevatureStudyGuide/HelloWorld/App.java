package com.armando.sandbox.RevatureStudyGuide.HelloWorld;

public class App {
    public static void main(String[] args) throws Exception {
		try {
			amethod();
			System.out.println("try ");
		} catch (Exception e) {
			System.out.print("catch ");
		} finally {
			System.out.print("finally ");
		}

		System.out.print("out ");
	}

	public static void amethod() {
	}
    
}

/* //? Why do we need to include package HelloWorld? This was an after thought and was refactored by the extension to include it.
 * It's used to help organize large projects because they may have the same class name. 
 * 
 * //! When creating classes, you want the same name for the file otherwise you run into an issue. 
 * 
 * //? Not sure what the x: is for in VSCode will come back to it later. 
 */