package tw.com.george.primitiveType;

public class RangeUsePrintf {

	public static void main(String[] args) {
		//byte、short、int、long 範圍
		System.out.printf("%d ~ %d%n", Byte.MIN_VALUE,Byte.MAX_VALUE);
		
		System.out.printf("%d ~ %d%n", Short.MIN_VALUE,Short.MAX_VALUE);
		
		System.out.printf("%d ~ %d%n", Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.printf("%d ~ %d%n", Long.MIN_VALUE,Long.MAX_VALUE);
		
		//float、double 精度範圍
		System.out.printf("%d ~ %d%n",Float.MIN_EXPONENT,Float.MAX_EXPONENT);
		
		System.out.printf("%d ~ %d%n", Double.MIN_EXPONENT,Double.MAX_EXPONENT);
		
		//char 可表示的 Unicode 範圍(%h 短整數)
		System.out.printf("%h ~ %h%n",Character.MIN_VALUE,Character.MAX_VALUE);
		
		// boolean 的兩個值(%b 輸出小寫boolean值 ; %B輸出大寫boolean值)
		System.out.printf("%b ~ %b%n", Boolean.TRUE,Boolean.FALSE);
		System.out.printf("%B ~ %B%n", Boolean.TRUE,Boolean.FALSE);
		
		//輸出浮點數時指定精度(2表示小數點後位數)
		System.out.printf("example：%.2f%n", 20.5315);
		
		//指定輸出時，至少要預留的字元長度(20.53只佔5字元，預留10個字元，剩下的補上5個空白)
		System.out.printf("example:%10.2f%n", 20.5315);

	}

}
