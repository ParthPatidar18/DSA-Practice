// #include<stdio.h>
// int main(){
//     int arr[5];  // declare an array of size 5

    // printf("Enter 5 integers:\n");

    // // taking input
    // for(int i = 0; i < 7; i++) {
    //     printf("Element %d: ", i + 1);
    //     scanf("%d", &arr[i]);
    // }

    // // displaying the array
    // printf("\nYou entered:\n");
    // for(int i = 0; i < 5; i++) {
    //     printf("%d ", arr[i]);
    // }

//     return 0;
// }




// #include<stdio.h>
// int main(){
//   int * ptr;
//   printf("%d",ptr);
//   printf("%d",&ptr);
//     return 0;
// }


// #include<stdio.h>
// int main(){
//   int * ptr;
//   printf("enter element:");
//   scanf("%d",ptr);
//   printf("%d",*ptr);
//     return 0;
// }  

// #include<stdio.h>
// int main(){
//   int * ptr;
  
//   printf("%p",ptr++);
//     printf("%p",ptr++);
//       printf("%p",ptr++);
//         printf("%p",ptr++);
//     return 0;
// }  



#include<stdio.h>
int main(){
  int * ptr=malloc(5);
 
  printf("%p",ptr++);
    return 0;
}  