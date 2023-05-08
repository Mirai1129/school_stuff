#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	char name[8];
	printf("請輸入姓名:");
	scanf("%s", name);
	printf("Hi, %s\n",name);
    int age;
    printf("請輸入年齡:");
    scanf("%d", &age);
    printf("我今年%d歲\n", age);
	
	int x,y,z;
	printf("請輸入兩個數字(用逗號分開)");
	scanf("%d,%d",&x,&y);
	z = x + y;
	printf("%d + %d = %d\n",x,y,z);
	
    char test;
    test = 'a';
    printf("測試的文字為%c\n", test);
    test = 'b';
    printf("測試的文字為%d\n", test);
    test = test + 5;
    printf("測試的文字為%c 他的ASCII 是%d", test, test);
    
    return 0;
}

