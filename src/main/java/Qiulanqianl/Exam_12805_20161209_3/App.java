package Qiulanqianl.Exam_12805_20161209_3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("请输入日期：");
       Scanner scan=new Scanner(System.in);
       String[] s=scan.nextLine().split("-");
       
       int y=Integer.parseInt(s[0]);
       int m=Integer.parseInt(s[1]);
       int d=Integer.parseInt(s[2]);
       boolean mon = m==1||m==3||m==5||m==7||m==8||m==10||m==12;
	   boolean year = (y%4==0&&y%100!=0)||y%400==0;
		if(mon&&d>31){						
			System.out.println("日期格式错误");
			}else if((m!=2)&&d>30){
				System.out.println("日期格式错误");
			}else if(m==2&&year&&d>29){
				System.out.println("日期格式错误");
			}else if(m==2&&!year&&d>28){
				System.out.println("日期格式错误");
			}else{
				int sum = 0;						
				for(int i =1;i<m;i++){
					sum  = sum + mon(y,i,d);		
				}
				sum = sum + d;
				System.out.println("你输入的日期为当年的第"+sum+"天");
			}
		}
		public static int mon(int y,int m,int d){   
			int a1 = 31;
			int a2 = 30;
			if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
				if(d<32){
					return a1;
				}
			}else if(m!=2){
				if(d<31){
					return a2;
				}
			}else{
				return erYue(y,d);
			}
			return -1;
		}
		public static int erYue(int y,int d){   
			int b1 = 29;
			int b2 =28;
			if((y%4==0&&y%100!=0)||y%400==0){
				if(d<=29){
					return b1;
				}
			}else{
				if(d<=28){
					return b2;
				}
			}
			return -1;
		}
	}

