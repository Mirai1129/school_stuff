#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	char name[8];
	printf("�п�J�m�W:");
	scanf("%s", name);
	printf("Hi, %s\n",name);
    int age;
    printf("�п�J�~��:");
    scanf("%d", &age);
    printf("�ڤ��~%d��\n", age);
	
	int x,y,z;
	printf("�п�J��ӼƦr(�γr�����})");
	scanf("%d,%d",&x,&y);
	z = x + y;
	printf("%d + %d = %d\n",x,y,z);
	
    char test;
    test = 'a';
    printf("���ժ���r��%c\n", test);
    test = 'b';
    printf("���ժ���r��%d\n", test);
    test = test + 5;
    printf("���ժ���r��%c �L��ASCII �O%d", test, test);
    
    return 0;
}

