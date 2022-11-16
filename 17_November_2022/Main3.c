#include<stdio.h>
int main()
{
    // 1. Take an integer value from the user.
    // 2. Print whether the value is divisible by 3 and 5
    int x;
    printf("Please enter any integer value: ");
    scanf("%d" , &x);
    if (x % 3 == 0)
        printf("\nThe value is divisible by 3\n");
    if (x % 5 == 0)
        printf("\nThe value is divisible by 5\n");
    if ((x % 3 == 0) && (x % 5 == 0))
        printf("\nThe value is divisible by 3 and 5 both\n");
}