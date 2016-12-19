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
		System.out.printf("1 XOR 1 %5d%n", 1 ^ 1);
		
		
	}

}
