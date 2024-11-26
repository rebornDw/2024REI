package sort;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// 创建日本小说的一个集合
		ArrayList<Book> japanList = new ArrayList<Book>();

		// 创建10个日本小说对象
		Japan j1 = new Japan("ノルウェイの森", "村上春樹", 89, 50);
		Japan j2 = new Japan("蜘蛛の糸", "芥川龍之介", 75.5, 45);
		Japan j3 = new Japan("雪国", "川端康成", 81, 75);
		Japan j4 = new Japan("人間失格", "太宰治", 78, 42);
		Japan j5 = new Japan("東京塔", "リリー・フランキー", 74, 65);
		Japan j6 = new Japan("風と共に去りぬ", "マーガレット・ミッチェル", 74.5, 73);
		Japan j7 = new Japan("白鯨", "ハーマン・メルヴィル", 88, 21);
		Japan j8 = new Japan("仮面の告白", "三島由紀夫", 90, 18);
		Japan j9 = new Japan("風の歌を聴け", "村上春樹", 79.6, 71);
		Japan j10 = new Japan("ボッコちゃん", "星新一", 78.4, 55);

		// 把对象放进数组
		japanList.add(j1);
		japanList.add(j2);
		japanList.add(j3);
		japanList.add(j4);
		japanList.add(j5);
		japanList.add(j6);
		japanList.add(j7);
		japanList.add(j8);
		japanList.add(j9);
		japanList.add(j10);

		// 遍历集合并且按照价格高低进行冒泡排序
		Book.bookInform(japanList);
		Book.priceSort(japanList);

		// 中国小说

		// 创建中国小说的一个集合
		ArrayList<Book> chinaList = new ArrayList<Book>();

		// 创建5个中国小说对象
		China c1 = new China("活着", "余华", 101, 50);
		China c2 = new China("平凡的世界", "路遥", 89, 35);
		China c3 = new China("白鹿原", "陈忠实", 79, 42);
		China c4 = new China("西游记", "吴承恩", 58, 58);
		China c5 = new China("骆驼祥子", "老舍", 120, 51);
		// 把对象放进数组
		chinaList.add(c1);
		chinaList.add(c2);
		chinaList.add(c3);
		chinaList.add(c4);
		chinaList.add(c5);
		// 遍历集合并且按照价格高低进行冒泡排序
		Book.bookInform(chinaList);
		Book.amountSort(chinaList);
	}

}