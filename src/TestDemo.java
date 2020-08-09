public class TestDemo {
    //StringBuffer线程安全
    //StringBuilder线程不安全

    public static void fun(StringBuffer temp) {
        temp.append("\n").append("www.bit.com.cn");
    }
    public static void main(String[] args) {
        //String和StringBuffer最大的区别在于：String的内容无法修改，
        // 而StringBuffer的内容可以修改。频繁修改字符串的情况考虑使用StingBuffer。
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        fun(sb);
        System.out.println(sb);
    }


    public static void main6(String[] args) {
        String str1 = " hello world " ;
        System.out.println("["+str1+"]");
        //time 可以 去掉字符串开头和结尾的空白字符
        System.out.println("["+str1.trim()+"]");


        //只转换字母
        String str2 = " hello%$$%@#$%world 哈哈哈 " ;
        //字符串转大写
        System.out.println(str2.toUpperCase());
        //字符串转小写
        System.out.println(str2.toLowerCase());




        //获取字符串长度
        System.out.println(str2.length());



        //判断是否为空字符串，但不是null，而是长度为0
        System.out.println("hello".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(new String().isEmpty());


    }
}
