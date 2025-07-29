// //first pattern
// #include<stdio.h>
// int main(){

//     int n=6;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             printf("%d",j);
//         }
//         printf("\n");
//     }
//         return 0;
// }






// //second pattern

// #include<stdio.h>
// int main(){

//     int n=6;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf("%d",j);
//         }
//         printf("\n");
//     }
//         return 0;
// }



// //third pattern
// #include<stdio.h>
// int main(){

//     int n=6;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             printf(" ");
//         } 
//         for(int k=1;k<=i;k++){
//             printf("%d",k);
//         }
//     printf("\n");
//     }
//         return 0;
// }



//fourth pattern
#include<stdio.h>
int main(){

    int n=7;
    int size=2*n-1;
    for(int i=1;i<=size;i++){
        for(int j=1;size;j>=i+1;j++){
            printf(" ");
        } 
        for(int k=1;k<=i;k++){
            printf("%d",k);
        }
    printf("\n");
    }
        return 0;
}