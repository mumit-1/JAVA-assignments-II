#include <stdio.h>

int main() {
    int arr[6] = {2, 1, 9, 5, 3, 6};
    int i;
    int len = sizeof(arr) / sizeof(arr[0]);  // 6
    for (i = 0; i < len / 2; i++) {
        len = len - 1;
        arr[i] = arr[len];

    }
    for (i = 0; i < 6; i++) {
        printf("%d,", arr[i]);
    }

    return 0;
}