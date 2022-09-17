package t2;



public class demoo2 {
    //生成一个长度是3的随机字符串，把这个字符串作为当做密码
//    public String getPassword() {
//        char password[] = new char[6];
//        for (int i = 0; i < password.length; i++) {
//            while (true) {
//                char make = (char) (Math.random() * (122 - 48 + 1) + 48); //48-122
//                if (Character.isLetterOrDigit(make)) {//如果是字母或者数字
//                    password[i] = make;
//                    break;
//                }
//            }
//        }
//        return new String(password);
//    }

    //private String password = getPassword();
public String password= "684278956";
    public void forMethod() {//使用for循环穷举
        // 使用穷举法生成字符串，匹配上述生成的密码
        long start = System.currentTimeMillis(); //获取开始时间
        char password[] = new char[this.password.length()];
        boolean flag = true;
        while (flag) {
            for (int i = '0'; i <= '9'; i++) {
                for (int j = '0'; j <= '9'; j++) {
                    for (int z = '0'; z <= '9'; z++) {
                        for (int a = '0'; a <= '9'; a++) {
                            for (int b = '0'; b <= '9'; b++) {
                                for (int c = '0'; c <= '9'; c++) {
                                    for (int d = '0'; d <= '9'; d++) {
                                        for (int e = '0'; e <= '9'; e++) {
                                            for (int f = '0'; f <= '9'; f++) {

                                    

                        if (!Character.isLetterOrDigit(i) || !Character.isLetterOrDigit(j) || !Character.isLetterOrDigit(z)|| !Character.isLetterOrDigit(a)|| !Character.isLetterOrDigit(b)|| !Character.isLetterOrDigit(c)|| !Character.isLetterOrDigit(d)|| !Character.isLetterOrDigit(e)|| !Character.isLetterOrDigit(f))
                            continue;
                        password[0] = (char) i;
                        password[1] = (char) j;
                        password[2] = (char) z;
                        password[3] = (char) a;
                        password[4] = (char) b;
                        password[5] = (char) c;
                        password[6] = (char) d;
                        password[7] = (char) e;
                        password[8] = (char) f;
                        if (String.valueOf(password).equals(this.password)) {
                            //如果password字符串数组转为字符串 与equals   this.password 密码比较
                            System.out.println("密码已经找到：" + String.valueOf(password));
                            long end = System.currentTimeMillis();//获取结束时间
                            System.out.printf("使用for循环穷举法耗费的时间是：%d ms %n", (end - start));
                            flag = false;
                        }
                    }
                }
            }
        }
    }}}}}}}

    //->放外面是为了让isreturn初始化为false但是可以修改，避免方法的递归使得每次isreturn都初始化为false变得无法修改
    boolean isreturn = false;  //用于程序的结束return

//    public void diguiMethod(char[] random, int index) {  //使用递归法穷举
//        long start = System.currentTimeMillis();  //开始时间
//        for (int i = '0'; i <= 'z'; i++) {
//            if (!Character.isLetterOrDigit(i))
//                continue;
//            random[index] = (char) i; //把字符存入random字符串数组中
//            if (index < random.length - 1) {//如果数组没有填满则递归，进入套娃
//                if (isreturn)
//                    //判断结束语句应该放这里，因为第一个(套娃)递归结束之后
//                    // 会回到进入递归的方法这里也就是for循环里面，遇到return结束上一个套娃，直到全部结束
//                    return;
//                diguiMethod(random, index + 1);
//            } else if (String.valueOf(random).equals(this.password)) {
//                System.out.println();
//                System.out.println("密码已经找到：" + String.valueOf(random));
//                long end = System.currentTimeMillis();
//                System.out.format("使用递归穷举法耗费的时间是：%d ms %n", (end - start));
//                isreturn = true;  //用于结束全部的方法
//                return;  //结束该递归(套娃)方法
//            }
//        }
//    }

    public static void main(String[] args) {
        demoo2 demoo2 = new demoo2();
        System.out.println("初始密码是" + demoo2.password);
        System.out.println();
        demoo2.forMethod();
        //demoo2.diguiMethod(new char[6], 0);
    }
}
