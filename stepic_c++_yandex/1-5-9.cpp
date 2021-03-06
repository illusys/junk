// Последовательность состоит из натуральных чисел и завершается числом 0. Определите значение наибольшего элемента последовательности.
// Формат входных данных
// Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит, а служит как признак ее окончания).
// Формат выходных данных
// Выведите ответ на задачу.
// Sample Input:
// 1
// 7
// 9
// 0
// Sample Output:
// 9

#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int x;
    cin >> x;
    int Max = x;
    while (x) {
        Max = max(Max,x);
        cin >> x;
    }
    cout << Max;
    return 0;
}