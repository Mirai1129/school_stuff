/*這是標頭*/
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int Num1 = 2;        /*宣告Num這個變數是int 並等於2*/
    double Num2 = 1.222; /*double等同於float 但double位元數比較大 東西可以塞比較多*/
    unsigned int Num;    /*unsigned就是沒有負數*/
    float Sum;
    Sum = (float)Num1;       /*資料型態轉換用法 也能直接寫進printf*/
    char TheWord1, TheWord2; /*宣告可以之後在設定變數的值*/
    TheWord1 = 'A';
    TheWord2 = '2';             /*char只能設定一個字元!!!*/
    char Sentence1[] = "hello"; /*設定字串時要用[] 而且後面的值要用""*/
    char *Sentence2 = "hello";
    /*句子補充 https://www.cnblogs.com/oomusou/archive/2007/03/04/663234.html*/

    printf("%d--->This num is big\n", Num1);                                                              /*這是print*/
    printf("%f--->This num is small\n", Num2);                                                            /*Num2是浮點數，所以要用%f %e是指數形式*/
    printf("the variable 'TheWord' = %c\n", TheWord1);                                                    /*輸出文字是c*/
    printf("the ASCII for the words 1 & 2---> %d, %d\n", TheWord1, TheWord2);                             /*如果換成%d會變成ASCII*/
    printf("The sentence is--->%s\n", Sentence1);                                                         /*句子是s*/
    printf("sizeof(Sentence1) > sizeof(Sentence2) ---> %d > %d\n", sizeof(Sentence1), sizeof(Sentence2)); /*查這個字佔記憶體多少ˋ*/
    system("pause");
    return 0;
}