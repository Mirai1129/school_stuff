/*這是標頭*/
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int a = 1;
    int b = 6;
    printf("a = %d, !a = %d\n", a, !a); /*!a就是NOR運算*/
    printf("b = %d, !b = %d\n", b, !b); /*!b也是NOR運算 只要b不是0 !b就會變成0*/

    /*再來是 "+ - * / %"這五個基本的運算子 %是求餘數 */

    /*這邊是if 簡單的判斷 基本上和python差不了太遠*/
    if (a < b)
        printf("b is bigger\n");

    /*遞增遞減運算子*/
    int num = 3;
    printf("num = %d", num);
    printf(", ++num = %d", ++num); /*先加再敘述*/
    printf("num = %d\n", num);

    printf("num = %d", num);
    printf(", num++ = %d", num++); /*先敘述再加*/
    printf("num = %d\n", num);

    /*
    資料型態順序:
    表示範圍較小的型態轉換成表示範圍較大的型態
    double、float、long、int、short，最後才是char
    example: float+int >>> int--->float
    */

    system("pause");
    return 0;
}