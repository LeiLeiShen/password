package t1暴力破解;
import java.util.Scanner;

    public class baoli {
        public static void main(String[] args) {
            System.out.println("输入：");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            long startTime = System.currentTimeMillis();
            for(int k = 1; k < 26; k ++ ) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ' ') {
                        sb.append(' ');
                        continue;
                    } else {
                        if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                            if ((int) (s.charAt(i)) + k > 90) {
                                sb.append((char) (s.charAt(i) + k - 90 + 64));
                            } else {
                                sb.append((char) (s.charAt(i) + k));
                            }
                        } else {
                            if ((int) (s.charAt(i)) + k > 122) {
                                sb.append((char) (s.charAt(i) + k - 122 + 96));
                            } else {
                                sb.append((char) (s.charAt(i) + k));
                            }
                        }
                    }
                }
                System.out.println("k = " + k  + " Result : " + sb.toString());
            }
            long endTime = System.currentTimeMillis();
            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        }
    }


