#define _CRT_SECURE_NO_WARNINGS
#define _CRT_NONSTDC_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void Calculator(void);
void Addition(int, int);
void Subtraction(int, int);
void Multiplication(int, int);
void Division(int, int);
void DivisionRemainder(int, int);
void question();
void exit();


int main()
{
	printf("\n\t***Welcome to Victory Calculator***\n");
	Calculator();
	question();
	exit(0);


}

void Calculator(void)
{
	int num1, num2, options;
	float Div;
	char input;

	printf("\nPlease Enter the 1st number: ");
	scanf("%d", &num1);
	fflush(stdin);

	if (num1 < -32767 || num1 > 32767)
	{
		printf("\nThe Entered Number is out of the Range (The range is from -32,767 to 32,767)..\nYou can try again\n\nPlease Enter the 1st number: ");
		scanf("%d", &num1);
		fflush(stdin);

	}
	printf("\nPlease Enter the 2nd number: ");
	scanf("%d", &num2);
	fflush(stdin);

	if (num2 < -32767 || num2 > 32767)
	{
		printf("\nThe Entered Number is out of the Range (The range is from -32,767 to 32,767)..\nYou can try again\n\nPlease Enter the 2nd number: ");
		scanf("%d", &num2);
		fflush(stdin);

	}
	printf("\nPlease choose the operation: \n\t1-Addition\n\t2-Subtraction\n\t3-Multiplication\n\t4-Division\n\t5-Division Remainder\n\t6-Exit\n\nYour Choice: ");
	scanf("%d", &options);

	switch (options)
	{
	case 1:
		Addition(num1, num2);
		break;

	case 2:
		Subtraction(num1, num2);
		break;

	case 3:
		Multiplication(num1, num2);
		break;

	case 4:
		Division(num1, num2);
		break;

	case 5:
		DivisionRemainder(num1, num2);
		break;

	case 6:
		printf("You chose to Exit from the Calculator...Hope you enjoyed it.Bye\n");
		_exit(0);
		break;

	default:
		printf("Wrong choice! Please select an operation from 1 To 5 or 6 to exit");
		break;
	}
}

void Addition(x, y)
{
	int add;
	add = x + y;
		printf("\n%d + %d = %d", x, y, add);


}

void Subtraction(x, y)
{
	int sub;
	sub = x - y;
	printf("\n%d - %d = %d", x, y, sub);
}

void Multiplication(x, y)
{
	int Mul;
	Mul = x * y;
	printf("\n %d x %d = %d", x, y, Mul);

}

void Division(x, y)
{

	float Div;
	Div = x / y;
	if (y != 0)
	{
		printf("\n%d / %d = %0.2f", x, y, Div);
	}
	else
	{
		printf("Division by \"ZERO\" is not allowed !!!");

	}
}

void DivisionRemainder(x, y)
{
	int rem;
	rem = x % y;
	printf("\n The Result is: %d", rem);

}

void question()
{
	char input;
	printf("\n\nDo you want to continue ? (Y / N)\nYour Choice: ");
	scanf("%s", &input);
	fflush(stdin);


	if (input == 'Y' || input == 'y')
	{
		return Calculator();
	}
	else if (input == 'N' || input == 'n')
	{
		printf("You chose to Exit from the Calculator...Hope you enjoyed it.Bye\n");
		_exit;
	}
	else
	{
		printf("Invlid inputs.");
		question();
	}

}

void exit()
{
	_exit;
}



