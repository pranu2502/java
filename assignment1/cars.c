#include<stdio.h>
#include<stdlib.h>

struct car{
    int type;
    float efficiency;
    float fuelLeft;
    float range;
};

int main()
{
    int n;
    int batteryEfficiency = 100;
    scanf("%d",&n);
    struct car array[n];
    for(int i = 0;i<n;i++)
    {
        scanf("%d%f%f",&array[i].type,&array[i].efficiency,&array[i].fuelLeft);
        if(array[i].type == 1)
        {
            array[i].range = array[i].efficiency*array[i].fuelLeft;
        }
        else
        {
            array[i].range = ((batteryEfficiency*array[i].fuelLeft*1000)/100)/array[i].efficiency;
        }
        
    }
    for(int i = n-1;i>=0;i--)
    {
        printf("Car %d: range = %.2f",i+1,array[i].range);
        printf("\n");
    }
    
}



