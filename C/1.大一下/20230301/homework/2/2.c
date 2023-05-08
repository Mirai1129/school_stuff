#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int height1, weight1, height2, weight2;
	printf("請輸入身高體重:");
	scanf("%d,%d", &height1, &weight1);
	printf("?�e?J??G??H????????(?γr?????})");
	scanf("%d,%d", &height2, &weight2);
	float Aheight, Aweight;
	Aheight = (float)(height1 + height2) / 2;
	Aweight = (float)(weight1 + weight2) / 2;
	printf("????????:%.2f, ??????:%f", Aheight, Aweight);
	system("PAUSE");
	return 0;
}
