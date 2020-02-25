package com.oa;

public class FillMatrix {
    //https://rosettacode.org/wiki/Magic_squares_of_singly_even_order#Java
    //https://leetcode.com/discuss/interview-question/341295/Google-or-Online-Assessment-2019-or-Fill-Matrix
    //https://www.geeksforgeeks.org/magic-squar
    //https://www.geeksforgeeks.org/magic-square-even-order/

    // No solution found yet

    /*
    vector<vector<int>> fillMatrix(int n) {
    vector<vector<int>> magicSquare(n, vector<int>(n, 0));

    if (n % 2 == 1) {
        // Initialize position for 1
        int i = n/2;
        int j = n-1;

        // One by one put all values in magic square
        for (int num = 1; num <= n*n; )
        {
            if (i == -1 && j == n) //3rd condition
            {
                j = n-2;
                i = 0;
            }
            else
            {
                // 1st condition helper if next number
                // goes to out of square's right side
                if (j == n)
                    j = 0;

                // 1st condition helper if next number
                // is goes to out of square's upper side
                if (i < 0)
                    i = n - 1;
            }
            if (magicSquare[i][j] != 0) //2nd condition
            {
                j -= 2;
                i++;
                continue;
            }
            else
                magicSquare[i][j] = num++; //set number

            j++; i--; //1st condition
        }

        // Print magic square
        cout<<"The Magic Square for n="<<n<<":\nSum of "
        "each row or column "<<n*(n*n+1)/2<<":\n\n";
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
                cout<<magicSquare[i][j]<<" ";
            cout<<endl;
        }
        cout << endl << endl;
    }
    else {
        // filling matrix with its count value
        // starting from 1;
        int i, j;
        for ( i = 0; i < n; i++)
            for ( j = 0; j < n; j++)
                magicSquare[i][j] = (n*i) + j + 1;

        // change value of Array elements
        // at fix location as per rule
        // (n*n+1)-arr[i][j]
        // Top Left corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 0; i < n/4; i++)
            for ( j = 0; j < n/4; j++)
                magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

        // Top Right corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 0; i < n/4; i++)
            for ( j = 3 * (n/4); j < n; j++)
                magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

         // Bottom Left corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 3 * n/4; i < n; i++)
            for ( j = 0; j < n/4; j++)
                magicSquare[i][j] = (n*n+1) - magicSquare[i][j];

        // Bottom Right corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 3 * n/4; i < n; i++)
            for ( j = 3 * n/4; j < n; j++)
                magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

        // Centre of Matrix (order (n/2)*(n/2))
        for ( i = n/4; i < 3 * n/4; i++)
            for ( j = n/4; j < 3 * n/4; j++)
                magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];

        // Print magic square
        cout<<"The Magic Square for n="<<n<<":\nSum of "
        "each row or column "<<n*(n*n+1)/2<<":\n\n";
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
                cout<<magicSquare[i][j]<<" ";
            cout<<endl;
        }
        cout << endl << endl;
    }
    return magicSquare;
}


int main() {
    fillMatrix(3);
    fillMatrix(4);
    fillMatrix(5);
    fillMatrix(7);
}
     */
}
