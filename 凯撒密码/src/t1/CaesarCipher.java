package t1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class CaesarCipher {
    public String path;//公有变量path为要操作的函数
    public String estr="";//公有变量estr为操作过后的字符串
    public char c;//公有变量c是要操作的path提取后的字符
    public String d;
    public static void main(String[] args) {
// TODO Auto-generated method stub
        CaesarCipher c=new CaesarCipher();//建立新的对象
        System.out.println("*凯撒密码*");
        System.out.println("1.加密");//要执行的操作
        System.out.println("2.解密");
        System.out.println("你要进行的操作：");
        int num;
        Scanner scanner=new Scanner(System.in);//输入要执行的操作num
        num=scanner.nextInt();
        //System.out.println("情输入你要进行操作的字符串");//输入操作的字符串
        //c.path=scanner.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //c.path=br.readLine();
        if(num==1)
        {
            c.jiami( 3);//调用加密函数
            System.out.println("加密过后的字符串为："+c.estr);
        }
        else
        {
            c.jiemi( 3);//调用解密函数
            System.out.println("解密过后的内容为："+c.estr);
        }
    }
    public void jiami(int n)//加密
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入你要进行操作的字符串");//输入操作的字符串
        try{
            d=br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
            //System.out.println(d.length());
        for(int i=0;i<d.length();i++)
        {
            c=d.charAt(i);//取出字符串的每个字符
            if(c>='A'&&c<='Z')//当字符在"A"到"Z"之间的时候
            {
                if(c+n%26<='Z')//当提取的字符在Z之前的n位时
                {
                    estr+=(char)(c+n%26);
                }
                else
                {
                    estr+=(char)('A'+((n-('Z'-c)-1)%26));//孤立出来的n个字符
                }
            }
            else if(c>='a'&&c<='z')
            {
                if(c+n%26<='z')//当提取的字符在z之前的n位时
                {
                    estr+=(char)(c+n%26);
                }
                else
                {
                    estr+=(char)('a'+((n-('z'-c)-1)%26));//孤立出来的n个字符
                }
            }
            else if(c>='0'&&c<='9')
            {
                if(c+n%10<='9')
                {
                    estr+=(char)(c+n%10);//当提取的字符在9之前的n位时
                }
                else
                {
                    estr+=(char)('0'+((n-('9'-c)-1)%10));//孤立出来的n个字符
                }
            }
            else
            {
                estr+=c;
            }
        }
    }
    public void jiemi(int n)//解密
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入你要进行操作的字符串");//输入操作的字符串
        try{
            d=br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        for(int i=0;i<d.length();i++)
        {
            c=d.charAt(i);//取出字符串的每个字符
            if(c>='A'&&c<='Z')//当字符在"A"到"Z"之间的时候
            {
                if(c-n%26>='A')//当提取的字符在A之前的n个时
                {
                    estr+=(char)(c-n%26);
                }
                else
                {
                    estr+=(char)('Z'-((n-(c-'A')-1)%26));//操作孤立出来的n个字符
                }
            }
            else if(c>='a'&&c<='z')
            {
                if(c-n%26>='a')//当提取的字符在a之前的n个时
                {
                    estr+=(char)(c-n%26);
                }
                else
                {
                    estr+=(char)('z'-((n-(c-'a')-1)%26));//操作孤立出来的n个字符
                }
            }
            else if(c>='0'&&c<='9')
            {
                if(c-n%10>='0')//当提取的字符在0之前的n个时
                {
                    estr+=(char)(c-n%10);
                }
                else
                {
                    estr+=(char)('9'-((n-(c-'0')-1)%10));//操作孤立出来的n个字符
                }
            }
            else
            {
                estr+=c;
            }
        }
    }
}



