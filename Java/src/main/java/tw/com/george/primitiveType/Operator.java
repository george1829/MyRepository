package tw.com.george.primitiveType;

public class Operator {

	public static void main(String[] args) {
		//比較運算子
		System.out.printf("10 > 5 結果 %b%n", 10 > 5);
		System.out.printf("10 >= 5 結果 %b%n", 10 >= 5);
		System.out.printf("10 < 5 結果 %b%n", 10 < 5);
		System.out.printf("10 <= 5 結果 %b%n", 10 <= 5);
		System.out.printf("10 == 5 結果 %b%n", 10 == 5);
		System.out.printf("10 != 5 結果 %b%n%n", 10 != 5);
		
		//條件式運算子(條件式 ? 成立傳回值 : 失敗傳回值)
		int scORe = 45;
		System.out.printf("該生是否及格? %c%n%n", scORe >=60 ? '是' : '否');
		
		//邏輯運算子
		// 且&&
		// 或||
		// 相反 !
		int number = 75;
		System.out.println(number > 70 && number < 80);
		System.out.println(number > 80 || number < 85);
		System.out.println(!(number > 80 || number < 85));
		System.out.println();
		
		//位元運算子  & (AND)、 | (OR)、 ^ (XOR)、 ~ (補數)
		// & (AND)(兩個都是1才是1)
		System.out.println("AND 運算：");
		System.out.printf("0 AND 0 %5d%n", 0 & 0);
		System.out.printf("0 AND 1 %5d%n", 0 & 1);
		System.out.printf("1 AND 0 %5d%n", 1 & 0);
		System.out.printf("1 AND 1 %5d%n", 1 & 1);
		
		// | (OR) (有一個是1就是1)
		System.out.println("\nOR 運算:");
		System.out.printf("0 OR 0 %5d%n", 0 | 0);
		System.out.printf("0 OR 1 %5d%n", 0 | 1);
		System.out.printf("1 OR 0 %5d%n", 1 | 0);
		System.out.printf("1 OR 1 %5d%n", 1 | 1);
		
		// ^ (XOR) (只有一個1才是1)
		System.out.println("\nXOR 運算:");
		System.out.printf("0 XOR 0 %5d%n", 0 ^ 0);
		System.out.printf("0 XOR 1 %5d%n", 0 ^ 1);
		System.out.printf("1 XOR 0 %5d%n", 1 ^ 0);
		System.out.printf("1 XOR 1 %5d%n%n", 1 ^ 1);
		
		//~補數運算==>將所有位0變1，1變0
		byte number1 = 1;     //00000001(二進位)
		System.out.println(~number1);   //11111110(二進位)
		
		/*
		 * 位移運算子
		 * 左移(<<)：將所有位元往左移指定位數，左邊被擠出去的位元會被丟棄，而右邊補上0
		 * 右移(>>)：將所有位元往右移指定位數，右邊被擠出去的位元會被丟棄，而左邊原本是0就補上0，原本是1就補上1
		 * >>> 運算子：這個運算子在右移後，最左邊一定是補0(用32位二進位來看)
		 */
		System.out.println("\n位元運算子：");
		int num = 1;   //00000001
		System.out.printf("左移兩位數  ： %d%n",num << 2);    //00000100
		System.out.printf("右移兩位數  ： %d%n",num >> 2);      //00000000
		int num1 = -2;  //11111110
		System.out.printf("左移兩位數 ： %d%n", num1 << 3);  //11110000
		System.out.printf("右移兩位數 ： %d%n", num1 >> 3);  //11111111
		System.out.printf("右移兩位數>>> ： %d%n", num1 >>> 31);  //0000 0000 0000 0000 0000 0000 0000 0000 0000 0001
		
		//遞增、遞減運算
		System.out.println("\n遞增、遞減運算");
		int a=0;
		System.out.println("++a="+ (++a));
		int b=0;
		System.out.println("b++="+ (b++));
		int c=0;
		System.out.println("--c="+ (--c));
		int d=0;
		System.out.println("d--="+ (d--));
	}

}
