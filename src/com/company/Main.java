package com.company;


public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
	String str = "Создается один массив массивов (один объект) и три массива чисел.";
	char[] stringToCharArray = str.toCharArray();
	    for (int i=0; i<str.length(); i++){
            if (stringToCharArray[i] == '(' ) {
                a = i;
            } else if (stringToCharArray[i] == ')'){
                b = ++i;
            }
        }
    String strNew = str.substring(a,b);
	    String str2 = str.replace(strNew,"");
        System.out.println(str2);

    StringBuffer buff = new StringBuffer ("Клише, (стереотип) шаблон");
         buff.delete(6,18);
        System.out.println(buff);
    }
}
