void main() {
    Scanner ruben = new Scanner(System.in);

    System.out.println("Numero de filas:");
    int n = ruben.nextInt();

    System.out.println("Numero de columnas:");
    int m = ruben.nextInt();

    int[][] matriz = new int[n][m];
    int[][] resultados = new int[3][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.println("Valor de [" + i + "][" + j + "]:");
            matriz[i][j] = ruben.nextInt();
        }
    }

    for (int j = 0; j < m; j++) {
        resultados[1][j] = matriz[0][j];
        resultados[2][j] = matriz[0][j];

        for (int i = 0; i < n; i++) {
            resultados[0][j] = resultados[0][j] + matriz[i][j];

            if (matriz[i][j] > resultados[1][j]) {
                resultados[1][j] = matriz[i][j];
            }

            if (matriz[i][j] < resultados[2][j]) {
                resultados[2][j] = matriz[i][j];
            }
        }
    }

    System.out.println("Filas: suma, maximo y minimo:");

    for (int i = 0; i < resultados.length; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(resultados[i][j] + " ");
        }
        System.out.println();
    }

    ruben.close();
}