package com.acc.lkm.Exception;

public class exceptions {

	public static void main(String[] args) {

		try {
			int[] arrayIndexException = { 5, 2, 7, 1, 5, 9 };

			String str = "Ajit";

			Integer numberFormatException = Integer.valueOf(str);

			System.out.println(numberFormatException);

			String nullPointer = "";

			System.out.println(arrayIndexException[6]);

			System.out.println(nullPointer.length());
			
			System.out.println(100/0+ "Arithmatic");
			
		} catch (ArithmeticException ex) {
			System.out.println(ex + " ArithmeticException is handled");
		} catch (NullPointerException ex) {
			System.out.println(ex + " NullPointerException is handled");
		} catch (NumberFormatException ex) {
			System.out.println(ex + " NumberFormatException is handled");
		}
		catch (Exception ex) {
			System.out.println(ex + " Exception is handled");
		}
		
		finally {
//			Will be executed weather we get exception or not
			System.out.println("Finaly is executed");
		}

	}

}
